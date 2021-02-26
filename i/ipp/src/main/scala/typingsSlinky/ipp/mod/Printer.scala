package typingsSlinky.ipp.mod

import typingsSlinky.ipp.ippStrings.`Cancel-Job`
import typingsSlinky.ipp.ippStrings.`Create-Job`
import typingsSlinky.ipp.ippStrings.`Get-Job-Attributes`
import typingsSlinky.ipp.ippStrings.`Get-Jobs`
import typingsSlinky.ipp.ippStrings.`Get-Printer-Attributes`
import typingsSlinky.ipp.ippStrings.`Hold-Job`
import typingsSlinky.ipp.ippStrings.`Pause-Printer`
import typingsSlinky.ipp.ippStrings.`Print-Job`
import typingsSlinky.ipp.ippStrings.`Print-URI`
import typingsSlinky.ipp.ippStrings.`Purge-Jobs`
import typingsSlinky.ipp.ippStrings.`Release-Job`
import typingsSlinky.ipp.ippStrings.`Restart-Job`
import typingsSlinky.ipp.ippStrings.`Resume-Printer`
import typingsSlinky.ipp.ippStrings.`Send-Document`
import typingsSlinky.ipp.ippStrings.`Send-URI`
import typingsSlinky.ipp.ippStrings.`Validate-Job`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipp", "Printer")
@js.native
class Printer protected () extends StObject {
  def this(url: String) = this()
  def this(url: String, options: PrinterOptions) = this()
  
  def execute(operation: PrinterOpertaion): Unit = js.native
  def execute(
    operation: PrinterOpertaion,
    message: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* response */ FullResponse, Unit]
  ): Unit = js.native
  def execute(operation: PrinterOpertaion, message: FullRequest): Unit = js.native
  def execute(
    operation: PrinterOpertaion,
    message: FullRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ FullResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_CancelJob(operation: `Cancel-Job`, message: CancelReleaseJobRequest): Unit = js.native
  @JSName("execute")
  def execute_CancelJob(
    operation: `Cancel-Job`,
    message: CancelReleaseJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_CreateJob(operation: `Create-Job`, message: CreateJobRequest): Unit = js.native
  @JSName("execute")
  def execute_CreateJob(
    operation: `Create-Job`,
    message: CreateJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_GetJobAttributes(operation: `Get-Job-Attributes`, message: GetJobAttributesRequest): Unit = js.native
  @JSName("execute")
  def execute_GetJobAttributes(
    operation: `Get-Job-Attributes`,
    message: GetJobAttributesRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ GetJobAttributesResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_GetJobs(operation: `Get-Jobs`, message: GetJobsRequest): Unit = js.native
  @JSName("execute")
  def execute_GetJobs(
    operation: `Get-Jobs`,
    message: GetJobsRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ GetJobsResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_GetPrinterAttributes(operation: `Get-Printer-Attributes`, message: GetPrinterAttributesRequest): Unit = js.native
  @JSName("execute")
  def execute_GetPrinterAttributes(
    operation: `Get-Printer-Attributes`,
    message: GetPrinterAttributesRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ GetPrinterAttributesResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_HoldJob(operation: `Hold-Job`, message: HoldRestartJobRequest): Unit = js.native
  @JSName("execute")
  def execute_HoldJob(
    operation: `Hold-Job`,
    message: HoldRestartJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_PausePrinter(operation: `Pause-Printer`, message: SimpleRequest): Unit = js.native
  @JSName("execute")
  def execute_PausePrinter(
    operation: `Pause-Printer`,
    message: SimpleRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_PrintJob(operation: `Print-Job`, message: PrintJobRequest): Unit = js.native
  @JSName("execute")
  def execute_PrintJob(
    operation: `Print-Job`,
    message: PrintJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ PrintJobResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_PrintURI(operation: `Print-URI`, message: PrintURIRequest): Unit = js.native
  @JSName("execute")
  def execute_PrintURI(
    operation: `Print-URI`,
    message: PrintURIRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ PrintJobResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_PurgeJobs(operation: `Purge-Jobs`, message: SimpleRequest): Unit = js.native
  @JSName("execute")
  def execute_PurgeJobs(
    operation: `Purge-Jobs`,
    message: SimpleRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_ReleaseJob(operation: `Release-Job`, message: CancelReleaseJobRequest): Unit = js.native
  @JSName("execute")
  def execute_ReleaseJob(
    operation: `Release-Job`,
    message: CancelReleaseJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_RestartJob(operation: `Restart-Job`, message: HoldRestartJobRequest): Unit = js.native
  @JSName("execute")
  def execute_RestartJob(
    operation: `Restart-Job`,
    message: HoldRestartJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_ResumePrinter(operation: `Resume-Printer`, message: SimpleRequest): Unit = js.native
  @JSName("execute")
  def execute_ResumePrinter(
    operation: `Resume-Printer`,
    message: SimpleRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_SendDocument(operation: `Send-Document`, message: SendDocumentRequest): Unit = js.native
  @JSName("execute")
  def execute_SendDocument(
    operation: `Send-Document`,
    message: SendDocumentRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SendDocumentResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_SendURI(operation: `Send-URI`, message: SendURIRequest): Unit = js.native
  @JSName("execute")
  def execute_SendURI(
    operation: `Send-URI`,
    message: SendURIRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_ValidateJob(operation: `Validate-Job`, message: ValidateJobRequest): Unit = js.native
  @JSName("execute")
  def execute_ValidateJob(
    operation: `Validate-Job`,
    message: ValidateJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
}
