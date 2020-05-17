package typingsSlinky.googleCloudPubsub.srcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudPubsub.srcPubsubMod.PagedCallback[T, R]
  - typingsSlinky.googleCloudPubsub.srcPubsubMod.NormalCallback[T]
*/
trait RequestCallback[T, R] extends js.Object

object RequestCallback {
  @scala.inline
  implicit def apply[T, R](value: NormalCallback[T]): RequestCallback[T, R] = value.asInstanceOf[RequestCallback[T, R]]
  @scala.inline
  implicit def apply[T, R](value: PagedCallback[T, R]): RequestCallback[T, R] = value.asInstanceOf[RequestCallback[T, R]]
}

