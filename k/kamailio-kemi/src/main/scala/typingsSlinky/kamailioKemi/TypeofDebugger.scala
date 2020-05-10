package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDebugger extends js.Object {
  def dbg_pv_dump(): Double = js.native
  def dbg_pv_dump_ex(mask: Double, level: Double): Double = js.native
}

object TypeofDebugger {
  @scala.inline
  def apply(dbg_pv_dump: () => Double, dbg_pv_dump_ex: (Double, Double) => Double): TypeofDebugger = {
    val __obj = js.Dynamic.literal(dbg_pv_dump = js.Any.fromFunction0(dbg_pv_dump), dbg_pv_dump_ex = js.Any.fromFunction2(dbg_pv_dump_ex))
    __obj.asInstanceOf[TypeofDebugger]
  }
  @scala.inline
  implicit class TypeofDebuggerOps[Self <: TypeofDebugger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbg_pv_dump(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbg_pv_dump")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDbg_pv_dump_ex(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbg_pv_dump_ex")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

