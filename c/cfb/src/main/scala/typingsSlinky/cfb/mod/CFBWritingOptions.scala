package typingsSlinky.cfb.mod

import typingsSlinky.cfb.cfbStrings.cfb
import typingsSlinky.cfb.cfbStrings.zip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFBWritingOptions extends CFBCommonOptions {
  /** Enable compression (ZIP only) */
  var compression: js.UndefOr[Boolean] = js.native
  /** Output file type */
  var fileType: js.UndefOr[cfb | zip] = js.native
  /** Override default root entry name (CFB only) */
  var root: js.UndefOr[String] = js.native
}

object CFBWritingOptions {
  @scala.inline
  def apply(): CFBWritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFBWritingOptions]
  }
  @scala.inline
  implicit class CFBWritingOptionsOps[Self <: CFBWritingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: cfb | zip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

