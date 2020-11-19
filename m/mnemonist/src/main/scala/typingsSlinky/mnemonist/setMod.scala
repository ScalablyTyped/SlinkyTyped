package typingsSlinky.mnemonist

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/set", JSImport.Namespace)
@js.native
object setMod extends js.Object {
  
  def add[T](a: Set[T], b: Set[T]): Unit = js.native
  
  def difference[T](a: Set[T], b: Set[T]): Set[T] = js.native
  
  def disjunct[T](a: Set[T], b: Set[T]): Unit = js.native
  
  def intersect[T](a: Set[T], b: Set[T]): Unit = js.native
  
  def intersection[T](set: Set[T]*): Set[T] = js.native
  
  def isSubset[T](a: Set[T], b: Set[T]): Boolean = js.native
  
  def isSuperset[T](a: Set[T], b: Set[T]): Boolean = js.native
  
  def subtract[T](a: Set[T], b: Set[T]): Unit = js.native
  
  def symmetricDifference[T](a: Set[T], b: Set[T]): Set[T] = js.native
  
  def union[T](set: Set[T]*): Set[T] = js.native
}
