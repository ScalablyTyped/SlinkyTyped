package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic targeting used for targeting dimensions that contains a list of
  * included and excluded numeric IDs.
  */
@js.native
trait SchemaCriteriaTargeting extends js.Object {
  /**
    * A list of numeric IDs to be excluded.
    */
  var excludedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of numeric IDs to be included.
    */
  var targetedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCriteriaTargeting {
  @scala.inline
  def apply(): SchemaCriteriaTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCriteriaTargeting]
  }
  @scala.inline
  implicit class SchemaCriteriaTargetingOps[Self <: SchemaCriteriaTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedCriteriaIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedCriteriaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedCriteriaIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedCriteriaIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetedCriteriaIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedCriteriaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetedCriteriaIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedCriteriaIds")(js.undefined)
        ret
    }
  }
  
}

