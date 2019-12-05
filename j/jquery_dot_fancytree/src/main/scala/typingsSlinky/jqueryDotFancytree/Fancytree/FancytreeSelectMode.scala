package typingsSlinky.jqueryDotFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FancytreeSelectMode extends js.Object

@JSGlobal("Fancytree.FancytreeSelectMode")
@js.native
object FancytreeSelectMode extends js.Object {
  @js.native
  sealed trait multi extends FancytreeSelectMode
  
  @js.native
  sealed trait mutlti_hier extends FancytreeSelectMode
  
  @js.native
  sealed trait single extends FancytreeSelectMode
  
  /* 2 */ val multi: typingsSlinky.jqueryDotFancytree.Fancytree.FancytreeSelectMode.multi with Double = js.native
  /* 3 */ val mutlti_hier: typingsSlinky.jqueryDotFancytree.Fancytree.FancytreeSelectMode.mutlti_hier with Double = js.native
  /* 1 */ val single: typingsSlinky.jqueryDotFancytree.Fancytree.FancytreeSelectMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FancytreeSelectMode with Double] = js.native
}

