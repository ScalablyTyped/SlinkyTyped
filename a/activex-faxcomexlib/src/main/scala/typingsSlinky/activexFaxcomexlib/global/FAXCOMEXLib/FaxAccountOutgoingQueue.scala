package typingsSlinky.activexFaxcomexlib.global.FAXCOMEXLib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingJobs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountOutgoingQueue")
@js.native
class FaxAccountOutgoingQueue protected ()
  extends typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  override var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue = js.native
  /** Get outgoing job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  /* CompleteClass */
  override def GetJobs(): FaxOutgoingJobs = js.native
}

