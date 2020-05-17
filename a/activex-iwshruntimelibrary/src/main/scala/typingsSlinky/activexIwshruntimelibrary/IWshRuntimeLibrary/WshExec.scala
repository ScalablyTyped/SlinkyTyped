package typingsSlinky.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WSHExec object */
@js.native
trait WshExec extends js.Object {
  val ExitCode: Double = js.native
  @JSName("IWshRuntimeLibrary.WshExec_typekey")
  var IWshRuntimeLibraryDotWshExec_typekey: WshExec = js.native
  val ProcessID: Double = js.native
  val Status: WshExecStatus = js.native
  val StdErr: TextStreamWriter = js.native
  val StdIn: TextStreamReader = js.native
  val StdOut: TextStreamWriter = js.native
  def Terminate(): Unit = js.native
}

object WshExec {
  @scala.inline
  def apply(
    ExitCode: Double,
    IWshRuntimeLibraryDotWshExec_typekey: WshExec,
    ProcessID: Double,
    Status: WshExecStatus,
    StdErr: TextStreamWriter,
    StdIn: TextStreamReader,
    StdOut: TextStreamWriter,
    Terminate: () => Unit
  ): WshExec = {
    val __obj = js.Dynamic.literal(ExitCode = ExitCode.asInstanceOf[js.Any], ProcessID = ProcessID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StdErr = StdErr.asInstanceOf[js.Any], StdIn = StdIn.asInstanceOf[js.Any], StdOut = StdOut.asInstanceOf[js.Any], Terminate = js.Any.fromFunction0(Terminate))
    __obj.updateDynamic("IWshRuntimeLibrary.WshExec_typekey")(IWshRuntimeLibraryDotWshExec_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WshExec]
  }
  @scala.inline
  implicit class WshExecOps[Self <: WshExec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIWshRuntimeLibraryDotWshExec_typekey(value: WshExec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IWshRuntimeLibrary.WshExec_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: WshExecStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdErr(value: TextStreamWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdErr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdIn(value: TextStreamReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdOut(value: TextStreamWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terminate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

