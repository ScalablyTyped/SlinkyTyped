package typingsSlinky.appBuilderLib.macOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.UDBZ
import typingsSlinky.appBuilderLib.appBuilderLibStrings.UDCO
import typingsSlinky.appBuilderLib.appBuilderLibStrings.UDRO
import typingsSlinky.appBuilderLib.appBuilderLibStrings.UDRW
import typingsSlinky.appBuilderLib.appBuilderLibStrings.UDZO
import typingsSlinky.appBuilderLib.appBuilderLibStrings.ULFO
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DmgOptions extends TargetSpecificOptions {
  /**
    * The path to background image (default: `build/background.tiff` or `build/background.png` if exists). The resolution of this file determines the resolution of the installer window.
    * If background is not specified, use `window.size`. Default locations expected background size to be 540x380.
    * @see [DMG with Retina background support](http://stackoverflow.com/a/11204769/1910191).
    */
  var background: js.UndefOr[String | Null] = js.native
  /**
    * The background color (accepts css colors). Defaults to `#ffffff` (white) if no background image.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.native
  /**
    * The content — to customize icon locations. The x and y coordinates refer to the position of the **center** of the icon (at 1x scale), and do not take the label into account.
    */
  var contents: js.UndefOr[js.Array[DmgContent]] = js.native
  /**
    * The disk image format. `ULFO` (lzfse-compressed image (OS X 10.11+ only)).
    * @default UDZO
    */
  var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.native
  /**
    * The path to DMG icon (volume icon), which will be shown when mounted, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to the application icon (`build/icon.icns`).
    */
  var icon: js.UndefOr[String | Null] = js.native
  /**
    * The size of all the icons inside the DMG.
    * @default 80
    */
  val iconSize: js.UndefOr[Double | Null] = js.native
  /**
    * The size of all the icon texts inside the DMG.
    * @default 12
    */
  val iconTextSize: js.UndefOr[Double | Null] = js.native
  /**
    * Whether to create internet-enabled disk image (when it is downloaded using a browser it will automatically decompress the image, put the application on the desktop, unmount and remove the disk image file).
    * @default false
    */
  val internetEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether to sign the DMG or not. Signing is not required and will lead to unwanted errors in combination with notarization requirements.
    * @default false
    */
  val sign: js.UndefOr[Boolean] = js.native
  /**
    * The title of the produced DMG, which will be shown when mounted (volume name).
    *
    * Macro `${productName}`, `${version}` and `${name}` are supported.
    * @default ${productName} ${version}
    */
  val title: js.UndefOr[String | Null] = js.native
  /**
    * The DMG window position and size. With y co-ordinates running from bottom to top.
    *
    * The Finder makes sure that the window will be on the user’s display, so if you want your window at the top left of the display you could use `"x": 0, "y": 100000` as the x, y co-ordinates.
    * It is not to be possible to position the window relative to the [top left](https://github.com/electron-userland/electron-builder/issues/3990#issuecomment-512960957) or relative to the center of the user’s screen.
    */
  var window: js.UndefOr[DmgWindow] = js.native
  /**
    * @private
    * @default true
    */
  var writeUpdateInfo: js.UndefOr[Boolean] = js.native
}

object DmgOptions {
  @scala.inline
  def apply(): DmgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmgOptions]
  }
  @scala.inline
  implicit class DmgOptionsOps[Self <: DmgOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(null)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(null)
        ret
    }
    @scala.inline
    def withContents(value: js.Array[DmgContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(null)
        ret
    }
    @scala.inline
    def withIconTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTextSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTextSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconTextSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTextSize")(null)
        ret
    }
    @scala.inline
    def withInternetEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternetEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
    @scala.inline
    def withWindow(value: DmgWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteUpdateInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeUpdateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeUpdateInfo")(js.undefined)
        ret
    }
  }
  
}

