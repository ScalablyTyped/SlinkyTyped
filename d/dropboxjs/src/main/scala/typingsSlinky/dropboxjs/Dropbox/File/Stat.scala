package typingsSlinky.dropboxjs.Dropbox.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var clientModifiedAt: js.Date = js.native
  var contentHash: String = js.native
  var hasThumbnail: Boolean = js.native
  var humanSize: String = js.native
  var inAppFolder: Boolean = js.native
  var isFile: Boolean = js.native
  var isFolder: Boolean = js.native
  var isRemoved: Boolean = js.native
  var mimeType: String = js.native
  var modifiedAt: js.Date = js.native
  var name: String = js.native
  var path: String = js.native
  var size: Double = js.native
  var typeIcon: String = js.native
  var versionTag: String = js.native
  def toJSON(): js.Object = js.native
}

object Stat {
  @scala.inline
  def apply(
    clientModifiedAt: js.Date,
    contentHash: String,
    hasThumbnail: Boolean,
    humanSize: String,
    inAppFolder: Boolean,
    isFile: Boolean,
    isFolder: Boolean,
    isRemoved: Boolean,
    mimeType: String,
    modifiedAt: js.Date,
    name: String,
    path: String,
    size: Double,
    toJSON: () => js.Object,
    typeIcon: String,
    versionTag: String
  ): Stat = {
    val __obj = js.Dynamic.literal(clientModifiedAt = clientModifiedAt.asInstanceOf[js.Any], contentHash = contentHash.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], humanSize = humanSize.asInstanceOf[js.Any], inAppFolder = inAppFolder.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), typeIcon = typeIcon.asInstanceOf[js.Any], versionTag = versionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientModifiedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientModifiedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAppFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAppFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

