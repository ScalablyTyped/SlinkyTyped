package typingsSlinky.canvaskitWasm.anon

import typingsSlinky.canvaskitWasm.mod.SkFontSlant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFontSlant, {  Italic  :canvaskit-wasm.canvaskit-wasm.SkFontSlant,   Oblique  :canvaskit-wasm.canvaskit-wasm.SkFontSlant,   Upright  :canvaskit-wasm.canvaskit-wasm.SkFontSlant}> */
@js.native
trait SkEnumSkFontSlantItalicSk extends js.Object {
  val Italic: SkFontSlant = js.native
  val Oblique: SkFontSlant = js.native
  val Upright: SkFontSlant = js.native
  val values: js.Array[SkFontSlant] = js.native
}

object SkEnumSkFontSlantItalicSk {
  @scala.inline
  def apply(Italic: SkFontSlant, Oblique: SkFontSlant, Upright: SkFontSlant, values: js.Array[SkFontSlant]): SkEnumSkFontSlantItalicSk = {
    val __obj = js.Dynamic.literal(Italic = Italic.asInstanceOf[js.Any], Oblique = Oblique.asInstanceOf[js.Any], Upright = Upright.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFontSlantItalicSk]
  }
  @scala.inline
  implicit class SkEnumSkFontSlantItalicSkOps[Self <: SkEnumSkFontSlantItalicSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItalic(value: SkFontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOblique(value: SkFontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Oblique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpright(value: SkFontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Upright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkFontSlant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

