package typingsSlinky.gulpChanged.mod

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /**
    * The working directory the folder is relative to.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Extension of the destination files.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * Function that determines whether the source file is different from the destination file.
    * @default changed.compareLastModifiedTime
    */
  var hasChanged: js.UndefOr[IComparator] = js.native
  /**
    * Function to transform the path to the destination file. Should return the absolute path to the (renamed) destination file.
    */
  var transformPath: js.UndefOr[js.Function1[/* destPath */ String, String]] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChanged(
      value: (/* stream */ Transform, /* callback */ js.Function, /* sourceFile */ File, /* destPath */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanged")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHasChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPath(value: /* destPath */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPath")(js.undefined)
        ret
    }
  }
  
}

