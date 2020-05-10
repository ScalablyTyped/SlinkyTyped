package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestReturnResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCreateTestReturnResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the newly created test order return.
    */
  var returnId: js.UndefOr[String] = js.native
}

object SchemaOrdersCreateTestReturnResponse {
  @scala.inline
  def apply(): SchemaOrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnResponse]
  }
  @scala.inline
  implicit class SchemaOrdersCreateTestReturnResponseOps[Self <: SchemaOrdersCreateTestReturnResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnId")(js.undefined)
        ret
    }
  }
  
}

