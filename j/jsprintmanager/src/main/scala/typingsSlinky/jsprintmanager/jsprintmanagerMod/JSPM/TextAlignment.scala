package typingsSlinky.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSImport("jsprintmanager", "JSPM.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  @js.native
  sealed trait Center extends TextAlignment
  
  @js.native
  sealed trait Justify extends TextAlignment
  
  @js.native
  sealed trait Left extends TextAlignment
  
  @js.native
  sealed trait Right extends TextAlignment
  
  /* 1 */ val Center: typingsSlinky.jsprintmanager.jsprintmanagerMod.JSPM.TextAlignment.Center with Double = js.native
  /* 3 */ val Justify: typingsSlinky.jsprintmanager.jsprintmanagerMod.JSPM.TextAlignment.Justify with Double = js.native
  /* 0 */ val Left: typingsSlinky.jsprintmanager.jsprintmanagerMod.JSPM.TextAlignment.Left with Double = js.native
  /* 2 */ val Right: typingsSlinky.jsprintmanager.jsprintmanagerMod.JSPM.TextAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
}

