package typingsSlinky.insight.mod

import typingsSlinky.insight.mod.insight.IConfigstore
import typingsSlinky.insight.mod.insight.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insight_ extends js.Object {
  
  var appVersion: String = js.native
  
  def askPermission(): Unit = js.native
  def askPermission(msg: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
  def askPermission(msg: String): Unit = js.native
  def askPermission(msg: String, cb: js.Function): Unit = js.native
  
  var clientId: String = js.native
  
  var config: IConfigstore = js.native
  
  var nodeVersion: String = js.native
  
  var optOut: Boolean = js.native
  
  var os: String = js.native
  
  var packageName: String = js.native
  
  var packageVersion: String = js.native
  
  def track(args: String*): Unit = js.native
  
  def trackEvent(event: IEvent): Unit = js.native
  
  var trackingCode: String = js.native
  
  var trackingProvider: String = js.native
}
