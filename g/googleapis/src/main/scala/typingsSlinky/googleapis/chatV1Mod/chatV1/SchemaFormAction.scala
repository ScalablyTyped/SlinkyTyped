package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A form action describes the behavior when the form is submitted. For
  * example, an Apps Script can be invoked to handle the form.
  */
@js.native
trait SchemaFormAction extends js.Object {
  /**
    * Apps Script function to invoke when the containing element is
    * clicked/activated.
    */
  var actionMethodName: js.UndefOr[String] = js.native
  /**
    * List of action parameters.
    */
  var parameters: js.UndefOr[js.Array[SchemaActionParameter]] = js.native
}

object SchemaFormAction {
  @scala.inline
  def apply(): SchemaFormAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormAction]
  }
  @scala.inline
  implicit class SchemaFormActionOps[Self <: SchemaFormAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMethodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMethodName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[SchemaActionParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

