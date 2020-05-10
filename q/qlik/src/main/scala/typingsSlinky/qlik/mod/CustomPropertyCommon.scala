package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.array
import typingsSlinky.qlik.qlikStrings.boolean
import typingsSlinky.qlik.qlikStrings.integer
import typingsSlinky.qlik.qlikStrings.items
import typingsSlinky.qlik.qlikStrings.number
import typingsSlinky.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyCommon extends js.Object {
  var label: js.UndefOr[String] = js.native
  var ref: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean | ShowFunction] = js.native
  var `type`: js.UndefOr[string | integer | number | array | boolean | items] = js.native
}

object CustomPropertyCommon {
  @scala.inline
  def apply(): CustomPropertyCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCommon]
  }
  @scala.inline
  implicit class CustomPropertyCommonOps[Self <: CustomPropertyCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFunction3(
      value: (/* layout */ Layout, /* cls */ js.Any, /* obj */ js.Any) => Boolean | (js.Function1[/* measure */ NxMeasure, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShow(value: Boolean | ShowFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: string | integer | number | array | boolean | items): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

