package typingsSlinky.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFeature extends js.Object {
  /** [Property] (String) */
  var abstractsummary: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var feature: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var grouping: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var groupingsummary: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var rowbody: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var summary: js.UndefOr[String] = js.native
}

object IFeature {
  @scala.inline
  def apply(): IFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeature]
  }
  @scala.inline
  implicit class IFeatureOps[Self <: IFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbstractsummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstractsummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbstractsummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstractsummary")(js.undefined)
        ret
    }
    @scala.inline
    def withFeature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingsummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingsummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingsummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingsummary")(js.undefined)
        ret
    }
    @scala.inline
    def withRowbody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowbody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowbody")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

