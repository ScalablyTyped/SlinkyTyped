package typingsSlinky.htmlPdf.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResult extends js.Object {
  def toBuffer(callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]): Unit = js.native
  def toFile(): Unit = js.native
  def toFile(callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toFile(
    filename: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]
  ): Unit = js.native
  def toFile(filename: String): Unit = js.native
  def toFile(filename: String, callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toStream(callback: js.Function2[/* err */ js.Error, /* stream */ ReadStream, Unit]): Unit = js.native
}

