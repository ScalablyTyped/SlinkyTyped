package typingsSlinky.gapiClientDlp.gapi.client.dlp

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDlp.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoTypesResource extends js.Object {
  /** Returns sensitive information types for given category. */
  def list(request: AnonCallback): Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse] = js.native
}

object InfoTypesResource {
  @scala.inline
  def apply(list: AnonCallback => Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse]): InfoTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InfoTypesResource]
  }
  @scala.inline
  implicit class InfoTypesResourceOps[Self <: InfoTypesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonCallback => Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

