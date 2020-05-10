package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialboxOptions extends js.Object {
  /**
    * Transition in duration in milliseconds
    * @default 275
    */
  var inDuration: Double = js.native
  /**
    * Transition out duration in milliseconds
    * @default 200
    */
  var outDuration: Double = js.native
  /**
    * Callback function called after materialbox is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit = js.native
  /**
    * Callback function called before materialbox is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit = js.native
  /**
    * Callback function called after materialbox is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit = js.native
  /**
    * Callback function called before materialbox is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit = js.native
}

object MaterialboxOptions {
  @scala.inline
  def apply(
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): MaterialboxOptions = {
    val __obj = js.Dynamic.literal(inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialboxOptions]
  }
  @scala.inline
  implicit class MaterialboxOptionsOps[Self <: MaterialboxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCloseEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCloseStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

