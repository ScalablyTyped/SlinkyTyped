package typingsSlinky.officeUiFabricReact.ithemeslotruleMod

import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.officeUiFabricReact.shadesMod.Shade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeSlotRule extends js.Object {
  /** If set, this slot is the specified shade of the slot it inherits from. */
  var asShade: js.UndefOr[Shade] = js.native
  /** The actual color this theme slot is if it is a color. */
  var color: js.UndefOr[IColor] = js.native
  /**
    * A collection of rules that inherit from this one. It is the responsibility of the inheriting rule to add
    * itself to its parent's dependentRules collection.
    */
  var dependentRules: js.Array[IThemeSlotRule] = js.native
  /** The theme slot this slot is based on. */
  var inherits: js.UndefOr[IThemeSlotRule] = js.native
  /**
    * Whether this slot is a background shade, which uses different logic for generating its inheriting-as-shade value.
    */
  var isBackgroundShade: js.UndefOr[Boolean] = js.native
  /** Whether this slot has been manually overridden (else, it was automatically generated based on inheritance). */
  var isCustomized: js.UndefOr[Boolean] = js.native
  /** The name of this theme slot. */
  var name: String = js.native
  /** The value of this slot if it is NOT a color. Must be falsey if not a color. */
  var value: js.UndefOr[String] = js.native
}

object IThemeSlotRule {
  @scala.inline
  def apply(dependentRules: js.Array[IThemeSlotRule], name: String): IThemeSlotRule = {
    val __obj = js.Dynamic.literal(dependentRules = dependentRules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeSlotRule]
  }
  @scala.inline
  implicit class IThemeSlotRuleOps[Self <: IThemeSlotRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependentRules(value: js.Array[IThemeSlotRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsShade(value: Shade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asShade")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withInherits(value: IThemeSlotRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBackgroundShade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackgroundShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBackgroundShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackgroundShade")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCustomized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCustomized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomized")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

