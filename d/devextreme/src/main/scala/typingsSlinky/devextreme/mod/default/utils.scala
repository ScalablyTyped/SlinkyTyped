package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.anon.AllowPan
import typingsSlinky.devextreme.mod.DevExpress.dxSchedulerTimeZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("devextreme", "default.utils.cancelAnimationFrame")
  @js.native
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  
  @JSImport("devextreme", "default.utils.getTimeZones")
  @js.native
  def getTimeZones(): js.Array[dxSchedulerTimeZone] = js.native
  @JSImport("devextreme", "default.utils.getTimeZones")
  @js.native
  def getTimeZones(date: js.Date): js.Array[dxSchedulerTimeZone] = js.native
  
  @JSImport("devextreme", "default.utils.initMobileViewport")
  @js.native
  def initMobileViewport(options: AllowPan): Unit = js.native
  
  @JSImport("devextreme", "default.utils.requestAnimationFrame")
  @js.native
  def requestAnimationFrame(callback: js.Function): Double = js.native
}
