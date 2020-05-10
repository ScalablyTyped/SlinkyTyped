package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.left
import typingsSlinky.monacoEditor.monacoEditorStrings.mouseover
import typingsSlinky.monacoEditor.monacoEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorMinimapOptions extends js.Object {
  /**
    * Enable the rendering of the minimap.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Limit the width of the minimap to render at most a certain number of columns.
    * Defaults to 120.
    */
  var maxColumn: js.UndefOr[Double] = js.native
  /**
    * Render the actual text on a line (as opposed to color blocks).
    * Defaults to true.
    */
  var renderCharacters: js.UndefOr[Boolean] = js.native
  /**
    * Control the rendering of the minimap slider.
    * Defaults to 'mouseover'.
    */
  var showSlider: js.UndefOr[always | mouseover] = js.native
  /**
    * Control the side of the minimap in editor.
    * Defaults to 'right'.
    */
  var side: js.UndefOr[right | left] = js.native
}

object IEditorMinimapOptions {
  @scala.inline
  def apply(): IEditorMinimapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorMinimapOptions]
  }
  @scala.inline
  implicit class IEditorMinimapOptionsOps[Self <: IEditorMinimapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSlider(value: always | mouseover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSlider")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: right | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
  }
  
}

