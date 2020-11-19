package typingsSlinky.rwlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadWriteGeneric[T] extends js.Object {
  
  def readLock(callback: T): Unit = js.native
  def readLock(callback: T, options: Options): Unit = js.native
  def readLock(key: String, callback: T): Unit = js.native
  def readLock(key: String, callback: T, options: Options): Unit = js.native
  
  def writeLock(callback: T): Unit = js.native
  def writeLock(callback: T, options: Options): Unit = js.native
  def writeLock(key: String, callback: T): Unit = js.native
  def writeLock(key: String, callback: T, options: Options): Unit = js.native
}
