package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellPaneTab extends StObject {
  
  val Events: IShellPaneTabEvents = js.native
  
  val IsBuiltIn: Boolean = js.native
  
  def Remove(): Unit = js.native
  
  def Select(): Unit = js.native
  
  val Selected: Boolean = js.native
  
  def ShowDashboard(dashboardID: String, data: js.Any): Unit = js.native
  
  def ShowEmptyContent(): Unit = js.native
  
  def ShowFilePreview(file: String): Unit = js.native
  
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): Unit = js.native
  
  def ShowPersistentContent(sessionHandle: Double): Unit = js.native
  
  def ShowSSRSReport(reportURL: String): Unit = js.native
  
  val TabId: String = js.native
  
  var Title: String = js.native
  
  def Unselect(): Unit = js.native
  
  var Visible: Boolean = js.native
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
  implicit class IShellPaneTabMutableBuilder[Self <: IShellPaneTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: IShellPaneTabEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltIn(value: Boolean): Self = StObject.set(x, "IsBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDashboard(value: (String, js.Any) => Unit): Self = StObject.set(x, "ShowDashboard", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowEmptyContent(value: () => Unit): Self = StObject.set(x, "ShowEmptyContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowFilePreview(value: String => Unit): Self = StObject.set(x, "ShowFilePreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowObjectVersionProperties(value: IPropertyValuesWithIconClues => Unit): Self = StObject.set(x, "ShowObjectVersionProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowPersistentContent(value: Double => Unit): Self = StObject.set(x, "ShowPersistentContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowSSRSReport(value: String => Unit): Self = StObject.set(x, "ShowSSRSReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabId(value: String): Self = StObject.set(x, "TabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselect(value: () => Unit): Self = StObject.set(x, "Unselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
