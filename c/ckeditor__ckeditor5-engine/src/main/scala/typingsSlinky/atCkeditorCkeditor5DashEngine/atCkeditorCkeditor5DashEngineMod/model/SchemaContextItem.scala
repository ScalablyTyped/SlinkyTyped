package typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaContextItem extends js.Object {
  var getAttributeKeys: js.Iterable[String]
  var name: String
  def getAttribute(key: String): String
}

object SchemaContextItem {
  @scala.inline
  def apply(getAttribute: String => String, getAttributeKeys: js.Iterable[String], name: String): SchemaContextItem = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributeKeys = getAttributeKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaContextItem]
  }
}

