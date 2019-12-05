package typingsSlinky.androiduix.android.view.KeyEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onKeyDown(keyCode: Double, event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean
  def onKeyLongPress(keyCode: Double, event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean
  def onKeyUp(keyCode: Double, event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean
}

object Callback {
  @scala.inline
  def apply(
    onKeyDown: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean,
    onKeyLongPress: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean,
    onKeyUp: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean
  ): Callback = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyLongPress = js.Any.fromFunction2(onKeyLongPress), onKeyUp = js.Any.fromFunction2(onKeyUp))
  
    __obj.asInstanceOf[Callback]
  }
}

