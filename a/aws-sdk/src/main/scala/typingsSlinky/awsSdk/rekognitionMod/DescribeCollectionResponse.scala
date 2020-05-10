package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCollectionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the collection.
    */
  var CollectionARN: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds since the Unix epoch time until the creation of the collection. The Unix epoch time is 00:00:00 Coordinated Universal Time (UTC), Thursday, 1 January 1970.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The number of faces that are indexed into the collection. To index faces into a collection, use IndexFaces.
    */
  var FaceCount: js.UndefOr[ULong] = js.native
  /**
    * The version of the face model that's used by the collection for face detection. For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
}

object DescribeCollectionResponse {
  @scala.inline
  def apply(): DescribeCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCollectionResponse]
  }
  @scala.inline
  implicit class DescribeCollectionResponseOps[Self <: DescribeCollectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionARN")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceCount(value: ULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceCount")(js.undefined)
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
  }
  
}

