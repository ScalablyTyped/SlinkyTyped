package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrashReporter extends js.Object {
  // Docs: http://electronjs.org/docs/api/crash-reporter
  /**
    * Set an extra parameter to be sent with the crash report. The values specified
    * here will be sent in addition to any values set via the extra option when start
    * was called. This API is only available on macOS and windows, if you need to
    * add/update extra parameters on Linux after your first call to start you can call
    * start again with the updated extra options.
    */
  def addExtraParameter(key: String, value: String): Unit = js.native
  /**
    * Returns the date and ID of the last crash report. Only crash reports that have
    * been uploaded will be returned; even if a crash report is present on disk it
    * will not be returned until it is uploaded. In the case that there are no
    * uploaded reports, null is returned.
    */
  def getLastCrashReport(): CrashReport = js.native
  /**
    * See all of the current parameters being passed to the crash reporter.
    */
  def getParameters(): Unit = js.native
  /**
    * Note: This API can only be called from the main process.
    */
  def getUploadToServer(): Boolean = js.native
  /**
    * Returns all uploaded crash reports. Each report contains the date and uploaded
    * ID.
    */
  def getUploadedReports(): js.Array[CrashReport] = js.native
  /**
    * Remove a extra parameter from the current set of parameters so that it will not
    * be sent with the crash report.
    */
  def removeExtraParameter(key: String): Unit = js.native
  /**
    * This would normally be controlled by user preferences. This has no effect if
    * called before start is called. Note: This API can only be called from the main
    * process.
    */
  def setUploadToServer(uploadToServer: Boolean): Unit = js.native
  /**
    * You are required to call this method before using any other crashReporter APIs
    * and in each process (main/renderer) from which you want to collect crash
    * reports. You can pass different options to crashReporter.start when calling from
    * different processes. Note Child processes created via the child_process module
    * will not have access to the Electron modules. Therefore, to collect crash
    * reports from them, use process.crashReporter.start instead. Pass the same
    * options as above along with an additional one called crashesDirectory that
    * should point to a directory to store the crash reports temporarily. You can test
    * this out by calling process.crash() to crash the child process. Note: If you
    * need send additional/updated extra parameters after your first call start you
    * can call addExtraParameter on macOS or call start again with the new/updated
    * extra parameters on Linux and Windows. Note: On macOS and windows, Electron uses
    * a new crashpad client for crash collection and reporting. If you want to enable
    * crash reporting, initializing crashpad from the main process using
    * crashReporter.start is required regardless of which process you want to collect
    * crashes from. Once initialized this way, the crashpad handler collects crashes
    * from all processes. You still have to call crashReporter.start from the renderer
    * or child process, otherwise crashes from them will get reported without
    * companyName, productName or any of the extra information.
    */
  def start(options: CrashReporterStartOptions): Unit = js.native
}

object CrashReporter {
  @scala.inline
  def apply(
    addExtraParameter: (String, String) => Unit,
    getLastCrashReport: () => CrashReport,
    getParameters: () => Unit,
    getUploadToServer: () => Boolean,
    getUploadedReports: () => js.Array[CrashReport],
    removeExtraParameter: String => Unit,
    setUploadToServer: Boolean => Unit,
    start: CrashReporterStartOptions => Unit
  ): CrashReporter = {
    val __obj = js.Dynamic.literal(addExtraParameter = js.Any.fromFunction2(addExtraParameter), getLastCrashReport = js.Any.fromFunction0(getLastCrashReport), getParameters = js.Any.fromFunction0(getParameters), getUploadToServer = js.Any.fromFunction0(getUploadToServer), getUploadedReports = js.Any.fromFunction0(getUploadedReports), removeExtraParameter = js.Any.fromFunction1(removeExtraParameter), setUploadToServer = js.Any.fromFunction1(setUploadToServer), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[CrashReporter]
  }
  @scala.inline
  implicit class CrashReporterOps[Self <: CrashReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddExtraParameter(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExtraParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLastCrashReport(value: () => CrashReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastCrashReport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUploadToServer(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUploadToServer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUploadedReports(value: () => js.Array[CrashReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUploadedReports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveExtraParameter(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeExtraParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUploadToServer(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUploadToServer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: CrashReporterStartOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

