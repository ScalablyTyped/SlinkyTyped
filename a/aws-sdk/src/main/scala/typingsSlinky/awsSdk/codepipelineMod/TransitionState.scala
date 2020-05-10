package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionState extends js.Object {
  /**
    * The user-specified reason why the transition between two stages of a pipeline was disabled.
    */
  var disabledReason: js.UndefOr[DisabledReason] = js.native
  /**
    * Whether the transition between stages is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The timestamp when the transition state was last changed.
    */
  var lastChangedAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the user who last changed the transition state.
    */
  var lastChangedBy: js.UndefOr[LastChangedBy] = js.native
}

object TransitionState {
  @scala.inline
  def apply(): TransitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionState]
  }
  @scala.inline
  implicit class TransitionStateOps[Self <: TransitionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledReason(value: DisabledReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChangedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChangedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChangedBy(value: LastChangedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChangedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedBy")(js.undefined)
        ret
    }
  }
  
}

