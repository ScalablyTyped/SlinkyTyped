package typingsSlinky.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/less/less.js/blob/master/lib/less/import-manager.js#L10
@js.native
trait RootFileInfo extends js.Object {
  /** path to the current file, absolute */
  var currentDirectory: String = js.native
  /** absolute path to the entry file */
  var entryPath: String = js.native
  /** full resolved filename of current file */
  var filename: String = js.native
  /** whether the file should not be output and only output parts that are referenced */
  var reference: Boolean = js.native
  var relativeUrls: Boolean = js.native
  /** whether to adjust URL's to be relative */
  var rewriteUrls: js.UndefOr[Boolean] = js.native
  /** filename of the base file */
  var rootFilename: String = js.native
  /** path to append to normal URLs for this node */
  var rootpath: String = js.native
}

object RootFileInfo {
  @scala.inline
  def apply(
    currentDirectory: String,
    entryPath: String,
    filename: String,
    reference: Boolean,
    relativeUrls: Boolean,
    rootFilename: String,
    rootpath: String
  ): RootFileInfo = {
    val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relativeUrls = relativeUrls.asInstanceOf[js.Any], rootFilename = rootFilename.asInstanceOf[js.Any], rootpath = rootpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootFileInfo]
  }
  @scala.inline
  implicit class RootFileInfoOps[Self <: RootFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewriteUrls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteUrls")(js.undefined)
        ret
    }
  }
  
}

