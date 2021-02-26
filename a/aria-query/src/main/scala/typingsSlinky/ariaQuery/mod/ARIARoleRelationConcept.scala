package typingsSlinky.ariaQuery.mod

import typingsSlinky.ariaQuery.ariaQueryStrings.`descendant of table`
import typingsSlinky.ariaQuery.ariaQueryStrings.`direct descendant of details element with the open attribute defined`
import typingsSlinky.ariaQuery.ariaQueryStrings.`direct descendant of document`
import typingsSlinky.ariaQuery.ariaQueryStrings.`direct descendant of olComma ul or menu`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIARoleRelationConcept extends StObject {
  
  var attributes: js.UndefOr[js.Array[ARIARoleRelationConceptAttribute]] = js.native
  
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[
    js.Array[
      (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`)
    ]
  ] = js.native
  
  var name: String = js.native
}
object ARIARoleRelationConcept {
  
  @scala.inline
  def apply(name: String): ARIARoleRelationConcept = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConcept]
  }
  
  @scala.inline
  implicit class ARIARoleRelationConceptMutableBuilder[Self <: ARIARoleRelationConcept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[ARIARoleRelationConceptAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: ARIARoleRelationConceptAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(
      value: js.Array[
          (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`)
        ]
    ): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(
      value: ((`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`))*
    ): Self = StObject.set(x, "constraints", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
