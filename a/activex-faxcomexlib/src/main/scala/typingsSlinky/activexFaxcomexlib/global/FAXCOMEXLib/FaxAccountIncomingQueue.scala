package typingsSlinky.activexFaxcomexlib.global.FAXCOMEXLib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJobs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountIncomingQueue")
@js.native
class FaxAccountIncomingQueue protected ()
  extends typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccountIncomingQueue {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  override var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccountIncomingQueue = js.native
  /** Get incoming job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  /* CompleteClass */
  override def GetJobs(): FaxIncomingJobs = js.native
}

