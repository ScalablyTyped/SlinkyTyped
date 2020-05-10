package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCollectionResponse extends js.Object {
  /**
    * HTTP status code that indicates the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.native
}

object DeleteCollectionResponse {
  @scala.inline
  def apply(): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  @scala.inline
  implicit class DeleteCollectionResponseOps[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
  }
  
}

