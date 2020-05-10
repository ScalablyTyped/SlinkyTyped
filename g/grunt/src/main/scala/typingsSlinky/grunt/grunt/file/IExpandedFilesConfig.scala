package typingsSlinky.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are valid for compact-format
  */
@js.native
trait IExpandedFilesConfig extends IFilesConfig {
  /**
    * Replace any existing extension with this value in generated {@link IExpandedFilesConfig.dest} paths.
    */
  var ext: js.UndefOr[String] = js.native
  /**
    * Remove all path parts from generated {@link IExpandedFilesConfig.dest} paths.
    */
  var flatten: js.UndefOr[Boolean] = js.native
  /**
    * This function is called for each matched src file, (after extension renaming and flattening).
    * The {@link IExpandedFilesConfig.dest} and matched {@link IExpandedFilesConfig.src} path are passed in,
    * and this function must return a new dest value.
    * If the same dest is returned more than once, each src which used it will be added to an array of sources for it.
    */
  var rename: js.UndefOr[js.Function] = js.native
}

object IExpandedFilesConfig {
  @scala.inline
  def apply(): IExpandedFilesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedFilesConfig]
  }
  @scala.inline
  implicit class IExpandedFilesConfigOps[Self <: IExpandedFilesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatten(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
  }
  
}

