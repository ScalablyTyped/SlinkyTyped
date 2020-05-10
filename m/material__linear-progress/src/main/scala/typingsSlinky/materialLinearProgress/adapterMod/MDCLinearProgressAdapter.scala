package typingsSlinky.materialLinearProgress.adapterMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCLinearProgressAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def getBuffer(): Element = js.native
  def getPrimaryBar(): Element = js.native
  def hasClass(className: String): Boolean = js.native
  def removeClass(className: String): Unit = js.native
  def setStyle(el: Element, styleProperty: String, value: Double): Unit = js.native
}

object MDCLinearProgressAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getBuffer: () => Element,
    getPrimaryBar: () => Element,
    hasClass: String => Boolean,
    removeClass: String => Unit,
    setStyle: (Element, String, Double) => Unit
  ): MDCLinearProgressAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getBuffer = js.Any.fromFunction0(getBuffer), getPrimaryBar = js.Any.fromFunction0(getPrimaryBar), hasClass = js.Any.fromFunction1(hasClass), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction3(setStyle))
    __obj.asInstanceOf[MDCLinearProgressAdapter]
  }
  @scala.inline
  implicit class MDCLinearProgressAdapterOps[Self <: MDCLinearProgressAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBuffer(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrimaryBar(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrimaryBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyle(value: (Element, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

