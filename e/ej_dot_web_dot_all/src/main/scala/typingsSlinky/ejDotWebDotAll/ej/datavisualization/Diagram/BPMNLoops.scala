package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNLoops extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNLoops")
@js.native
object BPMNLoops extends js.Object {
  //Used to set BPMN Activity's Loop as None
  @js.native
  sealed trait None extends BPMNLoops
  
  //Used to set BPMN Activity's Loop as ParallelMultiInstance
  @js.native
  sealed trait ParallelMultiInstance extends BPMNLoops
  
  //Used to set BPMN Activity's Loop as SequenceMultiInstance
  @js.native
  sealed trait SequenceMultiInstance extends BPMNLoops
  
  //Used to set BPMN Activity's Loop as Standard
  @js.native
  sealed trait Standard extends BPMNLoops
  
  /* 0 */ val None: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNLoops.None with Double = js.native
  /* 2 */ val ParallelMultiInstance: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNLoops.ParallelMultiInstance with Double = js.native
  /* 3 */ val SequenceMultiInstance: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNLoops.SequenceMultiInstance with Double = js.native
  /* 1 */ val Standard: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNLoops.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNLoops with Double] = js.native
}

