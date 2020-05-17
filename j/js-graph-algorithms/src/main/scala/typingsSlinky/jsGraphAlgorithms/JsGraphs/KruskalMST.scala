package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KruskalMST extends js.Object {
  var mst: js.Array[Edge] = js.native
}

object KruskalMST {
  @scala.inline
  def apply(mst: js.Array[Edge]): KruskalMST = {
    val __obj = js.Dynamic.literal(mst = mst.asInstanceOf[js.Any])
    __obj.asInstanceOf[KruskalMST]
  }
  @scala.inline
  implicit class KruskalMSTOps[Self <: KruskalMST] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMst(value: js.Array[Edge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

