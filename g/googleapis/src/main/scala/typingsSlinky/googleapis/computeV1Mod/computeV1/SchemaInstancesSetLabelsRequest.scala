package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetLabelsRequest extends js.Object {
  /**
    * Fingerprint of the previous set of labels for this resource, used to
    * prevent conflicts. Provide the latest fingerprint value when making a
    * request to add or change labels.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaInstancesSetLabelsRequest {
  @scala.inline
  def apply(): SchemaInstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetLabelsRequest]
  }
  @scala.inline
  implicit class SchemaInstancesSetLabelsRequestOps[Self <: SchemaInstancesSetLabelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

