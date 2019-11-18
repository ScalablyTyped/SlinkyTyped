package typingsSlinky.node.osMod

import typingsSlinky.node.Anon_E2BIG
import typingsSlinky.node.Anon_PRIORITYABOVENORMAL
import typingsSlinky.node.Anon_SIGABRT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "constants")
@js.native
object constants extends js.Object {
  var UV_UDP_REUSEADDR: Double = js.native
  var errno: Anon_E2BIG = js.native
  var priority: Anon_PRIORITYABOVENORMAL = js.native
  // signals: { [key in NodeJS.Signals]: number; }; @todo: change after migration to typescript 2.1
  var signals: Anon_SIGABRT = js.native
}

