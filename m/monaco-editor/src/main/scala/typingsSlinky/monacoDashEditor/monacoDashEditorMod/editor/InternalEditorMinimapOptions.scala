package typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor

import typingsSlinky.monacoDashEditor.monacoDashEditorStrings.always
import typingsSlinky.monacoDashEditor.monacoDashEditorStrings.left
import typingsSlinky.monacoDashEditor.monacoDashEditorStrings.mouseover
import typingsSlinky.monacoDashEditor.monacoDashEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorMinimapOptions extends js.Object {
  val enabled: Boolean
  val maxColumn: Double
  val renderCharacters: Boolean
  val showSlider: always | mouseover
  val side: right | left
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
}

