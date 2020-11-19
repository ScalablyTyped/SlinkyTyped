package typingsSlinky.androiduix.global.android.graphics.drawable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.res.Resources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.drawable.Drawable")
@js.native
abstract class Drawable ()
  extends typingsSlinky.androiduix.android.graphics.drawable.Drawable
/* static members */
@JSGlobal("android.graphics.drawable.Drawable")
@js.native
object Drawable extends js.Object {
  
  var ZERO_BOUNDS_RECT: js.Any = js.native
  
  def createFromXml(r: Resources, parser: HTMLElement): typingsSlinky.androiduix.android.graphics.drawable.Drawable = js.native
  
  def resolveOpacity(op1: Double, op2: Double): Double = js.native
}
