package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  /**
    * Sets the font of the current value label text.
    */
  var font: Partial[typingsSlinky.plotlyJs.mod.Font]
  /**
    * The amount of space, in pixels, between the current value label
    * and the slider.
    */
  var offset: Double
  /**
    * When currentvalue.visible is true, this sets the prefix of the label.
    */
  var prefix: String
  /**
    * When currentvalue.visible is true, this sets the suffix of the label.
    */
  var suffix: String
  /**
    * Shows the currently-selected value above the slider.
    */
  var visible: Boolean
  /**
    * The alignment of the value readout relative to the length of the slider.
    */
  var xanchor: left | center | right
}

object Offset {
  @scala.inline
  def apply(
    font: Partial[typingsSlinky.plotlyJs.mod.Font],
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): Offset = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

