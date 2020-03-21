package typingsSlinky.divaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivaState extends js.Object {
  var toolbar: Null
  var viewerCore: typingsSlinky.divaJs.viewerCoreMod.default
}

object DivaState {
  @scala.inline
  def apply(toolbar: Null, viewerCore: typingsSlinky.divaJs.viewerCoreMod.default): DivaState = {
    val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any], viewerCore = viewerCore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DivaState]
  }
}

