package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISizeModel extends IBase {
  /** [Property] (Boolean) */
  var auto: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculated: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculatedFromConfigured: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculatedFromNatural: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculatedFromShrinkWrap: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var configured: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var constrainedMax: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var constrainedMin: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.native
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var names: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var natural: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var ordinal: js.UndefOr[Double] = js.native
  /** [Property] (Object[]) */
  var pairsByHeightOrdinal: js.UndefOr[Array] = js.native
  /** [Property] (Boolean) */
  var shrinkWrap: js.UndefOr[Boolean] = js.native
}

object ISizeModel {
  @scala.inline
  def apply(): ISizeModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizeModel]
  }
  @scala.inline
  implicit class ISizeModelOps[Self <: ISizeModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculated")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculatedFromConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFromConfigured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedFromConfigured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFromConfigured")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculatedFromNatural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFromNatural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedFromNatural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFromNatural")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculatedFromShrinkWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFromShrinkWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedFromShrinkWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedFromShrinkWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configured")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainedMax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainedMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainedMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainedMax")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainedMin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainedMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainedMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainedMin")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
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
    def withNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withNatural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.undefined)
        ret
    }
    @scala.inline
    def withPairsByHeightOrdinal(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairsByHeightOrdinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPairsByHeightOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairsByHeightOrdinal")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkWrap")(js.undefined)
        ret
    }
  }
  
}

