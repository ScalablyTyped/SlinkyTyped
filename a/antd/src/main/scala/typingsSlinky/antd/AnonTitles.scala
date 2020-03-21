package typingsSlinky.antd

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitles extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: TagMod[Any]
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object AnonTitles {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    notFoundContent: TagMod[Any],
    searchPlaceholder: String,
    titles: js.Array[String]
  ): AnonTitles = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTitles]
  }
}

