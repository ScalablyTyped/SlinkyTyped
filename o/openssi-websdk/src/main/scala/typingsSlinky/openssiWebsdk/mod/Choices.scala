package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Choices extends js.Object {
  var attr1: js.Any = js.native
  var attributes: js.Any = js.native
  var pred1: js.Any = js.native
  var predicates: js.Any = js.native
}

object Choices {
  @scala.inline
  def apply(attr1: js.Any, attributes: js.Any, pred1: js.Any, predicates: js.Any): Choices = {
    val __obj = js.Dynamic.literal(attr1 = attr1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], pred1 = pred1.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  @scala.inline
  implicit class ChoicesOps[Self <: Choices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPred1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pred1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

