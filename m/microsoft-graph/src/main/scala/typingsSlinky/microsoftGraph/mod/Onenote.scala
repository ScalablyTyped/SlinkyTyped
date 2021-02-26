package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onenote extends Entity {
  
  // The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var notebooks: js.UndefOr[NullableOption[js.Array[Notebook]]] = js.native
  
  /**
    * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of
    * long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
    */
  var operations: js.UndefOr[NullableOption[js.Array[OnenoteOperation]]] = js.native
  
  // The pages in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var pages: js.UndefOr[NullableOption[js.Array[OnenotePage]]] = js.native
  
  /**
    * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get
    * the binary content of a specific resource. Read-only. Nullable.
    */
  var resources: js.UndefOr[NullableOption[js.Array[OnenoteResource]]] = js.native
  
  // The section groups in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sectionGroups: js.UndefOr[NullableOption[js.Array[SectionGroup]]] = js.native
  
  // The sections in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sections: js.UndefOr[NullableOption[js.Array[OnenoteSection]]] = js.native
}
object Onenote {
  
  @scala.inline
  def apply(): Onenote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onenote]
  }
  
  @scala.inline
  implicit class OnenoteMutableBuilder[Self <: Onenote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebooks(value: NullableOption[js.Array[Notebook]]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebooksNull: Self = StObject.set(x, "notebooks", null)
    
    @scala.inline
    def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = StObject.set(x, "notebooks", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[OnenoteOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: OnenoteOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: NullableOption[js.Array[OnenotePage]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesNull: Self = StObject.set(x, "pages", null)
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: OnenotePage*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: NullableOption[js.Array[OnenoteResource]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: OnenoteResource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSectionGroups(value: NullableOption[js.Array[SectionGroup]]): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsNull: Self = StObject.set(x, "sectionGroups", null)
    
    @scala.inline
    def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroup*): Self = StObject.set(x, "sectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: NullableOption[js.Array[OnenoteSection]]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsNull: Self = StObject.set(x, "sections", null)
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: OnenoteSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
  }
}
