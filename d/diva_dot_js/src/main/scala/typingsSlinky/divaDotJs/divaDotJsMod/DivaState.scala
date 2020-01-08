package typingsSlinky.divaDotJs.divaDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivaState extends js.Object {
  var toolbar: Null
  var viewerCore: typingsSlinky.divaDotJs.viewerDashCoreMod.default
}

object DivaState {
  @scala.inline
  def apply(toolbar: Null, viewerCore: typingsSlinky.divaDotJs.viewerDashCoreMod.default): DivaState = {
    val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any], viewerCore = viewerCore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DivaState]
  }
}

