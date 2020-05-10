package typingsSlinky.gulpZip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpZipOptions extends js.Object {
  /**
    * Compress
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the modification timestamp for all files added to the archive.
    *
    * Tip: Setting it to the same value across executions enables you to create stable archives
    * that change only when the contents of their entries change, regardless of whether those
    * entries were "touched" or regenerated.
    *
    * @default undefined
    */
  var modifiedTime: js.UndefOr[js.Date] = js.native
}

object GulpZipOptions {
  @scala.inline
  def apply(): GulpZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpZipOptions]
  }
  @scala.inline
  implicit class GulpZipOptionsOps[Self <: GulpZipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTime")(js.undefined)
        ret
    }
  }
  
}

