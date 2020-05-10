package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.`Brand for OpaqueViewState that nothing will match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpaqueViewState extends js.Object {
  var __brand__ : `Brand for OpaqueViewState that nothing will match` = js.native
}

object OpaqueViewState {
  @scala.inline
  def apply(__brand__ : `Brand for OpaqueViewState that nothing will match`): OpaqueViewState = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueViewState]
  }
  @scala.inline
  implicit class OpaqueViewStateOps[Self <: OpaqueViewState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__brand__(value: `Brand for OpaqueViewState that nothing will match`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__brand__")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

