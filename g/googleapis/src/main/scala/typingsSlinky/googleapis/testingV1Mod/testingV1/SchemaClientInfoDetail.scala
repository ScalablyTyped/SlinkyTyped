package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key-value pair of detailed information about the client which invoked the
  * test. Examples: {&#39;Version&#39;, &#39;1.0&#39;}, {&#39;Release
  * Track&#39;, &#39;BETA&#39;}.
  */
@js.native
trait SchemaClientInfoDetail extends js.Object {
  /**
    * Required. The key of detailed client information.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Required. The value of detailed client information.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaClientInfoDetail {
  @scala.inline
  def apply(): SchemaClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfoDetail]
  }
  @scala.inline
  implicit class SchemaClientInfoDetailOps[Self <: SchemaClientInfoDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

