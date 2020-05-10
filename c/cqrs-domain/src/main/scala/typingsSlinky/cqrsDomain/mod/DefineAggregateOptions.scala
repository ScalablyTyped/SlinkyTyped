package typingsSlinky.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineAggregate
@js.native
trait DefineAggregateOptions extends js.Object {
  /**
    * optional, default false
    * only optionally needed when skipHistory is set to true, only the last event will be loaded and applyed
    */
  var applyLastEvent: js.UndefOr[Boolean] = js.native
  /**
    * optional, default ''
    */
  var defaultCommandPayload: js.UndefOr[String] = js.native
  /**
    * optional, default ''
    */
  var defaultEventPayload: js.UndefOr[String] = js.native
  /**
    * optional, default ''
    */
  var defaultPreConditionPayload: js.UndefOr[String] = js.native
  /**
    * optional, default false
    * will publish the events but will not commit them to the eventstore
    */
  var disablePersistence: js.UndefOr[Boolean] = js.native
  /**
    * optional, default is last part of path name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * optional, default false
    * by skipping the history, only the last event will be loaded and defaultly not applyed (just to ensure the revision number increment)
    */
  var skipHistory: js.UndefOr[Boolean] = js.native
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.native
}

object DefineAggregateOptions {
  @scala.inline
  def apply(): DefineAggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineAggregateOptions]
  }
  @scala.inline
  implicit class DefineAggregateOptionsOps[Self <: DefineAggregateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyLastEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLastEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyLastEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLastEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCommandPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCommandPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCommandPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCommandPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEventPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEventPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPreConditionPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPreConditionPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPreConditionPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPreConditionPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    @scala.inline
    def withSkipHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

