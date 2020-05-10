package typingsSlinky.mochaccino.mod

import typingsSlinky.mochaccino.mochaccinoStrings.document
import typingsSlinky.mochaccino.mochaccinoStrings.navigator
import typingsSlinky.mochaccino.mochaccinoStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom_ extends js.Object {
  var exposedProperties: js.Tuple3[window, navigator, document] = js.native
  def clear(): Unit = js.native
  def create(): Unit = js.native
  def destroy(): Unit = js.native
}

object Dom_ {
  @scala.inline
  def apply(
    clear: () => Unit,
    create: () => Unit,
    destroy: () => Unit,
    exposedProperties: js.Tuple3[window, navigator, document]
  ): Dom_ = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction0(destroy), exposedProperties = exposedProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dom_]
  }
  @scala.inline
  implicit class Dom_Ops[Self <: Dom_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExposedProperties(value: js.Tuple3[window, navigator, document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposedProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

