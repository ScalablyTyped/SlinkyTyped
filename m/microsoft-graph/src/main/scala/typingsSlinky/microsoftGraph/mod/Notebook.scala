package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notebook extends OnenoteEntityHierarchyModel {
  
  // Indicates whether this is the user's default notebook. Read-only.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the
    * owner. Read-only.
    */
  var isShared: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[NullableOption[NotebookLinks]] = js.native
  
  // The section groups in the notebook. Read-only. Nullable.
  var sectionGroups: js.UndefOr[NullableOption[js.Array[SectionGroup]]] = js.native
  
  // The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The sections in the notebook. Read-only. Nullable.
  var sections: js.UndefOr[NullableOption[js.Array[OnenoteSection]]] = js.native
  
  // The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor
    * represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
    */
  var userRole: js.UndefOr[NullableOption[OnenoteUserRole]] = js.native
}
object Notebook {
  
  @scala.inline
  def apply(): Notebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notebook]
  }
  
  @scala.inline
  implicit class NotebookMutableBuilder[Self <: Notebook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setIsShared(value: NullableOption[Boolean]): Self = StObject.set(x, "isShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharedNull: Self = StObject.set(x, "isShared", null)
    
    @scala.inline
    def setIsSharedUndefined: Self = StObject.set(x, "isShared", js.undefined)
    
    @scala.inline
    def setLinks(value: NullableOption[NotebookLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksNull: Self = StObject.set(x, "links", null)
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setSectionGroups(value: NullableOption[js.Array[SectionGroup]]): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsNull: Self = StObject.set(x, "sectionGroups", null)
    
    @scala.inline
    def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    @scala.inline
    def setSectionGroupsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionGroupsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsUrlNull: Self = StObject.set(x, "sectionGroupsUrl", null)
    
    @scala.inline
    def setSectionGroupsUrlUndefined: Self = StObject.set(x, "sectionGroupsUrl", js.undefined)
    
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroup*): Self = StObject.set(x, "sectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: NullableOption[js.Array[OnenoteSection]]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsNull: Self = StObject.set(x, "sections", null)
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUrlNull: Self = StObject.set(x, "sectionsUrl", null)
    
    @scala.inline
    def setSectionsUrlUndefined: Self = StObject.set(x, "sectionsUrl", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: OnenoteSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setUserRole(value: NullableOption[OnenoteUserRole]): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleNull: Self = StObject.set(x, "userRole", null)
    
    @scala.inline
    def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
  }
}
