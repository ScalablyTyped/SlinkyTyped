package typingsSlinky.detectBrowser.mod

import typingsSlinky.detectBrowser.detectBrowserStrings.node
import typingsSlinky.node.processMod.global.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "NodeInfo")
@js.native
class NodeInfo protected () extends DetectedInfo[node, node, Platform, String] {
  def this(version: String) = this()
  @JSName("type")
  val type_NodeInfo: /* "node" */ String = js.native
}

