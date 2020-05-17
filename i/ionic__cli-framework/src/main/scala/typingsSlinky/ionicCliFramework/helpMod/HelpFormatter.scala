package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.anon.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
@js.native
abstract class HelpFormatter protected () extends js.Object {
  def this(hasColors: Colors) = this()
  val colors: typingsSlinky.ionicCliFramework.colorsMod.Colors = js.native
  def format(): js.Promise[String] = js.native
}

