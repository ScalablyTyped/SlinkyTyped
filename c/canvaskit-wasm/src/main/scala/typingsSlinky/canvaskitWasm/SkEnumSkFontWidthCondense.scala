package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.SkFontWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFontWidth, {  Condensed  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   Expanded  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   ExtraCondensed  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   ExtraExpanded  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   Normal  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   SemiCondensed  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   SemiExpanded  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   UltraCondensed  :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   UltraExpanded  :canvaskit-wasm.canvaskit-wasm.SkFontWidth}> */
@js.native
trait SkEnumSkFontWidthCondense extends js.Object {
  val Condensed: SkFontWidth = js.native
  val Expanded: SkFontWidth = js.native
  val ExtraCondensed: SkFontWidth = js.native
  val ExtraExpanded: SkFontWidth = js.native
  val Normal: SkFontWidth = js.native
  val SemiCondensed: SkFontWidth = js.native
  val SemiExpanded: SkFontWidth = js.native
  val UltraCondensed: SkFontWidth = js.native
  val UltraExpanded: SkFontWidth = js.native
  val values: js.Array[SkFontWidth] = js.native
}

object SkEnumSkFontWidthCondense {
  @scala.inline
  def apply(
    Condensed: SkFontWidth,
    Expanded: SkFontWidth,
    ExtraCondensed: SkFontWidth,
    ExtraExpanded: SkFontWidth,
    Normal: SkFontWidth,
    SemiCondensed: SkFontWidth,
    SemiExpanded: SkFontWidth,
    UltraCondensed: SkFontWidth,
    UltraExpanded: SkFontWidth,
    values: js.Array[SkFontWidth]
  ): SkEnumSkFontWidthCondense = {
    val __obj = js.Dynamic.literal(Condensed = Condensed.asInstanceOf[js.Any], Expanded = Expanded.asInstanceOf[js.Any], ExtraCondensed = ExtraCondensed.asInstanceOf[js.Any], ExtraExpanded = ExtraExpanded.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], SemiCondensed = SemiCondensed.asInstanceOf[js.Any], SemiExpanded = SemiExpanded.asInstanceOf[js.Any], UltraCondensed = UltraCondensed.asInstanceOf[js.Any], UltraExpanded = UltraExpanded.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFontWidthCondense]
  }
  @scala.inline
  implicit class SkEnumSkFontWidthCondenseOps[Self <: SkEnumSkFontWidthCondense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondensed(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraCondensed(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraCondensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraExpanded(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiCondensed(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemiCondensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemiExpanded(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemiExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUltraCondensed(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UltraCondensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUltraExpanded(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UltraExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkFontWidth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

