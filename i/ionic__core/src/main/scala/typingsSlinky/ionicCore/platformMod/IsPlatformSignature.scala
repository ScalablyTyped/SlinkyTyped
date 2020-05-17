package typingsSlinky.ionicCore.platformMod

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsPlatformSignature extends js.Object {
  def apply(plt: Platforms): Boolean = js.native
  def apply(win: Window, plt: Platforms): Boolean = js.native
}

