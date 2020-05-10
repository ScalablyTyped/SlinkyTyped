package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellPaneTab extends js.Object {
  val Events: IShellPaneTabEvents = js.native
  val IsBuiltIn: Boolean = js.native
  val Selected: Boolean = js.native
  val TabId: String = js.native
  var Title: String = js.native
  var Visible: Boolean = js.native
  def Remove(): Unit = js.native
  def Select(): Unit = js.native
  def ShowDashboard(dashboardID: String, data: js.Any): Unit = js.native
  def ShowEmptyContent(): Unit = js.native
  def ShowFilePreview(file: String): Unit = js.native
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): Unit = js.native
  def ShowPersistentContent(sessionHandle: Double): Unit = js.native
  def ShowSSRSReport(reportURL: String): Unit = js.native
  def Unselect(): Unit = js.native
}

object IShellPaneTab {
  @scala.inline
  def apply(
    Events: IShellPaneTabEvents,
    IsBuiltIn: Boolean,
    Remove: () => Unit,
    Select: () => Unit,
    Selected: Boolean,
    ShowDashboard: (String, js.Any) => Unit,
    ShowEmptyContent: () => Unit,
    ShowFilePreview: String => Unit,
    ShowObjectVersionProperties: IPropertyValuesWithIconClues => Unit,
    ShowPersistentContent: Double => Unit,
    ShowSSRSReport: String => Unit,
    TabId: String,
    Title: String,
    Unselect: () => Unit,
    Visible: Boolean
  ): IShellPaneTab = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IsBuiltIn = IsBuiltIn.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), Select = js.Any.fromFunction0(Select), Selected = Selected.asInstanceOf[js.Any], ShowDashboard = js.Any.fromFunction2(ShowDashboard), ShowEmptyContent = js.Any.fromFunction0(ShowEmptyContent), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowObjectVersionProperties = js.Any.fromFunction1(ShowObjectVersionProperties), ShowPersistentContent = js.Any.fromFunction1(ShowPersistentContent), ShowSSRSReport = js.Any.fromFunction1(ShowSSRSReport), TabId = TabId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Unselect = js.Any.fromFunction0(Unselect), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneTab]
  }
  @scala.inline
  implicit class IShellPaneTabOps[Self <: IShellPaneTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: IShellPaneTabEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDashboard(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowDashboard")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowEmptyContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowEmptyContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowFilePreview(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowFilePreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowObjectVersionProperties(value: IPropertyValuesWithIconClues => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowObjectVersionProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowPersistentContent(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowPersistentContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowSSRSReport(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowSSRSReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

