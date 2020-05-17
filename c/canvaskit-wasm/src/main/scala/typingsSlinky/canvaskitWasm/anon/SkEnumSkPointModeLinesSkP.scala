package typingsSlinky.canvaskitWasm.anon

import typingsSlinky.canvaskitWasm.mod.SkPointMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkPointMode, {  Lines  :canvaskit-wasm.canvaskit-wasm.SkPointMode,   Points  :canvaskit-wasm.canvaskit-wasm.SkPointMode,   Polygon  :canvaskit-wasm.canvaskit-wasm.SkPointMode}> */
@js.native
trait SkEnumSkPointModeLinesSkP extends js.Object {
  val Lines: SkPointMode = js.native
  val Points: SkPointMode = js.native
  val Polygon: SkPointMode = js.native
  val values: js.Array[SkPointMode] = js.native
}

object SkEnumSkPointModeLinesSkP {
  @scala.inline
  def apply(Lines: SkPointMode, Points: SkPointMode, Polygon: SkPointMode, values: js.Array[SkPointMode]): SkEnumSkPointModeLinesSkP = {
    val __obj = js.Dynamic.literal(Lines = Lines.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkPointModeLinesSkP]
  }
  @scala.inline
  implicit class SkEnumSkPointModeLinesSkPOps[Self <: SkEnumSkPointModeLinesSkP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines(value: SkPointMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: SkPointMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygon(value: SkPointMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkPointMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

