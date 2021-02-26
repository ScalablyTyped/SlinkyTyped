package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Config")
@js.native
class Config ()
  extends typingsSlinky.nodegit.configMod.Config
/* static members */
object Config {
  
  @JSImport("nodegit", "Config.findGlobal")
  @js.native
  def findGlobal(): js.Promise[String] = js.native
  
  // the docs says it's a buff but it's actually a string
  @JSImport("nodegit", "Config.findProgramdata")
  @js.native
  def findProgramdata(): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  
  @JSImport("nodegit", "Config.findSystem")
  @js.native
  def findSystem(): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  
  @JSImport("nodegit", "Config.findXdg")
  @js.native
  def findXdg(): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  
  @JSImport("nodegit", "Config.openDefault")
  @js.native
  def openDefault(): js.Promise[typingsSlinky.nodegit.configMod.Config] = js.native
  
  @JSImport("nodegit", "Config.openOndisk")
  @js.native
  def openOndisk(path: String): js.Promise[typingsSlinky.nodegit.configMod.Config] = js.native
}
