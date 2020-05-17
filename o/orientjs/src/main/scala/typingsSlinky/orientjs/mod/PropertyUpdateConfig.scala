package typingsSlinky.orientjs.mod

import typingsSlinky.orientjs.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyUpdateConfig extends js.Object {
  var collate: js.UndefOr[String] = js.native
  var custom: js.UndefOr[Fields] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var linkedClass: js.UndefOr[String] = js.native
  var linkedType: js.UndefOr[String] = js.native
  var mandatory: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: String = js.native
  var notNull: js.UndefOr[Boolean] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var regexp: js.UndefOr[js.RegExp | String] = js.native
  var `type`: PropertyType = js.native
}

object PropertyUpdateConfig {
  @scala.inline
  def apply(name: String, `type`: PropertyType): PropertyUpdateConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdateConfig]
  }
  @scala.inline
  implicit class PropertyUpdateConfigOps[Self <: PropertyUpdateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedType")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNotNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexpRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexp(value: js.RegExp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(js.undefined)
        ret
    }
  }
  
}

