package typingsSlinky.nodegit.configMod.Config

import typingsSlinky.nodegit.bufMod.Buf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/config", "Config")
@js.native
object ^ extends js.Object {
  def findGlobal(): js.Promise[String] = js.native
   // the docs says it's a buff but it's actually a string
  def findProgramdata(): js.Promise[Buf] = js.native
  def findSystem(): js.Promise[Buf] = js.native
  def findXdg(): js.Promise[Buf] = js.native
  def openDefault(): js.Promise[typingsSlinky.nodegit.configMod.Config] = js.native
  def openOndisk(path: String): js.Promise[typingsSlinky.nodegit.configMod.Config] = js.native
}

