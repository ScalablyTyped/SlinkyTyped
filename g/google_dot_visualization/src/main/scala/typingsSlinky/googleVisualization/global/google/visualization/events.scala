package typingsSlinky.googleVisualization.global.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Events
@JSGlobal("google.visualization.events")
@js.native
object events extends js.Object {
  
  def addListener(visualization: js.Any, eventName: String, callback: js.Function): js.Any = js.native
  def addListener(visualization: js.Any, eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  
  def addOneTimeListener(visualization: js.Any, eventName: String, callback: js.Function): js.Any = js.native
  def addOneTimeListener(visualization: js.Any, eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  
  def removeAllListeners(visualization: js.Any): Unit = js.native
  
  def removeListener(listener: js.Any): Unit = js.native
  
  def trigger(visualization: js.Any, eventName: String): Unit = js.native
  def trigger(visualization: js.Any, eventName: String, args: js.Any): Unit = js.native
}
