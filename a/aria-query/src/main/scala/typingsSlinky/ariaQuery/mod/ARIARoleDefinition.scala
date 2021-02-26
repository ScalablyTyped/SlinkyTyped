package typingsSlinky.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIARoleDefinition extends StObject {
  
  /* Abstract roles may not be used in HTML. */
  var `abstract`: Boolean = js.native
  
  /* The concepts in related domains that inform behavior mappings. */
  var baseConcepts: js.Array[ARIARoleRelation] = js.native
  
  /* Child presentational roles strip child nodes of roles and flatten the
    * content to text. */
  var childrenPresentational: Boolean = js.native
  
  /* aria-* properties and states disallowed on this role. */
  var prohibitedProps: ARIAPropertyMap = js.native
  
  /* aria-* properties and states allowed on this role. */
  var props: ARIAPropertyMap = js.native
  
  /* The concepts in related domains that inform behavior mappings. */
  var relatedConcepts: js.Array[ARIARoleRelation] = js.native
  
  /* aria-* properties and states required on this role. */
  var requiredProps: ARIAPropertyMap = js.native
  
  /* An array or super class "stacks." Each stack contains a LIFO list of
    * strings correspond to a super class in the inheritance chain of this
    * role. Roles may have more than one inheritance chain, which is why
    * this property is an array of arrays and not a single array. */
  var superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]] = js.native
}
object ARIARoleDefinition {
  
  @scala.inline
  def apply(
    `abstract`: Boolean,
    baseConcepts: js.Array[ARIARoleRelation],
    childrenPresentational: Boolean,
    prohibitedProps: ARIAPropertyMap,
    props: ARIAPropertyMap,
    relatedConcepts: js.Array[ARIARoleRelation],
    requiredProps: ARIAPropertyMap,
    superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]
  ): ARIARoleDefinition = {
    val __obj = js.Dynamic.literal(baseConcepts = baseConcepts.asInstanceOf[js.Any], childrenPresentational = childrenPresentational.asInstanceOf[js.Any], prohibitedProps = prohibitedProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], relatedConcepts = relatedConcepts.asInstanceOf[js.Any], requiredProps = requiredProps.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleDefinition]
  }
  
  @scala.inline
  implicit class ARIARoleDefinitionMutableBuilder[Self <: ARIARoleDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseConcepts(value: js.Array[ARIARoleRelation]): Self = StObject.set(x, "baseConcepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseConceptsVarargs(value: ARIARoleRelation*): Self = StObject.set(x, "baseConcepts", js.Array(value :_*))
    
    @scala.inline
    def setChildrenPresentational(value: Boolean): Self = StObject.set(x, "childrenPresentational", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProhibitedProps(value: ARIAPropertyMap): Self = StObject.set(x, "prohibitedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: ARIAPropertyMap): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedConcepts(value: js.Array[ARIARoleRelation]): Self = StObject.set(x, "relatedConcepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedConceptsVarargs(value: ARIARoleRelation*): Self = StObject.set(x, "relatedConcepts", js.Array(value :_*))
    
    @scala.inline
    def setRequiredProps(value: ARIAPropertyMap): Self = StObject.set(x, "requiredProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperClass(value: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperClassVarargs(value: (js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole])*): Self = StObject.set(x, "superClass", js.Array(value :_*))
  }
}
