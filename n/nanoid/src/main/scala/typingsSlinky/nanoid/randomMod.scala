package typingsSlinky.nanoid

import typingsSlinky.node.Buffer
import typingsSlinky.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  def apply(size: Double): Buffer = js.native
  def apply(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

