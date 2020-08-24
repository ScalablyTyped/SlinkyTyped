package typingsSlinky.applicationinsightsJs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AI")
@js.native
object AI extends js.Object {
  @js.native
  class DataPoint ()
    extends typingsSlinky.applicationinsightsJs.AI.DataPoint
  
  @js.native
  class EventData ()
    extends typingsSlinky.applicationinsightsJs.AI.EventData
  
  @js.native
  class ExceptionDetails ()
    extends typingsSlinky.applicationinsightsJs.AI.ExceptionDetails
  
  @js.native
  class MessageData ()
    extends typingsSlinky.applicationinsightsJs.AI.MessageData
  
  @js.native
  class PageViewData ()
    extends typingsSlinky.applicationinsightsJs.AI.PageViewData
  
  @js.native
  class PageViewPerfData ()
    extends typingsSlinky.applicationinsightsJs.AI.PageViewPerfData
  
  @js.native
  class RemoteDependencyData ()
    extends typingsSlinky.applicationinsightsJs.AI.RemoteDependencyData
  
  @js.native
  class StackFrame ()
    extends typingsSlinky.applicationinsightsJs.AI.StackFrame
  
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

