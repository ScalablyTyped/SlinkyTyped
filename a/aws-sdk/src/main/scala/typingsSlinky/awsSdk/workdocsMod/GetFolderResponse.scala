package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderResponse extends js.Object {
  /**
    * The custom metadata on the folder.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.native
}

object GetFolderResponse {
  @scala.inline
  def apply(): GetFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFolderResponse]
  }
  @scala.inline
  implicit class GetFolderResponseOps[Self <: GetFolderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMetadata(value: CustomMetadataMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: FolderMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
  }
  
}

