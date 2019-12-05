package typingsSlinky.officeDashJsDashPreview.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekNumber extends js.Object

/**
  * Specifies the week of the month.
  * 
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.WeekNumber")
@js.native
object WeekNumber extends js.Object {
  /**
    * First week of the month.
    */
  @js.native
  sealed trait First extends WeekNumber
  
  /**
    * Fourth week of the month.
    */
  @js.native
  sealed trait Fourth extends WeekNumber
  
  /**
    * Last week of the month.
    */
  @js.native
  sealed trait Last extends WeekNumber
  
  /**
    * Second week of the month.
    */
  @js.native
  sealed trait Second extends WeekNumber
  
  /**
    * Third week of the month.
    */
  @js.native
  sealed trait Third extends WeekNumber
  
  /* "first" */ val First: typingsSlinky.officeDashJsDashPreview.Office.MailboxEnums.WeekNumber.First with String = js.native
  /* "fourth" */ val Fourth: typingsSlinky.officeDashJsDashPreview.Office.MailboxEnums.WeekNumber.Fourth with String = js.native
  /* "last" */ val Last: typingsSlinky.officeDashJsDashPreview.Office.MailboxEnums.WeekNumber.Last with String = js.native
  /* "second" */ val Second: typingsSlinky.officeDashJsDashPreview.Office.MailboxEnums.WeekNumber.Second with String = js.native
  /* "third" */ val Third: typingsSlinky.officeDashJsDashPreview.Office.MailboxEnums.WeekNumber.Third with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WeekNumber with String] = js.native
}

