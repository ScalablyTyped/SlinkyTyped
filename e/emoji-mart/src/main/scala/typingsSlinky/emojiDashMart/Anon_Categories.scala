package typingsSlinky.emojiDashMart

import typingsSlinky.emojiDashMart.distDashEsUtilsSharedDashPropsMod.CategoryName
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Categories extends js.Object {
  var categories: Partial[Record[CategoryName, String]]
}

object Anon_Categories {
  @scala.inline
  def apply(categories: Partial[Record[CategoryName, String]]): Anon_Categories = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Categories]
  }
}

