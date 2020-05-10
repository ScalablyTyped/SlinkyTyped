package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outcome extends js.Object {
  /**
    * The timestamp when the outcome was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The outcome description.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The timestamp when the outcome was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The outcome name.
    */
  var name: js.UndefOr[identifier] = js.native
}

object Outcome {
  @scala.inline
  def apply(): Outcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outcome]
  }
  @scala.inline
  implicit class OutcomeOps[Self <: Outcome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

