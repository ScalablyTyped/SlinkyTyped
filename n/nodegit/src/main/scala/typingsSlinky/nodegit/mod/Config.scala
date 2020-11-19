package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Config")
@js.native
class Config ()
  extends typingsSlinky.nodegit.configMod.Config
/* static members */
@JSImport("nodegit", "Config")
@js.native
object Config extends js.Object {
  
  def findGlobal(): js.Promise[String] = js.native
  
   // the docs says it's a buff but it's actually a string
  def findProgramdata(): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  
  def findSystem(): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  
  def findXdg(): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  
  def openDefault(): js.Promise[typingsSlinky.nodegit.configMod.Config] = js.native
  
  def openOndisk(path: String): js.Promise[typingsSlinky.nodegit.configMod.Config] = js.native
}
