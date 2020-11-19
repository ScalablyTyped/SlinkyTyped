package typingsSlinky.loremIpsum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lorem-ipsum/types/src/bin/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def copyToClipboard(text: String): js.Promise[String] = js.native
  
  def getCopyCommand(): String = js.native
  def getCopyCommand(platform: String): String = js.native
  
  def getPlatform(): String = js.native
  
  def getVersion(): String = js.native
  
  def isSupportedPlatform(platform: String): Boolean = js.native
}
