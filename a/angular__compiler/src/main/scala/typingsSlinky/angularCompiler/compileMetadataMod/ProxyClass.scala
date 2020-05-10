package typingsSlinky.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyClass extends js.Object {
  def setDelegate(delegate: js.Any): Unit = js.native
}

object ProxyClass {
  @scala.inline
  def apply(setDelegate: js.Any => Unit): ProxyClass = {
    val __obj = js.Dynamic.literal(setDelegate = js.Any.fromFunction1(setDelegate))
    __obj.asInstanceOf[ProxyClass]
  }
  @scala.inline
  implicit class ProxyClassOps[Self <: ProxyClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetDelegate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDelegate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

