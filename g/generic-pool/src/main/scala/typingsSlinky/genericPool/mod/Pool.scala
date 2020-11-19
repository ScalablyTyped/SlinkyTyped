package typingsSlinky.genericPool.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("generic-pool", "Pool")
@js.native
class Pool[T] () extends EventEmitter {
  
  def acquire(): js.Thenable[T] = js.native
  def acquire(priority: Double): js.Thenable[T] = js.native
  
  var available: Double = js.native
  
  var borrowed: Double = js.native
  
  def clear(): js.Thenable[Unit] = js.native
  
  def destroy(resource: T): js.Thenable[Unit] = js.native
  
  def drain(): js.Thenable[Unit] = js.native
  
  def isBorrowedResource(resource: T): Boolean = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var pending: Double = js.native
  
  def release(resource: T): js.Thenable[Unit] = js.native
  
  var size: Double = js.native
  
  var spareResourceCapacity: Double = js.native
  
  def start(): Unit = js.native
  
  def use[U](cb: js.Function1[/* resource */ T, U | js.Thenable[U]]): js.Thenable[U] = js.native
}
