package typingsSlinky.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionResponse[T] extends ResponseBase {
  def apply(): typingsSlinky.restfulJs.anon.Headers[T] = js.native
  def body(): js.Array[ResponseBody[T]] = js.native
}

