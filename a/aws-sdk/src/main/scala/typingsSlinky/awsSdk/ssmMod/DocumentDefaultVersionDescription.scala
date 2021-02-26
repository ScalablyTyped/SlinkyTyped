package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentDefaultVersionDescription extends StObject {
  
  /**
    * The default version of the document.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.native
  
  /**
    * The default version of the artifact associated with the document.
    */
  var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.native
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[DocumentName] = js.native
}
object DocumentDefaultVersionDescription {
  
  @scala.inline
  def apply(): DocumentDefaultVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDefaultVersionDescription]
  }
  
  @scala.inline
  implicit class DocumentDefaultVersionDescriptionMutableBuilder[Self <: DocumentDefaultVersionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVersion(value: DocumentVersion): Self = StObject.set(x, "DefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionName(value: DocumentVersionName): Self = StObject.set(x, "DefaultVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionNameUndefined: Self = StObject.set(x, "DefaultVersionName", js.undefined)
    
    @scala.inline
    def setDefaultVersionUndefined: Self = StObject.set(x, "DefaultVersion", js.undefined)
    
    @scala.inline
    def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
