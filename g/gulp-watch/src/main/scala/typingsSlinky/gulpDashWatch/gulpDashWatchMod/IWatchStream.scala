package typingsSlinky.gulpDashWatch.gulpDashWatchMod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWatchStream
  extends ReadableStream
     with WritableStream {
  def add(path: String): ReadWriteStream = js.native
  def add(path: js.Array[String]): ReadWriteStream = js.native
  def close(): ReadWriteStream = js.native
  def unwatch(path: String): ReadWriteStream = js.native
  def unwatch(path: js.Array[String]): ReadWriteStream = js.native
}

