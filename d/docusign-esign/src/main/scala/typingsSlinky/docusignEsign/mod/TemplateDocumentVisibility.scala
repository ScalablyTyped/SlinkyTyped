package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateDocumentVisibility extends StObject {
  
  /**
    * An array of `documentVisibility` objects that specifies which documents are visible to which recipients.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.native
}
object TemplateDocumentVisibility {
  
  @scala.inline
  def apply(): TemplateDocumentVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocumentVisibility]
  }
  
  @scala.inline
  implicit class TemplateDocumentVisibilityMutableBuilder[Self <: TemplateDocumentVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = StObject.set(x, "documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVisibilityUndefined: Self = StObject.set(x, "documentVisibility", js.undefined)
    
    @scala.inline
    def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = StObject.set(x, "documentVisibility", js.Array(value :_*))
  }
}
