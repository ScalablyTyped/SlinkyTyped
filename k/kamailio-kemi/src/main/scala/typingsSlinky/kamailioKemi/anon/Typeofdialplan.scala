package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdialplan extends js.Object {
  def dp_match(dpid: Double, src: String): Double = js.native
  def dp_replace(dpid: Double, src: String, dst: String): Double = js.native
}

object Typeofdialplan {
  @scala.inline
  def apply(dp_match: (Double, String) => Double, dp_replace: (Double, String, String) => Double): Typeofdialplan = {
    val __obj = js.Dynamic.literal(dp_match = js.Any.fromFunction2(dp_match), dp_replace = js.Any.fromFunction3(dp_replace))
    __obj.asInstanceOf[Typeofdialplan]
  }
  @scala.inline
  implicit class TypeofdialplanOps[Self <: Typeofdialplan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDp_match(value: (Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp_match")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDp_replace(value: (Double, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp_replace")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

