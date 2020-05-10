package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultProvenance extends js.Object {
  /**
    * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter
    * transformed into the result.
    */
  var conversionSources: js.UndefOr[js.Array[PhysicalLocation]] = js.native
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first
    * detected.
    */
  var firstDetectionRunGuid: js.UndefOr[String] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time
    * properties" in the SARIF spec for the required format.
    */
  var firstDetectionTimeUtc: js.UndefOr[String] = js.native
  /**
    * The index within the run.invocations array of the invocation object which describes the tool invocation that
    * detected the result.
    */
  var invocationIndex: js.UndefOr[Double] = js.native
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most
    * recently detected.
    */
  var lastDetectionRunGuid: js.UndefOr[String] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastDetectionTimeUtc: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object ResultProvenance {
  @scala.inline
  def apply(): ResultProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultProvenance]
  }
  @scala.inline
  implicit class ResultProvenanceOps[Self <: ResultProvenance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionSources(value: js.Array[PhysicalLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionSources")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDetectionRunGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDetectionRunGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDetectionRunGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDetectionRunGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDetectionTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDetectionTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDetectionTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDetectionTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocationIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDetectionRunGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDetectionRunGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDetectionRunGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDetectionRunGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDetectionTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDetectionTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDetectionTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDetectionTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

