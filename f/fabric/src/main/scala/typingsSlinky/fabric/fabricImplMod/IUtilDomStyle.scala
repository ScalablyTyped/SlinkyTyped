package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilDomStyle extends js.Object {
  /**
  	 * Cross-browser wrapper for setting element's style
  	 */
  def setStyle(element: HTMLElement, styles: js.Any): HTMLElement = js.native
}

object IUtilDomStyle {
  @scala.inline
  def apply(setStyle: (HTMLElement, js.Any) => HTMLElement): IUtilDomStyle = {
    val __obj = js.Dynamic.literal(setStyle = js.Any.fromFunction2(setStyle))
    __obj.asInstanceOf[IUtilDomStyle]
  }
  @scala.inline
  implicit class IUtilDomStyleOps[Self <: IUtilDomStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetStyle(value: (HTMLElement, js.Any) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

