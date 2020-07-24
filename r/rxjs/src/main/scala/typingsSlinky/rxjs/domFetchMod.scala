package typingsSlinky.rxjs

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.rxjs.anon.Selector
import typingsSlinky.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/fetch", JSImport.Namespace)
@js.native
object domFetchMod extends js.Object {
  def fromFetch(input: String): Observable[Response] = js.native
  def fromFetch(input: String, init: RequestInit): Observable[Response] = js.native
  def fromFetch(input: Request): Observable[Response] = js.native
  def fromFetch(input: Request, init: RequestInit): Observable[Response] = js.native
  @JSName("fromFetch")
  def fromFetch_T[T](input: String, init: RequestInit with Selector[T]): Observable[T] = js.native
  @JSName("fromFetch")
  def fromFetch_T[T](input: Request, init: RequestInit with Selector[T]): Observable[T] = js.native
}

