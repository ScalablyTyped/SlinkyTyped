package typingsSlinky.androiduix.global.android.graphics.drawable

import typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable.LayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
class LayerDrawable protected ()
  extends typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable {
  def this(layers: js.Array[typingsSlinky.androiduix.android.graphics.drawable.Drawable]) = this()
  def this(layers: js.Array[typingsSlinky.androiduix.android.graphics.drawable.Drawable], state: LayerState) = this()
}

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
object LayerDrawable extends js.Object {
  @js.native
  class ChildDrawable ()
    extends typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable.ChildDrawable
  
  @js.native
  class LayerState protected ()
    extends typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable.LayerState {
    def this(
      orig: typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable.LayerState,
      owner: typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable
    ) = this()
  }
  
}

