package typingsSlinky.baseui.listMod

import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuAdapterPropsT extends PropsT {
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  @JSName("$size")
  var $size: String = js.native
  // eslint-disable-next-line flowtype/no-weak-types
  var item: js.Any = js.native
  def onClick(event: SyntheticMouseEvent[HTMLLIElement]): js.Any = js.native
  def onMouseEnter(event: SyntheticMouseEvent[HTMLLIElement]): js.Any = js.native
}

