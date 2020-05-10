package typingsSlinky.dwt

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamsoftStatic[TElement /* <: Node */] extends js.Object {
  var Lib: DynamsoftLib = js.native
  var WebTwainEnv: dwtEnv = js.native
}

object DynamsoftStatic {
  @scala.inline
  def apply[TElement](Lib: DynamsoftLib, WebTwainEnv: dwtEnv): DynamsoftStatic[TElement] = {
    val __obj = js.Dynamic.literal(Lib = Lib.asInstanceOf[js.Any], WebTwainEnv = WebTwainEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamsoftStatic[TElement]]
  }
  @scala.inline
  implicit class DynamsoftStaticOps[Self[telement] <: DynamsoftStatic[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withLib(value: DynamsoftLib): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebTwainEnv(value: dwtEnv): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebTwainEnv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

