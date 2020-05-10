package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ConsumerInfo` provides information about the consumer.
  */
@js.native
trait SchemaConsumerInfo extends js.Object {
  /**
    * The consumer identity number, can be Google cloud project number, folder
    * number or organization number e.g. 1234567890. A value of 0 indicates no
    * consumer number is found.
    */
  var consumerNumber: js.UndefOr[String] = js.native
  /**
    * The Google cloud project number, e.g. 1234567890. A value of 0 indicates
    * no project number is found.  NOTE: This field is deprecated after Chemist
    * support flexible consumer id. New code should not depend on this field
    * anymore.
    */
  var projectNumber: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaConsumerInfo {
  @scala.inline
  def apply(): SchemaConsumerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumerInfo]
  }
  @scala.inline
  implicit class SchemaConsumerInfoOps[Self <: SchemaConsumerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

