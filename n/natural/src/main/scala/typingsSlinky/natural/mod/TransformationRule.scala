package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationRule extends js.Object {
  var literal: js.Array[String] = js.native
  var new_category: String = js.native
  var old_category: String = js.native
  var predicate: Predicate = js.native
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[String]], position: Double): Unit = js.native
}

object TransformationRule {
  @scala.inline
  def apply(
    apply: (js.Array[js.Array[String]], Double) => Unit,
    literal: js.Array[String],
    new_category: String,
    old_category: String,
    predicate: Predicate
  ): TransformationRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), literal = literal.asInstanceOf[js.Any], new_category = new_category.asInstanceOf[js.Any], old_category = old_category.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationRule]
  }
  @scala.inline
  implicit class TransformationRuleOps[Self <: TransformationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: (js.Array[js.Array[String]], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLiteral(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOld_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicate(value: Predicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

