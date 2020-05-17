package typingsSlinky.canvaskitWasm.anon

import typingsSlinky.canvaskitWasm.mod.SkAffinity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkAffinity, {  Downstream  :canvaskit-wasm.canvaskit-wasm.SkAffinity,   Upstream  :canvaskit-wasm.canvaskit-wasm.SkAffinity}> */
@js.native
trait SkEnumSkAffinityDownstrea extends js.Object {
  val Downstream: SkAffinity = js.native
  val Upstream: SkAffinity = js.native
  val values: js.Array[SkAffinity] = js.native
}

object SkEnumSkAffinityDownstrea {
  @scala.inline
  def apply(Downstream: SkAffinity, Upstream: SkAffinity, values: js.Array[SkAffinity]): SkEnumSkAffinityDownstrea = {
    val __obj = js.Dynamic.literal(Downstream = Downstream.asInstanceOf[js.Any], Upstream = Upstream.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkAffinityDownstrea]
  }
  @scala.inline
  implicit class SkEnumSkAffinityDownstreaOps[Self <: SkEnumSkAffinityDownstrea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownstream(value: SkAffinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Downstream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpstream(value: SkAffinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Upstream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkAffinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

