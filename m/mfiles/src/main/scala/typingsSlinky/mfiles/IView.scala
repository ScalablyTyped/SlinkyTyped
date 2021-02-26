package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSearchFlags
import typingsSlinky.mfiles.MFiles.MFViewFlag
import typingsSlinky.mfiles.MFiles.MFViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IView extends StObject {
  
  var AccessControlList: IAccessControlList = js.native
  
  def Clone(): IView = js.native
  
  def CloneFrom(View: IView): Unit = js.native
  
  var Common: Boolean = js.native
  
  val GUID: String = js.native
  
  var HasParent: Boolean = js.native
  
  var ID: Double = js.native
  
  var Levels: IExpressionExs = js.native
  
  var LookInAllVersions: Boolean = js.native
  
  var Name: String = js.native
  
  var Parent: Double = js.native
  
  var ReturnLatestVisibleVersion: Boolean = js.native
  
  var SearchConditions: ISearchConditions = js.native
  
  var SearchDef: ISearchDef = js.native
  
  var SearchFlags: MFSearchFlags = js.native
  
  var ViewFlags: MFViewFlag = js.native
  
  var ViewLocation: IViewLocation = js.native
  
  var ViewType: MFViewType = js.native
  
  var Visible: Boolean = js.native
}
object IView {
  
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IView,
    CloneFrom: IView => Unit,
    Common: Boolean,
    GUID: String,
    HasParent: Boolean,
    ID: Double,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    Name: String,
    Parent: Double,
    ReturnLatestVisibleVersion: Boolean,
    SearchConditions: ISearchConditions,
    SearchDef: ISearchDef,
    SearchFlags: MFSearchFlags,
    ViewFlags: MFViewFlag,
    ViewLocation: IViewLocation,
    ViewType: MFViewType,
    Visible: Boolean
  ): IView = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Common = Common.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SearchDef = SearchDef.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], ViewFlags = ViewFlags.asInstanceOf[js.Any], ViewLocation = ViewLocation.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
  
  @scala.inline
  implicit class IViewMutableBuilder[Self <: IView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IView): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IView => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommon(value: Boolean): Self = StObject.set(x, "Common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasParent(value: Boolean): Self = StObject.set(x, "HasParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: IExpressionExs): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookInAllVersions(value: Boolean): Self = StObject.set(x, "LookInAllVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Double): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnLatestVisibleVersion(value: Boolean): Self = StObject.set(x, "ReturnLatestVisibleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchConditions(value: ISearchConditions): Self = StObject.set(x, "SearchConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDef(value: ISearchDef): Self = StObject.set(x, "SearchDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFlags(value: MFSearchFlags): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFlags(value: MFViewFlag): Self = StObject.set(x, "ViewFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewLocation(value: IViewLocation): Self = StObject.set(x, "ViewLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: MFViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
