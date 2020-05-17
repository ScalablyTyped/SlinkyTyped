package typingsSlinky.googleCloudPubsub.srcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[js.Array[Item]]
  - js.Tuple3[js.Array[Item], js.Object | scala.Null, Response]
*/
trait PagedResponse[Item, Response] extends js.Object

object PagedResponse {
  @scala.inline
  implicit def apply[Item, Response](value: js.Array[js.Array[Item]]): PagedResponse[Item, Response] = value.asInstanceOf[PagedResponse[Item, Response]]
  @scala.inline
  implicit def apply[Item, Response](value: js.Tuple3[js.Array[Item], js.Object | Null, Response]): PagedResponse[Item, Response] = value.asInstanceOf[PagedResponse[Item, Response]]
}

