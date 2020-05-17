package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  var label: js.UndefOr[String] = js.native
  var v: js.Any = js.native
  var w: js.Any = js.native
  var weight: Double = js.native
  def either(): Double = js.native
  def from(): Double = js.native
  def other(x: Double): Double = js.native
  def to(): Double = js.native
}

object Edge {
  @scala.inline
  def apply(
    either: () => Double,
    from: () => Double,
    other: Double => Double,
    to: () => Double,
    v: js.Any,
    w: js.Any,
    weight: Double
  ): Edge = {
    val __obj = js.Dynamic.literal(either = js.Any.fromFunction0(either), from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEither(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("either")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFrom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOther(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withV(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

