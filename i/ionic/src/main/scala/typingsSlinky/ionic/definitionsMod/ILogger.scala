package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionicCliFramework.mod.Logger_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogger extends Logger_ {
  
  def ok(msg: String): Unit = js.native
  @JSName("ok")
  var ok_Original: LogFn = js.native
  
  def rawmsg(msg: String): Unit = js.native
  @JSName("rawmsg")
  var rawmsg_Original: LogFn = js.native
}
