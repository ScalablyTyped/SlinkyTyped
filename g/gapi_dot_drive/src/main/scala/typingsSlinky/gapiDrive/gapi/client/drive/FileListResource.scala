package typingsSlinky.gapiDrive.gapi.client.drive

import typingsSlinky.gapiDrive.gapiDriveStrings.driveNumbersignfileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileListResource extends js.Object {
  var etag: String = js.native
  var incompleteSearch: Boolean = js.native
  var items: js.Array[FileResource] = js.native
  var kind: driveNumbersignfileList = js.native
  var nextLink: String = js.native
  var nextPageToken: String = js.native
  var selfLink: String = js.native
}

object FileListResource {
  @scala.inline
  def apply(
    etag: String,
    incompleteSearch: Boolean,
    items: js.Array[FileResource],
    kind: driveNumbersignfileList,
    nextLink: String,
    nextPageToken: String,
    selfLink: String
  ): FileListResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], incompleteSearch = incompleteSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileListResource]
  }
  @scala.inline
  implicit class FileListResourceOps[Self <: FileListResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncompleteSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompleteSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[FileResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: driveNumbersignfileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

