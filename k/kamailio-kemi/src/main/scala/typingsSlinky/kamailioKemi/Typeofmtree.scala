package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmtree extends js.Object {
  def mt_match(tname: String, tomatch: String, mval: Double): Double = js.native
}

object Typeofmtree {
  @scala.inline
  def apply(mt_match: (String, String, Double) => Double): Typeofmtree = {
    val __obj = js.Dynamic.literal(mt_match = js.Any.fromFunction3(mt_match))
    __obj.asInstanceOf[Typeofmtree]
  }
  @scala.inline
  implicit class TypeofmtreeOps[Self <: Typeofmtree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMt_match(value: (String, String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt_match")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

