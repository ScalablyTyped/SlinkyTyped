package typingsSlinky.hexoFs.anon

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: BufferEncoding | Null
}

object Encoding {
  @scala.inline
  def apply(encoding: BufferEncoding = null): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

