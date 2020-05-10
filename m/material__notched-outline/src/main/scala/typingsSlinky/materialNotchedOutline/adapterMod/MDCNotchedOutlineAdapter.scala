package typingsSlinky.materialNotchedOutline.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCNotchedOutlineAdapter extends js.Object {
  /**
    * Adds a class to the root element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Returns the height of the root element.
    */
  def getHeight(): Double = js.native
  /**
    * Returns the idle outline element's computed style value of the given css property `propertyName`.
    * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
    */
  def getIdleOutlineStyleValue(propertyName: String): String = js.native
  /**
    * Returns the width of the root element.
    */
  def getWidth(): Double = js.native
  /**
    * Removes a class from the root element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets the "d" attribute of the outline element's SVG path.
    */
  def setOutlinePathAttr(value: String): Unit = js.native
}

object MDCNotchedOutlineAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getHeight: () => Double,
    getIdleOutlineStyleValue: String => String,
    getWidth: () => Double,
    removeClass: String => Unit,
    setOutlinePathAttr: String => Unit
  ): MDCNotchedOutlineAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getHeight = js.Any.fromFunction0(getHeight), getIdleOutlineStyleValue = js.Any.fromFunction1(getIdleOutlineStyleValue), getWidth = js.Any.fromFunction0(getWidth), removeClass = js.Any.fromFunction1(removeClass), setOutlinePathAttr = js.Any.fromFunction1(setOutlinePathAttr))
    __obj.asInstanceOf[MDCNotchedOutlineAdapter]
  }
  @scala.inline
  implicit class MDCNotchedOutlineAdapterOps[Self <: MDCNotchedOutlineAdapter] (val x: Self) extends AnyVal {
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
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIdleOutlineStyleValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdleOutlineStyleValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOutlinePathAttr(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOutlinePathAttr")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

