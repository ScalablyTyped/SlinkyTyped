package typingsSlinky.jpm.contextMenuMod

import org.scalajs.dom.experimental.URL
import typingsSlinky.jpm.anon.ContentScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends ItemMenuSeparator {
  var contentScript: String | js.Array[String]
  var contentScriptFile: String | js.Array[String]
  var context: ItemContext
  var image: String | URL
  var items: js.Array[ItemMenuSeparator]
  var label: String
  var parentMenu: js.UndefOr[Menu] = js.undefined
  def addItem(item: ItemMenuSeparator): Unit
  def destroy(): Unit
  def removeItem(item: ItemMenuSeparator): Unit
}

@JSImport("sdk/context-menu", "Menu")
@js.native
object Menu extends js.Object {
  def apply(options: ContentScript): Menu = js.native
}

