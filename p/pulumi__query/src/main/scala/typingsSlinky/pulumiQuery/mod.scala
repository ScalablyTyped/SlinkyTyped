package typingsSlinky.pulumiQuery

import typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator
import typingsSlinky.pulumiQuery.interfacesMod.AsyncQuerySource
import typingsSlinky.pulumiQuery.interfacesMod.AsyncQueryable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def empty[TResult](): AsyncIterableIterator[TResult] = js.native
  
  def from[TSource](source: AsyncQuerySource[TSource]): AsyncQueryable[TSource] = js.native
  
  def range(start: Double): AsyncQueryable[Double] = js.native
  def range(start: Double, stop: Double): AsyncQueryable[Double] = js.native
  
  def repeat[TSource](t: TSource): Unit = js.native
}
