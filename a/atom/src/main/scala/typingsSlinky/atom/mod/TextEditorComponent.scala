package typingsSlinky.atom.mod

import typingsSlinky.atom.AnonClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorComponent extends js.Object {
  def pixelPositionForMouseEvent(event: AnonClientX): PixelPosition = js.native
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition = js.native
  def screenPositionForMouseEvent(event: AnonClientX): Point = js.native
  def screenPositionForPixelPosition(pos: PixelPosition): Point = js.native
}

object TextEditorComponent {
  @scala.inline
  def apply(
    pixelPositionForMouseEvent: AnonClientX => PixelPosition,
    pixelPositionForScreenPosition: PointLike => PixelPosition,
    screenPositionForMouseEvent: AnonClientX => Point,
    screenPositionForPixelPosition: PixelPosition => Point
  ): TextEditorComponent = {
    val __obj = js.Dynamic.literal(pixelPositionForMouseEvent = js.Any.fromFunction1(pixelPositionForMouseEvent), pixelPositionForScreenPosition = js.Any.fromFunction1(pixelPositionForScreenPosition), screenPositionForMouseEvent = js.Any.fromFunction1(screenPositionForMouseEvent), screenPositionForPixelPosition = js.Any.fromFunction1(screenPositionForPixelPosition))
    __obj.asInstanceOf[TextEditorComponent]
  }
  @scala.inline
  implicit class TextEditorComponentOps[Self <: TextEditorComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPixelPositionForMouseEvent(value: AnonClientX => PixelPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelPositionForMouseEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPixelPositionForScreenPosition(value: PointLike => PixelPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelPositionForScreenPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScreenPositionForMouseEvent(value: AnonClientX => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPositionForMouseEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScreenPositionForPixelPosition(value: PixelPosition => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPositionForPixelPosition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

