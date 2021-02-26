package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookMetadata extends PartialJSONObject {
  
  var kernelspec: js.UndefOr[IKernelspecMetadata] = js.native
  
  var language_info: js.UndefOr[ILanguageInfoMetadata] = js.native
  
  var orig_nbformat: Double = js.native
}
object INotebookMetadata {
  
  @scala.inline
  def apply(orig_nbformat: Double): INotebookMetadata = {
    val __obj = js.Dynamic.literal(orig_nbformat = orig_nbformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
  
  @scala.inline
  implicit class INotebookMetadataMutableBuilder[Self <: INotebookMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKernelspec(value: IKernelspecMetadata): Self = StObject.set(x, "kernelspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelspecUndefined: Self = StObject.set(x, "kernelspec", js.undefined)
    
    @scala.inline
    def setLanguage_info(value: ILanguageInfoMetadata): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_infoUndefined: Self = StObject.set(x, "language_info", js.undefined)
    
    @scala.inline
    def setOrig_nbformat(value: Double): Self = StObject.set(x, "orig_nbformat", value.asInstanceOf[js.Any])
  }
}
