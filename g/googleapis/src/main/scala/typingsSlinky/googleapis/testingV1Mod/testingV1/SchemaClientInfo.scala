package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the client which invoked the test.
  */
@js.native
trait SchemaClientInfo extends js.Object {
  /**
    * The list of detailed information about client.
    */
  var clientInfoDetails: js.UndefOr[js.Array[SchemaClientInfoDetail]] = js.native
  /**
    * Required. Client name, such as gcloud.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaClientInfo {
  @scala.inline
  def apply(): SchemaClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfo]
  }
  @scala.inline
  implicit class SchemaClientInfoOps[Self <: SchemaClientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientInfoDetails(value: js.Array[SchemaClientInfoDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfoDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientInfoDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfoDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

