package typingsSlinky.rxjs

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/fetch", JSImport.Namespace)
@js.native
object fetchMod extends js.Object {
  def fromFetch(input: String): Observable[Response] = js.native
  def fromFetch(input: String, init: RequestInit): Observable[Response] = js.native
  def fromFetch(input: Request): Observable[Response] = js.native
  def fromFetch(input: Request, init: RequestInit): Observable[Response] = js.native
}

