package typingsSlinky.mathjax.MathJax

import typingsSlinky.mathjax.mathjaxStrings.CommonHTML
import typingsSlinky.mathjax.mathjaxStrings.NativeMML
import typingsSlinky.mathjax.mathjaxStrings.PlainSource
import typingsSlinky.mathjax.mathjaxStrings.PreviewHTML
import typingsSlinky.mathjax.mathjaxStrings.SVG
import typingsSlinky.mathjax.mathjaxStrings.`HTML-CSS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuSettings extends js.Object {
  var ALT: js.UndefOr[Boolean] = js.native
  var CMD: js.UndefOr[Boolean] = js.native
  /*These values indicate which keys must be pressed in order for math zoom to be triggered. For example, if CTRL
    * is set to true and zoom is "Click", then math will be zoomed only when the user control-clicks on mathematics
    * (i.e., clicks while holding down the CTRL key). If more than one is true, then all the indicated keys must be
    * pressed for the zoom to occur.
    */
  var CTRL: js.UndefOr[Boolean] = js.native
  var Shift: js.UndefOr[Boolean] = js.native
  /*This controls what contextual menu will be presented when a right click (on a PC) or CTRL-click (on the Mac)
    * occurs over a typeset equation. When set to "MathJax", the MathJax contextual menu will appear; when set to
    * "Browser", the browser’s contextual menu will be used. For example, in Internet Explorer with the MathPlayer
    * plugin, if this is set to "Browser", you will get the MathPlayer contextual menu rather than the MathJax menu.
    */
  var context: js.UndefOr[String] = js.native
  var mpContext: js.UndefOr[Boolean] = js.native
  var mpMouse: js.UndefOr[Boolean] = js.native
  val renderer: js.UndefOr[`HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource] = js.native
  /*This controls whether the “Show Source” menu item includes special class names that help MathJax to typeset
    * the mathematics that was produced by the TeX input jax. If these are included, then you can take the output
    * from “Show Source” and put it into a page that uses MathJax’s MathML input jax and expect to get the same
    * results as the original TeX. (Without this, there may be some spacing differences.)
    */
  var texHints: js.UndefOr[Boolean] = js.native
  /*This indicates when typeset mathematics should be zoomed. It can be set to "None", "Hover", "Click", or
    * "Double-Click" to set the zoom trigger.
    */
  var zoom: js.UndefOr[String] = js.native
  /*This is the zoom scaling factor, and it can be set to any of the values available in the Zoom Factor menu of
    * the Settings submenu of the contextual menu.
    */
  var zscale: js.UndefOr[String] = js.native
}

object MenuSettings {
  @scala.inline
  def apply(): MenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuSettings]
  }
  @scala.inline
  implicit class MenuSettingsOps[Self <: MenuSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALT")(js.undefined)
        ret
    }
    @scala.inline
    def withCMD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCMD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD")(js.undefined)
        ret
    }
    @scala.inline
    def withCTRL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTRL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCTRL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTRL")(js.undefined)
        ret
    }
    @scala.inline
    def withShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shift")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withMpContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpContext")(js.undefined)
        ret
    }
    @scala.inline
    def withMpMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: `HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withTexHints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texHints")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: String): Self = {
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
    @scala.inline
    def withZscale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zscale")(js.undefined)
        ret
    }
  }
  
}

