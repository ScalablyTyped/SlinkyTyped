package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to provide a search operator for double properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
@js.native
trait SchemaDoubleOperatorOptions extends js.Object {
  /**
    * Indicates the operator name required in the query in order to use the
    * double property in sorting or as a facet. The operator name can only
    * contain lowercase letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}

object SchemaDoubleOperatorOptions {
  @scala.inline
  def apply(): SchemaDoubleOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleOperatorOptions]
  }
  @scala.inline
  implicit class SchemaDoubleOperatorOptionsOps[Self <: SchemaDoubleOperatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(js.undefined)
        ret
    }
  }
  
}

