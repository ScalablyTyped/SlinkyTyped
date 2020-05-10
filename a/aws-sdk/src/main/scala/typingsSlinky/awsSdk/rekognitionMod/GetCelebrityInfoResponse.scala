package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCelebrityInfoResponse extends js.Object {
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Urls] = js.native
}

object GetCelebrityInfoResponse {
  @scala.inline
  def apply(): GetCelebrityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCelebrityInfoResponse]
  }
  @scala.inline
  implicit class GetCelebrityInfoResponseOps[Self <: GetCelebrityInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: Urls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urls")(js.undefined)
        ret
    }
  }
  
}

