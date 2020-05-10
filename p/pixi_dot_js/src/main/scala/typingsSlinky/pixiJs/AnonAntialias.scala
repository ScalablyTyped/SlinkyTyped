package typingsSlinky.pixiJs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntialias extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.native
  var autoDensity: js.UndefOr[Boolean] = js.native
  var autoStart: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[Double] = js.native
  var clearBeforeRender: js.UndefOr[Boolean] = js.native
  var forceCanvas: js.UndefOr[Boolean] = js.native
  var forceFXAA: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var powerPreference: js.UndefOr[String] = js.native
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  var resizeTo: js.UndefOr[Window_ | HTMLElement] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var sharedLoader: js.UndefOr[Boolean] = js.native
  var sharedTicker: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
  var view: js.UndefOr[HTMLCanvasElement] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnonAntialias {
  @scala.inline
  def apply(): AnonAntialias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAntialias]
  }
  @scala.inline
  implicit class AnonAntialiasOps[Self <: AnonAntialias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDensity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDensity")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Double): Self = {
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
    def withClearBeforeRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBeforeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withForceCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFXAA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFXAA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFXAA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFXAA")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withPowerPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDrawingBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDrawingBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeToHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeTo(value: Window_ | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(js.undefined)
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
    def withSharedLoader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedTicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedTicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedTicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedTicker")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

