package typingsSlinky.androiduix.global.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.Rect")
@js.native
class Rect ()
  extends typingsSlinky.androiduix.android.graphics.Rect {
  def this(r: typingsSlinky.androiduix.android.graphics.Rect) = this()
  def this(left: Double, top: Double, right: Double, bottom: Double) = this()
}
/* static members */
@JSGlobal("android.graphics.Rect")
@js.native
object Rect extends js.Object {
  
  def intersects(
    a: typingsSlinky.androiduix.android.graphics.Rect,
    b: typingsSlinky.androiduix.android.graphics.Rect
  ): Boolean = js.native
  
  def unflattenFromString(str: String): typingsSlinky.androiduix.android.graphics.Rect = js.native
}
