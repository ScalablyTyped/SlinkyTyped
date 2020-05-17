package typingsSlinky.canvaskitWasm.anon

import typingsSlinky.canvaskitWasm.mod.SkFontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFontWeight, {  ExtraBlack  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Black  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   ExtraBold  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Bold  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   SemiBold  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Medium  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Normal  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Light  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   ExtraLight  :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Thin  :canvaskit-wasm.canvaskit-wasm.SkFontWeight}> */
@js.native
trait SkEnumSkFontWeightExtraBl extends js.Object {
  val Black: SkFontWeight = js.native
  val Bold: SkFontWeight = js.native
  val ExtraBlack: SkFontWeight = js.native
  val ExtraBold: SkFontWeight = js.native
  val ExtraLight: SkFontWeight = js.native
  val Light: SkFontWeight = js.native
  val Medium: SkFontWeight = js.native
  val Normal: SkFontWeight = js.native
  val SemiBold: SkFontWeight = js.native
  val Thin: SkFontWeight = js.native
  val values: js.Array[SkFontWeight] = js.native
}

object SkEnumSkFontWeightExtraBl {
  @scala.inline
  def apply(
    Black: SkFontWeight,
    Bold: SkFontWeight,
    ExtraBlack: SkFontWeight,
    ExtraBold: SkFontWeight,
    ExtraLight: SkFontWeight,
    Light: SkFontWeight,
    Medium: SkFontWeight,
    Normal: SkFontWeight,
    SemiBold: SkFontWeight,
    Thin: SkFontWeight,
    values: js.Array[SkFontWeight]
  ): SkEnumSkFontWeightExtraBl = {
    val __obj = js.Dynamic.literal(Black = Black.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], ExtraBlack = ExtraBlack.asInstanceOf[js.Any], ExtraBold = ExtraBold.asInstanceOf[js.Any], ExtraLight = ExtraLight.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], SemiBold = SemiBold.asInstanceOf[js.Any], Thin = Thin.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFontWeightExtraBl]
  }
  @scala.inline
  implicit class SkEnumSkFontWeightExtraBlOps[Self <: SkEnumSkFontWeightExtraBl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlack(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraBlack(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraBold(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraLight(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiBold(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemiBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThin(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkFontWeight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

