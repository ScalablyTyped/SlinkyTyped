package typingsSlinky.applicationinsightsJs.global

import typingsSlinky.applicationinsightsJs.AI.DataPointType
import typingsSlinky.applicationinsightsJs.AI.DependencyKind
import typingsSlinky.applicationinsightsJs.AI.DependencySourceType
import typingsSlinky.applicationinsightsJs.AI.SeverityLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AI")
@js.native
object AI extends js.Object {
  @js.native
  class DataPoint ()
    extends typingsSlinky.applicationinsightsJs.AI.DataPoint {
    /* CompleteClass */
    override var count: Double = js.native
    /* CompleteClass */
    override var kind: DataPointType = js.native
    /* CompleteClass */
    override var max: Double = js.native
    /* CompleteClass */
    override var min: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var stdDev: Double = js.native
    /* CompleteClass */
    override var value: Double = js.native
  }
  
  @js.native
  class EventData ()
    extends typingsSlinky.applicationinsightsJs.AI.EventData {
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class ExceptionDetails ()
    extends typingsSlinky.applicationinsightsJs.AI.ExceptionDetails {
    /* CompleteClass */
    override var hasFullStack: Boolean = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var outerId: Double = js.native
    /* CompleteClass */
    override var parsedStack: js.Array[typingsSlinky.applicationinsightsJs.AI.StackFrame] = js.native
    /* CompleteClass */
    override var stack: String = js.native
    /* CompleteClass */
    override var typeName: String = js.native
  }
  
  @js.native
  class MessageData ()
    extends typingsSlinky.applicationinsightsJs.AI.MessageData {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var severityLevel: SeverityLevel = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class PageViewData ()
    extends typingsSlinky.applicationinsightsJs.AI.PageViewData {
    /* CompleteClass */
    override var duration: String = js.native
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var referrer: String = js.native
    /* CompleteClass */
    override var referrerData: String = js.native
    /* CompleteClass */
    override var url: String = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class PageViewPerfData ()
    extends typingsSlinky.applicationinsightsJs.AI.PageViewPerfData {
    /* CompleteClass */
    override var domProcessing: String = js.native
    /* CompleteClass */
    override var duration: String = js.native
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var networkConnect: String = js.native
    /* CompleteClass */
    override var perfTotal: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var receivedResponse: String = js.native
    /* CompleteClass */
    override var referrer: String = js.native
    /* CompleteClass */
    override var referrerData: String = js.native
    /* CompleteClass */
    override var sentRequest: String = js.native
    /* CompleteClass */
    override var url: String = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class RemoteDependencyData ()
    extends typingsSlinky.applicationinsightsJs.AI.RemoteDependencyData {
    /* CompleteClass */
    override var async: Boolean = js.native
    /* CompleteClass */
    override var commandName: String = js.native
    /* CompleteClass */
    override var count: Double = js.native
    /* CompleteClass */
    override var dependencyKind: DependencyKind = js.native
    /* CompleteClass */
    override var dependencySource: DependencySourceType = js.native
    /* CompleteClass */
    override var dependencyTypeName: String = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var kind: DataPointType = js.native
    /* CompleteClass */
    override var max: Double = js.native
    /* CompleteClass */
    override var min: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var resultCode: String = js.native
    /* CompleteClass */
    override var stdDev: Double = js.native
    /* CompleteClass */
    override var success: Boolean = js.native
    /* CompleteClass */
    override var value: Double = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class StackFrame ()
    extends typingsSlinky.applicationinsightsJs.AI.StackFrame {
    /* CompleteClass */
    override var assembly: String = js.native
    /* CompleteClass */
    override var fileName: String = js.native
    /* CompleteClass */
    override var level: Double = js.native
    /* CompleteClass */
    override var line: Double = js.native
    /* CompleteClass */
    override var method: String = js.native
  }
  
  @js.native
  object DataPointType extends js.Object {
    /* 1 */ val Aggregation: typingsSlinky.applicationinsightsJs.AI.DataPointType.Aggregation with Double = js.native
    /* 0 */ val Measurement: typingsSlinky.applicationinsightsJs.AI.DataPointType.Measurement with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.applicationinsightsJs.AI.DataPointType with Double] = js.native
  }
  
  @js.native
  object DependencyKind extends js.Object {
    /* 1 */ val Http: typingsSlinky.applicationinsightsJs.AI.DependencyKind.Http with Double = js.native
    /* 2 */ val Other: typingsSlinky.applicationinsightsJs.AI.DependencyKind.Other with Double = js.native
    /* 0 */ val SQL: typingsSlinky.applicationinsightsJs.AI.DependencyKind.SQL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.applicationinsightsJs.AI.DependencyKind with Double] = js.native
  }
  
  @js.native
  object DependencySourceType extends js.Object {
    /* 1 */ val Aic: typingsSlinky.applicationinsightsJs.AI.DependencySourceType.Aic with Double = js.native
    /* 2 */ val Apmc: typingsSlinky.applicationinsightsJs.AI.DependencySourceType.Apmc with Double = js.native
    /* 0 */ val Undefined: typingsSlinky.applicationinsightsJs.AI.DependencySourceType.Undefined with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.applicationinsightsJs.AI.DependencySourceType with Double] = js.native
  }
  
  @js.native
  object SeverityLevel extends js.Object {
    /* 4 */ val Critical: typingsSlinky.applicationinsightsJs.AI.SeverityLevel.Critical with Double = js.native
    /* 3 */ val Error: typingsSlinky.applicationinsightsJs.AI.SeverityLevel.Error with Double = js.native
    /* 1 */ val Information: typingsSlinky.applicationinsightsJs.AI.SeverityLevel.Information with Double = js.native
    /* 0 */ val Verbose: typingsSlinky.applicationinsightsJs.AI.SeverityLevel.Verbose with Double = js.native
    /* 2 */ val Warning: typingsSlinky.applicationinsightsJs.AI.SeverityLevel.Warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.applicationinsightsJs.AI.SeverityLevel with Double] = js.native
  }
  
}

