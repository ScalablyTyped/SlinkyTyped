package typingsSlinky.hapi.anon

import typingsSlinky.hapi.hapiStrings.annotated
import typingsSlinky.hapi.mod.PayloadOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var output: PayloadOutput | annotated
}

object Output {
  @scala.inline
  def apply(output: PayloadOutput | annotated): Output = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

