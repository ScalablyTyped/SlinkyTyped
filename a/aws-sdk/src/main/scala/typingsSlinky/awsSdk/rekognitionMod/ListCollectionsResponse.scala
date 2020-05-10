package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCollectionsResponse extends js.Object {
  /**
    * An array of collection IDs.
    */
  var CollectionIds: js.UndefOr[CollectionIdList] = js.native
  /**
    * Version numbers of the face detection models associated with the collections in the array CollectionIds. For example, the value of FaceModelVersions[2] is the version number for the face detection model used by the collection in CollectionId[2].
    */
  var FaceModelVersions: js.UndefOr[FaceModelVersionList] = js.native
  /**
    * If the result is truncated, the response provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListCollectionsResponse {
  @scala.inline
  def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  @scala.inline
  implicit class ListCollectionsResponseOps[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionIds(value: CollectionIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceModelVersions(value: FaceModelVersionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceModelVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceModelVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceModelVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

