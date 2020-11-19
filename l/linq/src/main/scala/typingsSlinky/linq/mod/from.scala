package typingsSlinky.linq.mod

import typingsSlinky.linq.anon.Dictx
import typingsSlinky.linq.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("linq", "from")
@js.native
object from extends js.Object {
  
  def apply(): IEnumerable[_] = js.native
  def apply(obj: String): IEnumerable[String] = js.native
  def apply(obj: js.Any): IEnumerable[Key] = js.native
  def apply(obj: Boolean): IEnumerable[Boolean] = js.native
  def apply(obj: Double): IEnumerable[Double] = js.native
  def apply[T](obj: js.Array[T]): IEnumerable[T] = js.native
  def apply[T](obj: Dictx[T]): IEnumerable[T] = js.native
  def apply[T](obj: IEnumerable[T]): IEnumerable[T] = js.native
}
