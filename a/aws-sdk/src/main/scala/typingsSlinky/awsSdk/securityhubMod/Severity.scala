package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Severity extends js.Object {
  /**
    * The severity value of the finding. The allowed values are the following.    INFORMATIONAL - No issue was found.    LOW - The issue does not require action on its own.    MEDIUM - The issue must be addressed but not urgently.    HIGH - The issue must be addressed as a priority.    CRITICAL - The issue must be remediated immediately to avoid it escalating.  
    */
  var Label: js.UndefOr[SeverityLabel] = js.native
  /**
    * Deprecated. This attribute is being deprecated. Instead of providing Normalized, provide Label. If you provide Normalized and do not provide Label, Label is set automatically as follows.    0 - INFORMATIONAL    1–39 - LOW    40–69 - MEDIUM    70–89 - HIGH    90–100 - CRITICAL   
    */
  var Normalized: js.UndefOr[Integer] = js.native
  /**
    * The native severity as defined by the AWS service or integrated partner product that generated the finding.
    */
  var Product: js.UndefOr[Double] = js.native
}

object Severity {
  @scala.inline
  def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  @scala.inline
  implicit class SeverityOps[Self <: Severity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: SeverityLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalized(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Normalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Normalized")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(js.undefined)
        ret
    }
  }
  
}

