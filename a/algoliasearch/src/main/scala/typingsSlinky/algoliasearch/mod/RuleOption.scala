package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes option used when making operation on query rules
  */
@js.native
trait RuleOption extends js.Object {
  /**
    * Replace all existing query rules on the index with the content of the batch
    */
  var clearExistingRules: js.UndefOr[Boolean] = js.native
  /**
    * You can forward all settings updates to the replicas of an index
    */
  var forwardToReplicas: js.UndefOr[Boolean] = js.native
}

object RuleOption {
  @scala.inline
  def apply(): RuleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleOption]
  }
  @scala.inline
  implicit class RuleOptionOps[Self <: RuleOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearExistingRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearExistingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearExistingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearExistingRules")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardToReplicas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardToReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardToReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardToReplicas")(js.undefined)
        ret
    }
  }
  
}

