package typingsSlinky.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailMergeExportRange extends js.Object

/**
  * Lists values that specify the range for mail-merge document export.
  */
@JSGlobal("MailMergeExportRange")
@js.native
object MailMergeExportRange extends js.Object {
  /**
    * Specifies that all data source records will be included into the exported merged document.
    */
  @js.native
  sealed trait AllRecords extends MailMergeExportRange
  
  /**
    * Specifies that only the current data source record will be included into the exported merged document.
    */
  @js.native
  sealed trait CurrentRecord extends MailMergeExportRange
  
  /**
    * Specifies that a specific range of data source records will be included into the exported merged document.
    */
  @js.native
  sealed trait Range extends MailMergeExportRange
  
  /* 0 */ val AllRecords: typingsSlinky.devexpressDashWeb.MailMergeExportRange.AllRecords with Double = js.native
  /* 1 */ val CurrentRecord: typingsSlinky.devexpressDashWeb.MailMergeExportRange.CurrentRecord with Double = js.native
  /* 2 */ val Range: typingsSlinky.devexpressDashWeb.MailMergeExportRange.Range with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailMergeExportRange with Double] = js.native
}

