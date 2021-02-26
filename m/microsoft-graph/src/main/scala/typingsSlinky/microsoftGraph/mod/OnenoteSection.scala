package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenoteSection extends OnenoteEntityHierarchyModel {
  
  // Indicates whether this is the user's default section. Read-only.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the section in OneNote on the web.
    */
  var links: js.UndefOr[NullableOption[SectionLinks]] = js.native
  
  // The collection of pages in the section. Read-only. Nullable.
  var pages: js.UndefOr[NullableOption[js.Array[OnenotePage]]] = js.native
  
  // The pages endpoint where you can get details for all the pages in the section. Read-only.
  var pagesUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The notebook that contains the section. Read-only.
  var parentNotebook: js.UndefOr[NullableOption[Notebook]] = js.native
  
  // The section group that contains the section. Read-only.
  var parentSectionGroup: js.UndefOr[NullableOption[SectionGroup]] = js.native
}
object OnenoteSection {
  
  @scala.inline
  def apply(): OnenoteSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteSection]
  }
  
  @scala.inline
  implicit class OnenoteSectionMutableBuilder[Self <: OnenoteSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setLinks(value: NullableOption[SectionLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksNull: Self = StObject.set(x, "links", null)
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setPages(value: NullableOption[js.Array[OnenotePage]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesNull: Self = StObject.set(x, "pages", null)
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPagesUrl(value: NullableOption[String]): Self = StObject.set(x, "pagesUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUrlNull: Self = StObject.set(x, "pagesUrl", null)
    
    @scala.inline
    def setPagesUrlUndefined: Self = StObject.set(x, "pagesUrl", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: OnenotePage*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setParentNotebook(value: NullableOption[Notebook]): Self = StObject.set(x, "parentNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNotebookNull: Self = StObject.set(x, "parentNotebook", null)
    
    @scala.inline
    def setParentNotebookUndefined: Self = StObject.set(x, "parentNotebook", js.undefined)
    
    @scala.inline
    def setParentSectionGroup(value: NullableOption[SectionGroup]): Self = StObject.set(x, "parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionGroupNull: Self = StObject.set(x, "parentSectionGroup", null)
    
    @scala.inline
    def setParentSectionGroupUndefined: Self = StObject.set(x, "parentSectionGroup", js.undefined)
  }
}
