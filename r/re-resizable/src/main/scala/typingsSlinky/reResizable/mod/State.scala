package typingsSlinky.reResizable.mod

import typingsSlinky.reResizable.AnonY
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var backgroundStyle: CSSProperties = js.native
  var direction: Direction = js.native
  var flexBasis: js.UndefOr[String | Double] = js.native
  var height: Double | String = js.native
  var isResizing: Boolean = js.native
  var original: AnonY = js.native
  var width: Double | String = js.native
}

object State {
  @scala.inline
  def apply(
    backgroundStyle: CSSProperties,
    direction: Direction,
    height: Double | String,
    isResizing: Boolean,
    original: AnonY,
    width: Double | String
  ): State = {
    val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal(value: AnonY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexBasis(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexBasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(js.undefined)
        ret
    }
  }
  
}

