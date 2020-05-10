package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApksResource extends js.Object {
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to
    * enterprises using Google Play for Work whose application is configured to restrict distribution to the enterprise domain.
    */
  def addexternallyhosted(request: AnonEditId): Request_[ApksAddExternallyHostedResponse] = js.native
  def list(request: AnonEditId): Request_[ApksListResponse] = js.native
  def upload(request: AnonEditId): Request_[Apk] = js.native
}

object ApksResource {
  @scala.inline
  def apply(
    addexternallyhosted: AnonEditId => Request_[ApksAddExternallyHostedResponse],
    list: AnonEditId => Request_[ApksListResponse],
    upload: AnonEditId => Request_[Apk]
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
    def withAddexternallyhosted(value: AnonEditId => Request_[ApksAddExternallyHostedResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addexternallyhosted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonEditId => Request_[ApksListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpload(value: AnonEditId => Request_[Apk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

