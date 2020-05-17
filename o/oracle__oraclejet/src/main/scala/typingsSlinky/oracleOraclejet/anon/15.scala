package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `15` extends js.Object {
  def attached(param0: String): Unit = js.native
}

object `15` {
  @scala.inline
  def apply(attached: String => Unit): `15` = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[`15`]
  }
  @scala.inline
  implicit class `15Ops`[Self <: `15`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

