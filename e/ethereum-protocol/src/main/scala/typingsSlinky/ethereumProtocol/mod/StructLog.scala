package typingsSlinky.ethereumProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructLog extends js.Object {
  var depth: Double = js.native
  var error: String = js.native
  var gas: Double = js.native
  var gasCost: Double = js.native
  var memory: js.Array[String] = js.native
  var op: OpCode = js.native
  var pc: Double = js.native
  var stack: js.Array[String] = js.native
  var storage: StringDictionary[String] = js.native
}

object StructLog {
  @scala.inline
  def apply(
    depth: Double,
    error: String,
    gas: Double,
    gasCost: Double,
    memory: js.Array[String],
    op: OpCode,
    pc: Double,
    stack: js.Array[String],
    storage: StringDictionary[String]
  ): StructLog = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasCost = gasCost.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructLog]
  }
  @scala.inline
  implicit class StructLogOps[Self <: StructLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: OpCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

