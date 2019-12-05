package typingsSlinky.atIonicCliDashFramework.libHelpMod

import typingsSlinky.atIonicCliDashFramework.Anon_Colors
import typingsSlinky.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
@js.native
abstract class HelpFormatter protected () extends js.Object {
  def this(hasColors: Anon_Colors) = this()
  val colors: Colors = js.native
  def format(): js.Promise[String] = js.native
}

