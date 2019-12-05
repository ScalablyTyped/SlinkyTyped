package typingsSlinky.atMaterialDashUiLab

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var endAdornment: TagMod[Any]
  var ref: Ref[_]
  var startAdornment: TagMod[Any]
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, endAdornment: TagMod[Any], startAdornment: TagMod[Any], ref: Ref[_] = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endAdornment = endAdornment.asInstanceOf[js.Any], startAdornment = startAdornment.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

