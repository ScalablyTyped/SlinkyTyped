package typingsSlinky.istextorbinary.mod

import typingsSlinky.istextorbinary.istextorbinaryStrings.binary
import typingsSlinky.istextorbinary.istextorbinaryStrings.utf8
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", "getEncoding")
@js.native
object getEncoding extends js.Object {
  def apply(
    buffer: Buffer,
    opts: js.UndefOr[Options],
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
}

