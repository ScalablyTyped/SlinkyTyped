package typingsSlinky.androiduix.android.util

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparseMap[K, T] extends js.Object {
  
  def append(key: js.Any, value: js.Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  def delete(key: K): Unit = js.native
  
  def get(key: K): T = js.native
  def get(key: K, valueIfKeyNotFound: T): T = js.native
  
  def indexOfKey(key: K): Double = js.native
  
  def indexOfValue(value: T): Double = js.native
  
  def keyAt(index: Double): K = js.native
  
  var map: Map[K, T] = js.native
  
  def put(key: K, value: T): Unit = js.native
  
  def remove(key: K): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
  
  def removeAtRange(index: Double): Unit = js.native
  def removeAtRange(index: Double, size: Double): Unit = js.native
  
  def setValueAt(index: Double, value: T): Unit = js.native
  
  def size(): Double = js.native
  
  def valueAt(index: Double): T = js.native
}
