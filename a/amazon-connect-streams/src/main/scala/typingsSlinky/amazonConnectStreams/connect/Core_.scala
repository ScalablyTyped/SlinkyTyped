package typingsSlinky.amazonConnectStreams.connect

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core_ extends js.Object {
  var initialized: Boolean = js.native
  def initCCP(containerDiv: HTMLElement, options: InitCCPOptions): Unit = js.native
  def terminate(): Unit = js.native
}

object Core_ {
  @scala.inline
  def apply(initCCP: (HTMLElement, InitCCPOptions) => Unit, initialized: Boolean, terminate: () => Unit): Core_ = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP), initialized = initialized.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Core_]
  }
  @scala.inline
  implicit class Core_Ops[Self <: Core_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitCCP(value: (HTMLElement, InitCCPOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCCP")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

