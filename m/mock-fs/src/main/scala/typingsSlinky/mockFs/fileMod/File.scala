package typingsSlinky.mockFs.fileMod

import typingsSlinky.mockFs.itemMod.Item
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends Item {
  /** Get the file contents. */
  def getContent(): Buffer = js.native
  /** Set the file contents. */
  def setContent(content: String): Unit = js.native
  def setContent(content: Buffer): Unit = js.native
}

