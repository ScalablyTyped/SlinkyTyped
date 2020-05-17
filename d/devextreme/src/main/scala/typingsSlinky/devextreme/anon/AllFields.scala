package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllFields extends js.Object {
  var allFields: js.UndefOr[String] = js.native
  var columnFields: js.UndefOr[String] = js.native
  var dataFields: js.UndefOr[String] = js.native
  var filterFields: js.UndefOr[String] = js.native
  var rowFields: js.UndefOr[String] = js.native
}

object AllFields {
  @scala.inline
  def apply(): AllFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllFields]
  }
  @scala.inline
  implicit class AllFieldsOps[Self <: AllFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFields")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFields")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFields")(js.undefined)
        ret
    }
  }
  
}

