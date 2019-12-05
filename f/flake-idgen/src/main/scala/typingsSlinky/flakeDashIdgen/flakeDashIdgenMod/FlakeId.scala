package typingsSlinky.flakeDashIdgen.flakeDashIdgenMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlakeId extends js.Object {
  def next(): Buffer = js.native
  def next(callback: js.Function2[/* err */ js.Error, /* id */ Buffer, Unit]): Buffer = js.native
}

