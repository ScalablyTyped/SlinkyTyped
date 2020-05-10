package typingsSlinky.gapiClientDlp.gapi.client.dlp

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDlp.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootCategoriesResource extends js.Object {
  var infoTypes: InfoTypesResource = js.native
  /** Returns the list of root categories of sensitive information. */
  def list(request: AnonFields): Request_[GooglePrivacyDlpV2beta1ListRootCategoriesResponse] = js.native
}

object RootCategoriesResource {
  @scala.inline
  def apply(
    infoTypes: InfoTypesResource,
    list: AnonFields => Request_[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
  ): RootCategoriesResource = {
    val __obj = js.Dynamic.literal(infoTypes = infoTypes.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RootCategoriesResource]
  }
  @scala.inline
  implicit class RootCategoriesResourceOps[Self <: RootCategoriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoTypes(value: InfoTypesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

