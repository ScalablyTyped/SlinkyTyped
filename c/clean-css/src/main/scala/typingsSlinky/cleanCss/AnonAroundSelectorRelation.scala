package typingsSlinky.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAroundSelectorRelation extends js.Object {
  /**
    * Controls if spaces come around selector relations; e.g. `div > a`; defaults to `false`
    */
  var aroundSelectorRelation: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a space comes before a block begins; e.g. `.block {`; defaults to `false`
    */
  var beforeBlockBegins: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a space comes before a value; e.g. `width: 1rem`; defaults to `false`
    */
  var beforeValue: js.UndefOr[Boolean] = js.native
}

object AnonAroundSelectorRelation {
  @scala.inline
  def apply(): AnonAroundSelectorRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAroundSelectorRelation]
  }
  @scala.inline
  implicit class AnonAroundSelectorRelationOps[Self <: AnonAroundSelectorRelation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAroundSelectorRelation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundSelectorRelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundSelectorRelation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundSelectorRelation")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlockBegins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlockBegins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBlockBegins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlockBegins")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValue")(js.undefined)
        ret
    }
  }
  
}

