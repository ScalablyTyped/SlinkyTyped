package typingsSlinky.next.routerMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentRes extends js.Object {
  var mod: js.Any
  var page: ReactComponentClass[js.Object]
}

object ComponentRes {
  @scala.inline
  def apply(mod: js.Any, page: ReactComponentClass[js.Object]): ComponentRes = {
    val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRes]
  }
}

