package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.SkTextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkTextAlign, {  Center  :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   End  :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Justify  :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Left  :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Right  :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Start  :canvaskit-wasm.canvaskit-wasm.SkTextAlign}> */
@js.native
trait SkEnumSkTextAlignCenterSk extends js.Object {
  val Center: SkTextAlign = js.native
  val End: SkTextAlign = js.native
  val Justify: SkTextAlign = js.native
  val Left: SkTextAlign = js.native
  val Right: SkTextAlign = js.native
  val Start: SkTextAlign = js.native
  val values: js.Array[SkTextAlign] = js.native
}

object SkEnumSkTextAlignCenterSk {
  @scala.inline
  def apply(
    Center: SkTextAlign,
    End: SkTextAlign,
    Justify: SkTextAlign,
    Left: SkTextAlign,
    Right: SkTextAlign,
    Start: SkTextAlign,
    values: js.Array[SkTextAlign]
  ): SkEnumSkTextAlignCenterSk = {
    val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Justify = Justify.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkTextAlignCenterSk]
  }
  @scala.inline
  implicit class SkEnumSkTextAlignCenterSkOps[Self <: SkEnumSkTextAlignCenterSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJustify(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Justify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[SkTextAlign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

