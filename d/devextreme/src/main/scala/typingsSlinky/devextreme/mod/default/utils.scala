package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.anon.AllowPan
import typingsSlinky.devextreme.mod.DevExpress.dxSchedulerTimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "utils")
@js.native
object utils extends js.Object {
  
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  
  def getTimeZones(): js.Array[dxSchedulerTimeZone] = js.native
  def getTimeZones(date: js.Date): js.Array[dxSchedulerTimeZone] = js.native
  
  def initMobileViewport(options: AllowPan): Unit = js.native
  
  def requestAnimationFrame(callback: js.Function): Double = js.native
}
