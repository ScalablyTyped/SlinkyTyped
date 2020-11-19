package typingsSlinky.androiduix.global.android.graphics.drawable

import typingsSlinky.androiduix.android.graphics.drawable.ClipDrawable.ClipState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
class ClipDrawable ()
  extends typingsSlinky.androiduix.android.graphics.drawable.ClipDrawable {
  def this(state: ClipState) = this()
  def this(
    drawable: typingsSlinky.androiduix.android.graphics.drawable.Drawable,
    gravity: Double,
    orientation: Double
  ) = this()
}
/* static members */
@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
object ClipDrawable extends js.Object {
  
  var HORIZONTAL: Double = js.native
  
  var VERTICAL: Double = js.native
  
  @js.native
  class ClipState protected ()
    extends typingsSlinky.androiduix.android.graphics.drawable.ClipDrawable.ClipState {
    def this(
      orig: typingsSlinky.androiduix.android.graphics.drawable.ClipDrawable.ClipState,
      owner: typingsSlinky.androiduix.android.graphics.drawable.ClipDrawable
    ) = this()
  }
}
