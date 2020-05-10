package typingsSlinky.picturefill.mod.Picturefill

import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateArg extends js.Object {
  var elements: NodeList | js.Array[ElementNullable] = js.native
  var reevaluate: js.UndefOr[Boolean] = js.native
}

object EvaluateArg {
  @scala.inline
  def apply(elements: NodeList | js.Array[ElementNullable]): EvaluateArg = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateArg]
  }
  @scala.inline
  implicit class EvaluateArgOps[Self <: EvaluateArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementsNodeList(value: NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElements(value: NodeList | js.Array[ElementNullable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReevaluate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reevaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReevaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reevaluate")(js.undefined)
        ret
    }
  }
  
}

