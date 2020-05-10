package typingsSlinky.awsSdkClientCodecommitNode.typesSymbolicLinkMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolicLink extends js.Object {
  /**
    * <p>The fully-qualified path to the folder that contains the symbolic link.</p>
    */
  var absolutePath: js.UndefOr[String] = js.native
  /**
    * <p>The blob ID that contains the information about the symbolic link.</p>
    */
  var blobId: js.UndefOr[String] = js.native
  /**
    * <p>The file mode permissions of the blob that cotains information about the symbolic link.</p>
    */
  var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.native
  /**
    * <p>The relative path of the symbolic link from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.native
}

object SymbolicLink {
  @scala.inline
  def apply(): SymbolicLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolicLink]
  }
  @scala.inline
  implicit class SymbolicLinkOps[Self <: SymbolicLink] (val x: Self) extends AnyVal {
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
    def withBlobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(js.undefined)
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
  }
  
}

