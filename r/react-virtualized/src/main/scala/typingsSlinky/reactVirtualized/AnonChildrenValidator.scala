package typingsSlinky.reactVirtualized

import slinky.core.TagMod
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenValidator extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]]
}

object AnonChildrenValidator {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]]): AnonChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildrenValidator]
  }
}

