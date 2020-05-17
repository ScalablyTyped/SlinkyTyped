package typingsSlinky.jointjs.mod.highlighters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlighterArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var addClass: AddClassHighlighterArguments = js.native
  var opacity: OpacityHighlighterArguments = js.native
  var stroke: StrokeHighlighterArguments = js.native
}

object HighlighterArgumentsMap {
  @scala.inline
  def apply(
    addClass: AddClassHighlighterArguments,
    opacity: OpacityHighlighterArguments,
    stroke: StrokeHighlighterArguments
  ): HighlighterArgumentsMap = {
    val __obj = js.Dynamic.literal(addClass = addClass.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlighterArgumentsMap]
  }
  @scala.inline
  implicit class HighlighterArgumentsMapOps[Self <: HighlighterArgumentsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: AddClassHighlighterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: OpacityHighlighterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: StrokeHighlighterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

