package typingsSlinky.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/stringgenerator.Options> */
@js.native
trait PartialOptionsOrder extends js.Object {
  var order: js.UndefOr[Double] = js.native
  var prior: js.UndefOr[Double] = js.native
  var words: js.UndefOr[Boolean] = js.native
}

object PartialOptionsOrder {
  @scala.inline
  def apply(): PartialOptionsOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOrder]
  }
  @scala.inline
  implicit class PartialOptionsOrderOps[Self <: PartialOptionsOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPrior(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prior")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

