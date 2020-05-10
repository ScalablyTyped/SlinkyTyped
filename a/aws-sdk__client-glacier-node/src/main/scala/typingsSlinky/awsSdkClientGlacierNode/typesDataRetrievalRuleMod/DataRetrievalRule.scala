package typingsSlinky.awsSdkClientGlacierNode.typesDataRetrievalRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRetrievalRule extends js.Object {
  /**
    * <p>The maximum number of bytes that can be retrieved in an hour.</p> <p>This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.</p>
    */
  var BytesPerHour: js.UndefOr[Double] = js.native
  /**
    * <p>The type of data retrieval policy to set.</p> <p>Valid values: BytesPerHour|FreeTier|None</p>
    */
  var Strategy: js.UndefOr[String] = js.native
}

object DataRetrievalRule {
  @scala.inline
  def apply(): DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalRule]
  }
  @scala.inline
  implicit class DataRetrievalRuleOps[Self <: DataRetrievalRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesPerHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strategy")(js.undefined)
        ret
    }
  }
  
}

