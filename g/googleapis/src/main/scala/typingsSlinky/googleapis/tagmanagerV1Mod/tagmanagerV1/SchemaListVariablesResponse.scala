package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Variables Response.
  */
@js.native
trait SchemaListVariablesResponse extends js.Object {
  /**
    * All GTM Variables of a GTM Container.
    */
  var variables: js.UndefOr[js.Array[SchemaVariable]] = js.native
}

object SchemaListVariablesResponse {
  @scala.inline
  def apply(): SchemaListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVariablesResponse]
  }
  @scala.inline
  implicit class SchemaListVariablesResponseOps[Self <: SchemaListVariablesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariables(value: js.Array[SchemaVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

