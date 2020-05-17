package typingsSlinky.canvaskitWasm.anon

import typingsSlinky.canvaskitWasm.mod.SkFilterQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFilterQuality, {  High  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   Low  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   Medium  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   None  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality}> */
@js.native
trait SkEnumSkFilterQualityHigh extends js.Object {
  val High: SkFilterQuality = js.native
  val Low: SkFilterQuality = js.native
  val Medium: SkFilterQuality = js.native
  val None: SkFilterQuality = js.native
  val values: js.Array[SkFilterQuality] = js.native
}

object SkEnumSkFilterQualityHigh {
  @scala.inline
  def apply(
    High: SkFilterQuality,
    Low: SkFilterQuality,
    Medium: SkFilterQuality,
    None: SkFilterQuality,
    values: js.Array[SkFilterQuality]
  ): SkEnumSkFilterQualityHigh = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFilterQualityHigh]
  }
  @scala.inline
  implicit class SkEnumSkFilterQualityHighOps[Self <: SkEnumSkFilterQualityHigh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh(value: SkFilterQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("High")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: SkFilterQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: SkFilterQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: SkFilterQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkFilterQuality]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

