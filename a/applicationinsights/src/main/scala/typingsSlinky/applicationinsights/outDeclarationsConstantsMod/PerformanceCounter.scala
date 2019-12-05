package typingsSlinky.applicationinsights.outDeclarationsConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PerformanceCounter extends js.Object

@JSImport("applicationinsights/out/Declarations/Constants", "PerformanceCounter")
@js.native
object PerformanceCounter extends js.Object {
  @js.native
  sealed trait AVAILABLE_BYTES extends PerformanceCounter
  
  @js.native
  sealed trait PRIVATE_BYTES extends PerformanceCounter
  
  @js.native
  sealed trait PROCESSOR_TIME extends PerformanceCounter
  
  @js.native
  sealed trait PROCESS_TIME extends PerformanceCounter
  
  @js.native
  sealed trait REQUEST_DURATION extends PerformanceCounter
  
  @js.native
  sealed trait REQUEST_RATE extends PerformanceCounter
  
  /* "\\Memory\\Available Bytes" */ val AVAILABLE_BYTES: typingsSlinky.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.AVAILABLE_BYTES with String = js.native
  /* "\\Process(??APP_WIN32_PROC??)\\Private Bytes" */ val PRIVATE_BYTES: typingsSlinky.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.PRIVATE_BYTES with String = js.native
  /* "\\Processor(_Total)\\% Processor Time" */ val PROCESSOR_TIME: typingsSlinky.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.PROCESSOR_TIME with String = js.native
  /* "\\Process(??APP_WIN32_PROC??)\\% Processor Time" */ val PROCESS_TIME: typingsSlinky.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.PROCESS_TIME with String = js.native
  /* "\\ASP.NET Applications(??APP_W3SVC_PROC??)\\Request Execution Time" */ val REQUEST_DURATION: typingsSlinky.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.REQUEST_DURATION with String = js.native
  /* "\\ASP.NET Applications(??APP_W3SVC_PROC??)\\Requests/Sec" */ val REQUEST_RATE: typingsSlinky.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.REQUEST_RATE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PerformanceCounter with String] = js.native
}

