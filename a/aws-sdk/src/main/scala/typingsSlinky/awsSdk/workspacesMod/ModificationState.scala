package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModificationState extends js.Object {
  /**
    * The resource.
    */
  var Resource: js.UndefOr[ModificationResourceEnum] = js.native
  /**
    * The modification state.
    */
  var State: js.UndefOr[ModificationStateEnum] = js.native
}

object ModificationState {
  @scala.inline
  def apply(): ModificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModificationState]
  }
  @scala.inline
  implicit class ModificationStateOps[Self <: ModificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: ModificationResourceEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ModificationStateEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

