package typingsSlinky.nodeHid.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-hid", "HID")
@js.native
class HID protected () extends EventEmitter {
  def this(path: String) = this()
  def this(vid: Double, pid: Double) = this()
  
  def close(): Unit = js.native
  
  def getFeatureReport(report_id: Double, report_length: Double): js.Array[Double] = js.native
  
  def pause(): Unit = js.native
  
  def read(callback: js.Function2[/* err */ js.Any, /* data */ js.Array[Double], Unit]): Unit = js.native
  
  def readSync(): js.Array[Double] = js.native
  
  def readTimeout(time_out: Double): js.Array[Double] = js.native
  
  def resume(): Unit = js.native
  
  def sendFeatureReport(data: js.Array[Double]): Double = js.native
  def sendFeatureReport(data: Buffer): Double = js.native
  
  def setNonBlocking(no_block: Boolean): Unit = js.native
  
  def write(values: js.Array[Double]): Double = js.native
  def write(values: Buffer): Double = js.native
}
