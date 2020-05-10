package typingsSlinky.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicEditorOptions extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var clientSideStorage: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[js.Any] = js.native
  var file: js.UndefOr[AnonAutoSave] = js.native
  var focusOnLoad: js.UndefOr[Boolean] = js.native
  var localStorageName: js.UndefOr[String] = js.native
  var parser: js.UndefOr[js.Any] = js.native
  var shortcut: js.UndefOr[AnonFullscreen] = js.native
  var string: js.UndefOr[AnonToggleEdit] = js.native
  var textarea: js.UndefOr[js.Any] = js.native
  var theme: js.UndefOr[AnonBase] = js.native
  var useNativeFullsreen: js.UndefOr[Boolean] = js.native
}

object EpicEditorOptions {
  @scala.inline
  def apply(): EpicEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EpicEditorOptions]
  }
  @scala.inline
  implicit class EpicEditorOptionsOps[Self <: EpicEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSideStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSideStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSideStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSideStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: AnonAutoSave): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorageName")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcut(value: AnonFullscreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: AnonToggleEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withTextarea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: AnonBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeFullsreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeFullsreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeFullsreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeFullsreen")(js.undefined)
        ret
    }
  }
  
}

