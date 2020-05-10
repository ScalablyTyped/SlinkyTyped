package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFolderContentsResponse extends js.Object {
  /**
    * The documents in the specified folder.
    */
  var Documents: js.UndefOr[DocumentMetadataList] = js.native
  /**
    * The subfolders in the specified folder.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object DescribeFolderContentsResponse {
  @scala.inline
  def apply(): DescribeFolderContentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFolderContentsResponse]
  }
  @scala.inline
  implicit class DescribeFolderContentsResponseOps[Self <: DescribeFolderContentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: DocumentMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documents")(js.undefined)
        ret
    }
    @scala.inline
    def withFolders(value: FolderMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folders")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: PageMarkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

