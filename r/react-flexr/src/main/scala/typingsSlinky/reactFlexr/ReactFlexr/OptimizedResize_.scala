package typingsSlinky.reactFlexr.ReactFlexr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple resize event throttler. Usefull for force updating when the
  * app have been resized. For best performance, use it in your main
  * app component in the componentDidMount life cycle.
  */
@js.native
trait OptimizedResize_ extends js.Object {
  def init(callback: js.Function0[Unit]): Unit = js.native
}

object OptimizedResize_ {
  @scala.inline
  def apply(init: js.Function0[Unit] => Unit): OptimizedResize_ = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[OptimizedResize_]
  }
  @scala.inline
  implicit class OptimizedResize_Ops[Self <: OptimizedResize_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

