package typingsSlinky.easyXHeaders.dgramMod

import typingsSlinky.easyXHeaders.eventsMod.EventEmitter
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket extends EventEmitter {
  
  def addMembership(multicastAddress: String): Unit = js.native
  def addMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
  
  def address(): AddressInfo = js.native
  
  def bind(port: Double): Unit = js.native
  def bind(port: Double, address: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def bind(port: Double, address: String): Unit = js.native
  def bind(port: Double, address: String, callback: js.Function0[Unit]): Unit = js.native
  
  def close(): Unit = js.native
  
  def dropMembership(multicastAddress: String): Unit = js.native
  def dropMembership(multicastAddress: String, multicastInterface: String): Unit = js.native
  
  def send(buf: Buffer, offset: Double, length: Double, port: Double, address: String): Unit = js.native
  def send(
    buf: Buffer,
    offset: Double,
    length: Double,
    port: Double,
    address: String,
    callback: js.Function2[/* error */ js.Error, /* bytes */ Double, Unit]
  ): Unit = js.native
  
  def setBroadcast(flag: Boolean): Unit = js.native
  
  def setMulticastLoopback(flag: Boolean): Unit = js.native
  
  def setMulticastTTL(ttl: Double): Unit = js.native
}
