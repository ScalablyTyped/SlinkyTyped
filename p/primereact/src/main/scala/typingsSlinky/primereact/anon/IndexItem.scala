package typingsSlinky.primereact.anon

import typingsSlinky.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexItem extends js.Object {
  var index: Double
  var item: MenuItem
  var originalEvent: org.scalajs.dom.raw.Event
}

object IndexItem {
  @scala.inline
  def apply(index: Double, item: MenuItem, originalEvent: org.scalajs.dom.raw.Event): IndexItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexItem]
  }
}

