package typingsSlinky.awsSdkClientCodecommitNode.typesFolderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  /**
    * <p>The fully-qualified path of the folder in the repository.</p>
    */
  var absolutePath: js.UndefOr[String] = js.native
  /**
    * <p>The relative path of the specified folder from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.native
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
    */
  var treeId: js.UndefOr[String] = js.native
}

object Folder {
  @scala.inline
  def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(js.undefined)
        ret
    }
  }
  
}

