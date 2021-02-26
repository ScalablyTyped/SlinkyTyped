package typingsSlinky.firebasePerformance

import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`FB not default`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid String merger input`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid custom metric name`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no api key`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no app id`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no project id`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no window`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`nonpositive trace duration`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`nonpositive trace startTime`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`trace started`
import typingsSlinky.firebasePerformance.firebasePerformanceStrings.`trace stopped`
import typingsSlinky.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/performance/dist/src/utils/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[ErrorCode, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`trace started`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`trace stopped`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`nonpositive trace startTime`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`nonpositive trace duration`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no window`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no app id`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no project id`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`no api key`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`FB not default`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid custom metric name`
    - typingsSlinky.firebasePerformance.firebasePerformanceStrings.`invalid String merger input`
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    @scala.inline
    def FB_NOT_DEFAULT: `FB not default` = ("FB not default").asInstanceOf[`FB not default`]
    
    @scala.inline
    def INVALID_ATTRIBUTE_NAME: `invalid attribute name` = ("invalid attribute name").asInstanceOf[`invalid attribute name`]
    
    @scala.inline
    def INVALID_ATTRIBUTE_VALUE: `invalid attribute value` = ("invalid attribute value").asInstanceOf[`invalid attribute value`]
    
    @scala.inline
    def INVALID_CC_LOG: `invalid cc log` = ("invalid cc log").asInstanceOf[`invalid cc log`]
    
    @scala.inline
    def INVALID_CUSTOM_METRIC_NAME: `invalid custom metric name` = ("invalid custom metric name").asInstanceOf[`invalid custom metric name`]
    
    @scala.inline
    def INVALID_STRING_MERGER_PARAMETER: `invalid String merger input` = ("invalid String merger input").asInstanceOf[`invalid String merger input`]
    
    @scala.inline
    def NONPOSITIVE_TRACE_DURATION: `nonpositive trace duration` = ("nonpositive trace duration").asInstanceOf[`nonpositive trace duration`]
    
    @scala.inline
    def NONPOSITIVE_TRACE_START_TIME: `nonpositive trace startTime` = ("nonpositive trace startTime").asInstanceOf[`nonpositive trace startTime`]
    
    @scala.inline
    def NO_API_KEY: `no api key` = ("no api key").asInstanceOf[`no api key`]
    
    @scala.inline
    def NO_APP_ID: `no app id` = ("no app id").asInstanceOf[`no app id`]
    
    @scala.inline
    def NO_PROJECT_ID: `no project id` = ("no project id").asInstanceOf[`no project id`]
    
    @scala.inline
    def NO_WINDOW: `no window` = ("no window").asInstanceOf[`no window`]
    
    @scala.inline
    def RC_NOT_OK: `RC response not ok` = ("RC response not ok").asInstanceOf[`RC response not ok`]
    
    @scala.inline
    def TRACE_STARTED_BEFORE: `trace started` = ("trace started").asInstanceOf[`trace started`]
    
    @scala.inline
    def TRACE_STOPPED_BEFORE: `trace stopped` = ("trace stopped").asInstanceOf[`trace stopped`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
