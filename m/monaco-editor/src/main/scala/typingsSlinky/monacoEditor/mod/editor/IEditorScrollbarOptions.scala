package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.auto
import typingsSlinky.monacoEditor.monacoEditorStrings.hidden
import typingsSlinky.monacoEditor.monacoEditorStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorScrollbarOptions extends js.Object {
  /**
    * The size of arrows (if displayed).
    * Defaults to 11.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  /**
    * Listen to mouse wheel events and react to them by scrolling.
    * Defaults to true.
    */
  var handleMouseWheel: js.UndefOr[Boolean] = js.native
  /**
    * Render horizontal scrollbar.
    * Defaults to 'auto'.
    */
  var horizontal: js.UndefOr[auto | visible | hidden] = js.native
  /**
    * Render arrows at the left and right of the horizontal scrollbar.
    * Defaults to false.
    */
  var horizontalHasArrows: js.UndefOr[Boolean] = js.native
  /**
    * Height in pixels for the horizontal scrollbar.
    * Defaults to 10 (px).
    */
  var horizontalScrollbarSize: js.UndefOr[Double] = js.native
  /**
    * Height in pixels for the horizontal slider.
    * Defaults to `horizontalScrollbarSize`.
    */
  var horizontalSliderSize: js.UndefOr[Double] = js.native
  /**
    * Cast horizontal and vertical shadows when the content is scrolled.
    * Defaults to true.
    */
  var useShadows: js.UndefOr[Boolean] = js.native
  /**
    * Render vertical scrollbar.
    * Defaults to 'auto'.
    */
  var vertical: js.UndefOr[auto | visible | hidden] = js.native
  /**
    * Render arrows at the top and bottom of the vertical scrollbar.
    * Defaults to false.
    */
  var verticalHasArrows: js.UndefOr[Boolean] = js.native
  /**
    * Width in pixels for the vertical scrollbar.
    * Defaults to 10 (px).
    */
  var verticalScrollbarSize: js.UndefOr[Double] = js.native
  /**
    * Width in pixels for the vertical slider.
    * Defaults to `verticalScrollbarSize`.
    */
  var verticalSliderSize: js.UndefOr[Double] = js.native
}

object IEditorScrollbarOptions {
  @scala.inline
  def apply(): IEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorScrollbarOptions]
  }
  @scala.inline
  implicit class IEditorScrollbarOptionsOps[Self <: IEditorScrollbarOptions] (val x: Self) extends AnyVal {
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
    def withoutArrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: auto | visible | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalHasArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalHasArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalHasArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalHasArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalScrollbarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollbarSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalSliderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSliderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalSliderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSliderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useShadows")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: auto | visible | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalHasArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalHasArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalHasArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalHasArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalScrollbarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollbarSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSliderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSliderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSliderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSliderSize")(js.undefined)
        ret
    }
  }
  
}

