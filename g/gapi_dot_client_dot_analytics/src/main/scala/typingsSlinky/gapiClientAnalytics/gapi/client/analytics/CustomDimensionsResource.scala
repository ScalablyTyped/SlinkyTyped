package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonCustomDimensionId
import typingsSlinky.gapiClientAnalytics.AnonIgnoreCustomDataSourceLinks
import typingsSlinky.gapiClientAnalytics.AnonPrettyPrint
import typingsSlinky.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: AnonCustomDimensionId): Request_[CustomDimension] = js.native
  /** Create a new custom dimension. */
  def insert(request: AnonQuotaUser): Request_[CustomDimension] = js.native
  /** Lists custom dimensions to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomDimensions] = js.native
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: AnonIgnoreCustomDataSourceLinks): Request_[CustomDimension] = js.native
  /** Updates an existing custom dimension. */
  def update(request: AnonIgnoreCustomDataSourceLinks): Request_[CustomDimension] = js.native
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: AnonCustomDimensionId => Request_[CustomDimension],
    insert: AnonQuotaUser => Request_[CustomDimension],
    list: AnonPrettyPrint => Request_[CustomDimensions],
    patch: AnonIgnoreCustomDataSourceLinks => Request_[CustomDimension],
    update: AnonIgnoreCustomDataSourceLinks => Request_[CustomDimension]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomDimensionsResource]
  }
  @scala.inline
  implicit class CustomDimensionsResourceOps[Self <: CustomDimensionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonCustomDimensionId => Request_[CustomDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[CustomDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPrettyPrint => Request_[CustomDimensions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonIgnoreCustomDataSourceLinks => Request_[CustomDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonIgnoreCustomDataSourceLinks => Request_[CustomDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

