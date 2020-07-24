package typingsSlinky.node.processMod.global.NodeJS

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends ReadableStream
     with WritableStream {
  var isTTY: js.UndefOr[`true`] = js.native
}

