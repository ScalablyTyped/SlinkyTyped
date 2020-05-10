package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFRef extends js.Object {
  var gen: js.Any = js.native
  var num: Double = js.native
}

object PDFRef {
  @scala.inline
  def apply(gen: js.Any, num: Double): PDFRef = {
    val __obj = js.Dynamic.literal(gen = gen.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRef]
  }
  @scala.inline
  implicit class PDFRefOps[Self <: PDFRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

