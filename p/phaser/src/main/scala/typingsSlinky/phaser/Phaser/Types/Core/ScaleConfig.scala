package typingsSlinky.phaser.Phaser.Types.Core

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.phaser.Phaser.Scale.CenterType
import typingsSlinky.phaser.Phaser.Scale.ScaleModeType
import typingsSlinky.phaser.Phaser.Scale.ZoomType
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleConfig extends js.Object {
  /**
    * Automatically center the canvas within the parent?
    */
  var autoCenter: js.UndefOr[CenterType] = js.native
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  var autoRound: js.UndefOr[Boolean] = js.native
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent and/or document body to be 100%?
    */
  var expandParent: js.UndefOr[Boolean] = js.native
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  var fullscreenTarget: js.UndefOr[HTMLElement | String] = js.native
  /**
    * The base height of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var height: js.UndefOr[integer | String] = js.native
  /**
    * The maximum width the canvas can be scaled up to.
    */
  var max: js.UndefOr[WidthHeight] = js.native
  /**
    * The minimum width and height the canvas can be scaled down to.
    */
  var min: js.UndefOr[WidthHeight] = js.native
  /**
    * The scale mode.
    */
  var mode: js.UndefOr[ScaleModeType] = js.native
  /**
    * The DOM element that will contain the game canvas, or its `id`. If undefined, or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
    */
  var parent: js.UndefOr[HTMLElement | String] = js.native
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  var resizeInterval: js.UndefOr[integer] = js.native
  /**
    * The rendering resolution of the canvas. This is reserved for future use and is currently ignored.
    */
  var resolution: js.UndefOr[Double] = js.native
  /**
    * The base width of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var width: js.UndefOr[integer | String] = js.native
  /**
    * The zoom value of the game canvas.
    */
  var zoom: js.UndefOr[ZoomType | integer] = js.native
}

object ScaleConfig {
  @scala.inline
  def apply(): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleConfig]
  }
  @scala.inline
  implicit class ScaleConfigOps[Self <: ScaleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCenter(value: CenterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRound")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenTarget(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: WidthHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: WidthHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ScaleModeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withParentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeInterval(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: ZoomType | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

