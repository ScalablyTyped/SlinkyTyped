package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.Element
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseTarget extends js.Object {
  /**
    * Some extra detail.
    */
  val detail: js.Any = js.native
  /**
    * The target element
    */
  val element: Element | Null = js.native
  /**
    * Desired mouse column (e.g. when position.column gets clamped to text length -- clicking after text on a line).
    */
  val mouseColumn: Double = js.native
  /**
    * The 'approximate' editor position
    */
  val position: Position | Null = js.native
  /**
    * The 'approximate' editor range
    */
  val range: Range | Null = js.native
  /**
    * The target type
    */
  val `type`: MouseTargetType = js.native
}

object IMouseTarget {
  @scala.inline
  def apply(detail: js.Any, mouseColumn: Double, `type`: MouseTargetType): IMouseTarget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTarget]
  }
  @scala.inline
  implicit class IMouseTargetOps[Self <: IMouseTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MouseTargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(null)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(null)
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(null)
        ret
    }
  }
  
}

