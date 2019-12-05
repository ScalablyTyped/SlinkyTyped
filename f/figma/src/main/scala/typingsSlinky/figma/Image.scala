package typingsSlinky.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Other
trait Image extends js.Object {
  val hash: String
  def getBytesAsync(): js.Promise[scala.scalajs.js.typedarray.Uint8Array]
}

object Image {
  @scala.inline
  def apply(getBytesAsync: () => js.Promise[scala.scalajs.js.typedarray.Uint8Array], hash: String): Image = {
    val __obj = js.Dynamic.literal(getBytesAsync = js.Any.fromFunction0(getBytesAsync), hash = hash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Image]
  }
}

