package typingsSlinky.nodeJsflRunner.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jsfl-runner", "deleteJSFL")
@js.native
object deleteJSFL extends js.Object {
  def apply(fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

