package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typingsSlinky.applicationinsightsJs.AI.ExceptionDetails
import typingsSlinky.applicationinsightsJs.AI.SeverityLevel
import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typingsSlinky.applicationinsightsJs.anon.Exceptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exception extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Exception: Exceptions = js.native
  var crashThreadId: Double = js.native
  var exceptions: js.Array[ExceptionDetails] = js.native
  var handledAt: String = js.native
  var measurements: js.Any = js.native
  var problemId: String = js.native
  var properties: js.Any = js.native
  var severityLevel: SeverityLevel = js.native
  var ver: Double = js.native
}

object Exception {
  @scala.inline
  def apply(
    aiDataContract: Exceptions,
    crashThreadId: Double,
    exceptions: js.Array[ExceptionDetails],
    handledAt: String,
    measurements: js.Any,
    problemId: String,
    properties: js.Any,
    severityLevel: SeverityLevel,
    ver: Double
  ): Exception = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], crashThreadId = crashThreadId.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], handledAt = handledAt.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], problemId = problemId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAiDataContract(value: Exceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aiDataContract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashThreadId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashThreadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptions(value: js.Array[ExceptionDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandledAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handledAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurements(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProblemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverityLevel(value: SeverityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

