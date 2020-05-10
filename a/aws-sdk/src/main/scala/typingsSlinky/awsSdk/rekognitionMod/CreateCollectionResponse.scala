package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectionResponse extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the collection. You can use this to manage permissions on your resources. 
    */
  var CollectionArn: js.UndefOr[String] = js.native
  /**
    * Version number of the face detection model associated with the collection you are creating.
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * HTTP status code indicating the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.native
}

object CreateCollectionResponse {
  @scala.inline
  def apply(): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionResponse]
  }
  @scala.inline
  implicit class CreateCollectionResponseOps[Self <: CreateCollectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceModelVersion")(js.undefined)
        ret
    }
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

