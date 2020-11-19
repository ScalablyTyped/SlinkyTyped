package typingsSlinky.androiduix.global.android.graphics.drawable

import typingsSlinky.androiduix.android.graphics.drawable.ScaleDrawable.ScaleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.drawable.ScaleDrawable")
@js.native
class ScaleDrawable ()
  extends typingsSlinky.androiduix.android.graphics.drawable.ScaleDrawable {
  def this(state: ScaleState) = this()
  def this(
    drawable: typingsSlinky.androiduix.android.graphics.drawable.Drawable,
    gravity: Double,
    scaleWidth: Double,
    scaleHeight: Double
  ) = this()
}
@JSGlobal("android.graphics.drawable.ScaleDrawable")
@js.native
object ScaleDrawable extends js.Object {
  
  @js.native
  class ScaleState protected ()
    extends typingsSlinky.androiduix.android.graphics.drawable.ScaleDrawable.ScaleState {
    def this(
      orig: typingsSlinky.androiduix.android.graphics.drawable.ScaleDrawable.ScaleState,
      owner: typingsSlinky.androiduix.android.graphics.drawable.ScaleDrawable
    ) = this()
  }
}
