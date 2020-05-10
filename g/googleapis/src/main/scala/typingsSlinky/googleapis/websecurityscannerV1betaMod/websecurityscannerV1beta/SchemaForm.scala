package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ! Information about a vulnerability with an HTML.
  */
@js.native
trait SchemaForm extends js.Object {
  /**
    * ! The URI where to send the form when it&#39;s submitted.
    */
  var actionUri: js.UndefOr[String] = js.native
  /**
    * ! The names of form fields related to the vulnerability.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
}

object SchemaForm {
  @scala.inline
  def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  @scala.inline
  implicit class SchemaFormOps[Self <: SchemaForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionUri")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

