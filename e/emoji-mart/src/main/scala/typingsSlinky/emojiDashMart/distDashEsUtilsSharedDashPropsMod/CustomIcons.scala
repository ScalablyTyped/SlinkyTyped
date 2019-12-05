package typingsSlinky.emojiDashMart.distDashEsUtilsSharedDashPropsMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIcons extends js.Object {
  var categories: Record[CategoryName, js.Function0[ReactComponentClass[js.Object]]]
}

object CustomIcons {
  @scala.inline
  def apply(categories: Record[CategoryName, js.Function0[ReactComponentClass[js.Object]]]): CustomIcons = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomIcons]
  }
}

