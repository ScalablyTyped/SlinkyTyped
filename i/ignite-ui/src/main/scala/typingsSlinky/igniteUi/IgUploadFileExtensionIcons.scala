package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgUploadFileExtensionIcons
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Css classes which sets icon.
  	 */
  var css: js.UndefOr[String] = js.native
  /**
  	 * Default icons when the file extension is not found. It is taken only the first item which have def set to true, other are ignored.
  	 */
  var `def`: js.UndefOr[Boolean] = js.native
  /**
  	 * Array of string for file extensions
  	 */
  var ext: js.UndefOr[js.Array[_]] = js.native
}

object IgUploadFileExtensionIcons {
  @scala.inline
  def apply(): IgUploadFileExtensionIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUploadFileExtensionIcons]
  }
  @scala.inline
  implicit class IgUploadFileExtensionIconsOps[Self <: IgUploadFileExtensionIcons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: js.Array[_]): Self = {
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
  }
  
}

