package typingsSlinky.jsSpec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Problem extends js.Object {
  /**
    * The path to the value.
    */
  val path: js.Array[String] = js.native
  /**
    * The value associated with the problem.
    */
  val value: js.Any = js.native
  /**
    * Path to the Spec that applies.
    */
  val via: js.Array[String] = js.native
  /**
    * A predicate function to test new values for conformance.
    */
  def predicate(value: js.Any): Boolean = js.native
}

object Problem {
  @scala.inline
  def apply(path: js.Array[String], predicate: js.Any => Boolean, value: js.Any, via: js.Array[String]): Problem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate), value = value.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Problem]
  }
  @scala.inline
  implicit class ProblemOps[Self <: Problem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicate(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVia(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

