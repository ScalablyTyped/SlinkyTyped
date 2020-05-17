package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidpublisher.anon.EditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApksResource extends js.Object {
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to
    * enterprises using Google Play for Work whose application is configured to restrict distribution to the enterprise domain.
    */
  def addexternallyhosted(request: EditId): Request[ApksAddExternallyHostedResponse] = js.native
  def list(request: EditId): Request[ApksListResponse] = js.native
  def upload(request: EditId): Request[Apk] = js.native
}

object ApksResource {
  @scala.inline
  def apply(
    addexternallyhosted: EditId => Request[ApksAddExternallyHostedResponse],
    list: EditId => Request[ApksListResponse],
    upload: EditId => Request[Apk]
  ): ApksResource = {
    val __obj = js.Dynamic.literal(addexternallyhosted = js.Any.fromFunction1(addexternallyhosted), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ApksResource]
  }
  @scala.inline
  implicit class ApksResourceOps[Self <: ApksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddexternallyhosted(value: EditId => Request[ApksAddExternallyHostedResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addexternallyhosted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: EditId => Request[ApksListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpload(value: EditId => Request[Apk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

