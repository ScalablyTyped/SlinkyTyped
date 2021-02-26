package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifyDocumentResponse extends StObject {
  
  /**
    * The classes used by the document being analyzed. These are used for multi-class trained models. Individual classes are mutually exclusive and each document is expected to have only a single class assigned to it. For example, an animal can be a dog or a cat, but not both at the same time. 
    */
  var Classes: js.UndefOr[ListOfClasses] = js.native
  
  /**
    * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels represent different categories that are related in some manner and are not multually exclusive. For example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at the same time. 
    */
  var Labels: js.UndefOr[ListOfLabels] = js.native
}
object ClassifyDocumentResponse {
  
  @scala.inline
  def apply(): ClassifyDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyDocumentResponse]
  }
  
  @scala.inline
  implicit class ClassifyDocumentResponseMutableBuilder[Self <: ClassifyDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: ListOfClasses): Self = StObject.set(x, "Classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "Classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: DocumentClass*): Self = StObject.set(x, "Classes", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: ListOfLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: DocumentLabel*): Self = StObject.set(x, "Labels", js.Array(value :_*))
  }
}
