package typingsSlinky.htmlDashPdf.htmlDashPdfMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResult extends js.Object {
  def toBuffer(callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]): Unit = js.native
  def toFile(): Unit = js.native
  def toFile(callback: js.Function2[/* err */ Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toFile(filename: String): Unit = js.native
  def toFile(filename: String, callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toStream(callback: js.Function2[/* err */ js.Error, /* stream */ ReadStream, Unit]): Unit = js.native
}

