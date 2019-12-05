package typingsSlinky.androiduix.android.view.Menu

import typingsSlinky.androiduix.android.view.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onMenuItemSelected(menu: typingsSlinky.androiduix.android.view.Menu, item: MenuItem): Boolean
}

object Callback {
  @scala.inline
  def apply(onMenuItemSelected: (typingsSlinky.androiduix.android.view.Menu, MenuItem) => Boolean): Callback = {
    val __obj = js.Dynamic.literal(onMenuItemSelected = js.Any.fromFunction2(onMenuItemSelected))
  
    __obj.asInstanceOf[Callback]
  }
}

