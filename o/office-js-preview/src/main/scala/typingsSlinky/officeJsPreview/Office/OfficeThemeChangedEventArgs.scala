package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.officeThemeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfficeThemeChangedEventArgs extends js.Object {
  /**
    * Gets the updated Office theme.
    * 
    * [Api set: Mailbox Preview]
    */
  var officeTheme: OfficeTheme = js.native
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox Preview]
    */
  var `type`: officeThemeChanged = js.native
}

object OfficeThemeChangedEventArgs {
  @scala.inline
  def apply(officeTheme: OfficeTheme, `type`: officeThemeChanged): OfficeThemeChangedEventArgs = {
    val __obj = js.Dynamic.literal(officeTheme = officeTheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeThemeChangedEventArgs]
  }
  @scala.inline
  implicit class OfficeThemeChangedEventArgsOps[Self <: OfficeThemeChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfficeTheme(value: OfficeTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: officeThemeChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

