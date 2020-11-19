package typingsSlinky.fetchMock.mod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchMockSandbox extends FetchMockStatic {
  
  /**
    * Also callable as fetch(). Use `typeof fetch` in your code to define
    * a field that accepts both `fetch()` and a fetch-mock sandbox.
    */
  def apply(): js.Promise[Response] = js.native
  def apply(input: js.UndefOr[scala.Nothing], init: RequestInit): js.Promise[Response] = js.native
  def apply(input: String): js.Promise[Response] = js.native
  def apply(input: String, init: RequestInit): js.Promise[Response] = js.native
  def apply(input: Request): js.Promise[Response] = js.native
  def apply(input: Request, init: RequestInit): js.Promise[Response] = js.native
}
