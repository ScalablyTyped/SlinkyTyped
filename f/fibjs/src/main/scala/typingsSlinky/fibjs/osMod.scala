package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 操作系统与文件系统处理模块
  * @detail 使用方法：,```JavaScript,var os = require('os');,```
  */
@JSImport("os", JSImport.Namespace)
@js.native
object osMod extends js.Object {
  
  val EOL: String = js.native
  
  def arch(): String = js.native
  
  def cpuNumbers(): Double = js.native
  
  def cpus(): js.Array[_] = js.native
  
  def dateAdd(d: js.Date, num: Double, part: String): js.Date = js.native
  
  def endianness(): String = js.native
  
  val execPath: String = js.native
  
  def freemem(): Double = js.native
  
  def homedir(): String = js.native
  
  def hostname(): String = js.native
  
  def loadavg(): js.Array[_] = js.native
  
  def memoryUsage(): js.Object = js.native
  
  def networkInterfaces(): js.Object = js.native
  
  def openPrinter(name: String): ClassBufferedStream = js.native
  
  def platform(): String = js.native
  
  def printerInfo(): js.Array[_] = js.native
  
  def release(): String = js.native
  
  def time(): js.Date = js.native
  def time(tmString: String): js.Date = js.native
  
  val timezone: Double = js.native
  
  def tmpdir(): String = js.native
  
  def totalmem(): Double = js.native
  
  def `type`(): String = js.native
  
  def uptime(): Double = js.native
  
  def userInfo(): js.Object = js.native
  def userInfo(options: js.Object): js.Object = js.native
  
  @js.native
  class Service () extends ClassService
}
