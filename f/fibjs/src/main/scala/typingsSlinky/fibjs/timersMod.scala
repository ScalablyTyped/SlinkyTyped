package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief timers 模块
  * @detail 
  */
@JSImport("timers", JSImport.Namespace)
@js.native
object timersMod extends js.Object {
  
  def call(func: js.Function, timeout: Double, args: js.Any*): js.Any = js.native
  
  def clearHrInterval(t: js.Any): Unit = js.native
  
  def clearImmediate(t: js.Any): Unit = js.native
  
  def clearInterval(t: js.Any): Unit = js.native
  
  def clearTimeout(t: js.Any): Unit = js.native
  
  def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  
  def setImmediate(callback: js.Function, args: js.Any*): ClassTimer = js.native
  
  def setInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  
  def setTimeout(callback: js.Function, timeout: js.UndefOr[scala.Nothing], args: js.Any*): ClassTimer = js.native
  def setTimeout(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
}
