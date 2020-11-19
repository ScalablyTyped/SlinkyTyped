package typingsSlinky.escpos.mod

import typingsSlinky.escpos.escposBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "USB")
@js.native
class USB () extends Adapter {
  def this(vid: String) = this()
  def this(vid: js.UndefOr[scala.Nothing], pid: String) = this()
  def this(vid: String, pid: String) = this()
  
  def close(): USB = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): USB = js.native
  
  def open(): USB = js.native
  def open(callback: js.Function2[/* error */ js.Any, /* device */ js.UndefOr[this.type], Unit]): USB = js.native
}
/* static members */
@JSImport("escpos", "USB")
@js.native
object USB extends js.Object {
  
  def findPrinter(): js.Array[USB] | `false` = js.native
  
  def getDevice(): js.Promise[USB] = js.native
  def getDevice(vid: js.UndefOr[scala.Nothing], pid: String): js.Promise[USB] = js.native
  def getDevice(vid: String): js.Promise[USB] = js.native
  def getDevice(vid: String, pid: String): js.Promise[USB] = js.native
}
