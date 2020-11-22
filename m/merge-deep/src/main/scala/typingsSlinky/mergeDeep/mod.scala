package typingsSlinky.mergeDeep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merge-deep", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(target: js.Any, sources: js.Any*): js.Any = js.native
  /** Recursively merge values in a javascript object. */
  def apply[T, U](orig: T, objects: U): T with U = js.native
  def apply[T, U, V](orig: T, objects1: U, objects2: V): T with U with V = js.native
  def apply[T, U, V, W](orig: T, objects1: U, objects2: V, objects3: W): T with U with V with W = js.native
  def apply[T, U, V, W, X](orig: T, objects1: U, objects2: V, objects3: W, objects4: X): T with U with V with W with X = js.native
}
