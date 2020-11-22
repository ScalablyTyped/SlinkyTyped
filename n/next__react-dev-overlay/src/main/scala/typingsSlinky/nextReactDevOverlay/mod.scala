package typingsSlinky.nextReactDevOverlay

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-dev-overlay/lib/client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ReactDevOverlay: ReactComponentClass[js.Object] = js.native
  
  def getNodeError(error: js.Error): js.Error = js.native
  
  def onBuildError(message: String): Unit = js.native
  
  def onBuildOk(): Unit = js.native
  
  def onRefresh(): Unit = js.native
  
  def register(): Unit = js.native
  
  def unregister(): Unit = js.native
}
