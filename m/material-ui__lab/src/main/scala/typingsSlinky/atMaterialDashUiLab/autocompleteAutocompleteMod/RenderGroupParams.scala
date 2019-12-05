package typingsSlinky.atMaterialDashUiLab.autocompleteAutocompleteMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderGroupParams extends js.Object {
  var children: TagMod[Any]
  var key: String
}

object RenderGroupParams {
  @scala.inline
  def apply(children: TagMod[Any], key: String): RenderGroupParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderGroupParams]
  }
}

