package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for double properties.
  */
@js.native
trait SchemaDoublePropertyOptions extends js.Object {
  /**
    * If set, describes how the double should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDoubleOperatorOptions] = js.native
}

object SchemaDoublePropertyOptions {
  @scala.inline
  def apply(): SchemaDoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoublePropertyOptions]
  }
  @scala.inline
  implicit class SchemaDoublePropertyOptionsOps[Self <: SchemaDoublePropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatorOptions(value: SchemaDoubleOperatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorOptions")(js.undefined)
        ret
    }
  }
  
}

