package typingsSlinky.protractorHttpMock.mod

import typingsSlinky.protractorHttpMock.mod.requests.Delete
import typingsSlinky.protractorHttpMock.mod.requests.Get
import typingsSlinky.protractorHttpMock.mod.requests.Head
import typingsSlinky.protractorHttpMock.mod.requests.Jsonp
import typingsSlinky.protractorHttpMock.mod.requests.Patch
import typingsSlinky.protractorHttpMock.mod.requests.Post
import typingsSlinky.protractorHttpMock.mod.requests.Put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin for custom matching logic with 1 generic type.
  */
@js.native
trait Plugin1[T1] extends js.Object {
  
  def `match`[O /* <: Delete[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  /**
    * Match function.
    * Return a truthy value to indicate successfull match.
    *
    * @param mockRequest The mock to compare request with.
    * @param requestConfig The request object to compare mock with.
    */
  @JSName("match")
  def match_O_GetT1[O /* <: Get[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  @JSName("match")
  def match_O_HeadT1[O /* <: Head[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  @JSName("match")
  def match_O_JsonpT1[O /* <: Jsonp[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  @JSName("match")
  def match_O_PatchT1[O /* <: Patch[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  @JSName("match")
  def match_O_PostT1[O /* <: Post[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  @JSName("match")
  def match_O_PutT1[O /* <: Put[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
}
