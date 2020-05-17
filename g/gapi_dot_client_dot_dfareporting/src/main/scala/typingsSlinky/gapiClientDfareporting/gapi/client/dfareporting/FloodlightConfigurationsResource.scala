package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.AltFields
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: Fields): Request[FloodlightConfiguration] = js.native
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: AltFields): Request[FloodlightConfigurationsListResponse] = js.native
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightConfiguration] = js.native
  /** Updates an existing floodlight configuration. */
  def update(request: Key): Request[FloodlightConfiguration] = js.native
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: Fields => Request[FloodlightConfiguration],
    list: AltFields => Request[FloodlightConfigurationsListResponse],
    patch: Fields => Request[FloodlightConfiguration],
    update: Key => Request[FloodlightConfiguration]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
  @scala.inline
  implicit class FloodlightConfigurationsResourceOps[Self <: FloodlightConfigurationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[FloodlightConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AltFields => Request[FloodlightConfigurationsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[FloodlightConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[FloodlightConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

