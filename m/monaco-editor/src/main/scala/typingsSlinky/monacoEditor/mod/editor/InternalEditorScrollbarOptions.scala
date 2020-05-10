package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalEditorScrollbarOptions extends js.Object {
  val arrowSize: Double = js.native
  val fastScrollSensitivity: Double = js.native
  val handleMouseWheel: Boolean = js.native
  val horizontal: ScrollbarVisibility = js.native
  val horizontalHasArrows: Boolean = js.native
  val horizontalScrollbarSize: Double = js.native
  val horizontalSliderSize: Double = js.native
  val mouseWheelScrollSensitivity: Double = js.native
  val useShadows: Boolean = js.native
  val vertical: ScrollbarVisibility = js.native
  val verticalHasArrows: Boolean = js.native
  val verticalScrollbarSize: Double = js.native
  val verticalSliderSize: Double = js.native
}

object InternalEditorScrollbarOptions {
  @scala.inline
  def apply(
    arrowSize: Double,
    fastScrollSensitivity: Double,
    handleMouseWheel: Boolean,
    horizontal: ScrollbarVisibility,
    horizontalHasArrows: Boolean,
    horizontalScrollbarSize: Double,
    horizontalSliderSize: Double,
    mouseWheelScrollSensitivity: Double,
    useShadows: Boolean,
    vertical: ScrollbarVisibility,
    verticalHasArrows: Boolean,
    verticalScrollbarSize: Double,
    verticalSliderSize: Double
  ): InternalEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], handleMouseWheel = handleMouseWheel.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], horizontalHasArrows = horizontalHasArrows.asInstanceOf[js.Any], horizontalScrollbarSize = horizontalScrollbarSize.asInstanceOf[js.Any], horizontalSliderSize = horizontalSliderSize.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], useShadows = useShadows.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalHasArrows = verticalHasArrows.asInstanceOf[js.Any], verticalScrollbarSize = verticalScrollbarSize.asInstanceOf[js.Any], verticalSliderSize = verticalSliderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorScrollbarOptions]
  }
  @scala.inline
  implicit class InternalEditorScrollbarOptionsOps[Self <: InternalEditorScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFastScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontal(value: ScrollbarVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalHasArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalHasArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalSliderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSliderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseWheelScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelScrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: ScrollbarVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalHasArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalHasArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalSliderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSliderSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

