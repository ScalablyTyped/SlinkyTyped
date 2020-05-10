package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRootFoldersResponse extends js.Object {
  /**
    * The user's special folders.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.native
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object DescribeRootFoldersResponse {
  @scala.inline
  def apply(): DescribeRootFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRootFoldersResponse]
  }
  @scala.inline
  implicit class DescribeRootFoldersResponseOps[Self <: DescribeRootFoldersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

