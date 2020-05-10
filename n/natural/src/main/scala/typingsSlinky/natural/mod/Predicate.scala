package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predicate extends js.Object {
  var function: js.UndefOr[
    js.Function3[
      /* tagged_sentence */ js.Array[js.Array[String]], 
      /* i */ Double, 
      /* parameter */ String, 
      Boolean
    ]
  ] = js.native
  var name: String = js.native
  var parameter1: String = js.native
  var parameter2: js.UndefOr[String] = js.native
  def evaluate(tagged_sentence: js.Array[js.Array[String]], position: Double): Boolean = js.native
}

object Predicate {
  @scala.inline
  def apply(evaluate: (js.Array[js.Array[String]], Double) => Boolean, name: String, parameter1: String): Predicate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), name = name.asInstanceOf[js.Any], parameter1 = parameter1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
  @scala.inline
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluate(value: (js.Array[js.Array[String]], Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(
      value: (/* tagged_sentence */ js.Array[js.Array[String]], /* i */ Double, /* parameter */ String) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter2")(js.undefined)
        ret
    }
  }
  
}

