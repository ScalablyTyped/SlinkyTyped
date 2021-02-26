package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options customizing the data transfer schedule.
  */
@js.native
trait SchemaScheduleOptions extends StObject {
  
  /**
    * If true, automatic scheduling of data transfer runs for this
    * configuration will be disabled. The runs can be started on ad-hoc basis
    * using StartManualTransferRuns API. When automatic scheduling is disabled,
    * the TransferConfig.schedule field will be ignored.
    */
  var disableAutoScheduling: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines time to stop scheduling transfer runs. A transfer run cannot be
    * scheduled at or after the end time. The end time can be changed at any
    * moment. The time when a data transfer can be trigerred manually is not
    * limited by this option.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Specifies time to start scheduling transfer runs. The first run will be
    * scheduled at or after the start time according to a recurrence pattern
    * defined in the schedule string. The start time can be changed at any
    * moment. The time when a data transfer can be trigerred manually is not
    * limited by this option.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaScheduleOptions {
  
  @scala.inline
  def apply(): SchemaScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleOptions]
  }
  
  @scala.inline
  implicit class SchemaScheduleOptionsMutableBuilder[Self <: SchemaScheduleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableAutoScheduling(value: Boolean): Self = StObject.set(x, "disableAutoScheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutoSchedulingUndefined: Self = StObject.set(x, "disableAutoScheduling", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
