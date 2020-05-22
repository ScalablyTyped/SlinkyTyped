package typingsSlinky.activexFaxcomexlib.global.FAXCOMEXLib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJobs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingQueue")
@js.native
class FaxIncomingQueue protected ()
  extends typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingQueue {
  /** Is queue blocked */
  /* CompleteClass */
  override var Blocked: Boolean = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxIncomingQueue_typekey")
  override var FAXCOMEXLibDotFaxIncomingQueue_typekey: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingQueue = js.native
  /** Get incoming job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  /* CompleteClass */
  override def GetJobs(): FaxIncomingJobs = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

