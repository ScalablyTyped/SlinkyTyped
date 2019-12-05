package typingsSlinky.listDashStream.listDashStreamMod

import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamMethod extends js.Object {
  def apply(): ListStream = js.native
  def apply(callback: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ListStream = js.native
  def apply(options: DuplexOptions): ListStream = js.native
  def apply(options: DuplexOptions, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[_], Unit]): ListStream = js.native
}

