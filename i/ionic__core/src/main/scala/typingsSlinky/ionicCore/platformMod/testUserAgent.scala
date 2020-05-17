package typingsSlinky.ionicCore.platformMod

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/platform", "testUserAgent")
@js.native
object testUserAgent extends js.Object {
  def apply(win: Window, expr: js.RegExp): Boolean = js.native
}

