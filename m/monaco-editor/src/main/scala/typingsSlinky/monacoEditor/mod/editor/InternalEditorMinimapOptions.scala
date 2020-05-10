package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.left
import typingsSlinky.monacoEditor.monacoEditorStrings.mouseover
import typingsSlinky.monacoEditor.monacoEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalEditorMinimapOptions extends js.Object {
  val enabled: Boolean = js.native
  val maxColumn: Double = js.native
  val renderCharacters: Boolean = js.native
  val showSlider: always | mouseover = js.native
  val side: right | left = js.native
}

object InternalEditorMinimapOptions {
  @scala.inline
  def apply(
    enabled: Boolean,
    maxColumn: Double,
    renderCharacters: Boolean,
    showSlider: always | mouseover,
    side: right | left
  ): InternalEditorMinimapOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], maxColumn = maxColumn.asInstanceOf[js.Any], renderCharacters = renderCharacters.asInstanceOf[js.Any], showSlider = showSlider.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorMinimapOptions]
  }
  @scala.inline
  implicit class InternalEditorMinimapOptionsOps[Self <: InternalEditorMinimapOptions] (val x: Self) extends AnyVal {
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
    def withMaxColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSlider(value: always | mouseover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSide(value: right | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

