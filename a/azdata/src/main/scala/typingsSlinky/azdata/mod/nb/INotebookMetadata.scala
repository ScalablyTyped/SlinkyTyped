package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookMetadata extends StObject {
  
  var kernelspec: IKernelInfo = js.native
  
  var language_info: js.UndefOr[ILanguageInfo] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object INotebookMetadata {
  
  @scala.inline
  def apply(kernelspec: IKernelInfo): INotebookMetadata = {
    val __obj = js.Dynamic.literal(kernelspec = kernelspec.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
  
  @scala.inline
  implicit class INotebookMetadataMutableBuilder[Self <: INotebookMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKernelspec(value: IKernelInfo): Self = StObject.set(x, "kernelspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_info(value: ILanguageInfo): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_infoUndefined: Self = StObject.set(x, "language_info", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
