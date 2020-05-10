package typingsSlinky.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIARoleDefinition extends js.Object {
  /* Abstract roles may not be used in HTML. */
  var `abstract`: Boolean = js.native
  /* The concepts in related domains that inform behavior mappings. */
  var baseConcepts: js.Array[ARIARoleRelation] = js.native
  /* Child presentational roles strip child nodes of roles and flatten the
    * content to text. */
  var childrenPresentational: Boolean = js.native
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
    props: ARIAPropertyMap,
    relatedConcepts: js.Array[ARIARoleRelation],
    requiredProps: ARIAPropertyMap,
    superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]
  ): ARIARoleDefinition = {
    val __obj = js.Dynamic.literal(baseConcepts = baseConcepts.asInstanceOf[js.Any], childrenPresentational = childrenPresentational.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], relatedConcepts = relatedConcepts.asInstanceOf[js.Any], requiredProps = requiredProps.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleDefinition]
  }
  @scala.inline
  implicit class ARIARoleDefinitionOps[Self <: ARIARoleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseConcepts(value: js.Array[ARIARoleRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseConcepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenPresentational(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenPresentational")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: ARIAPropertyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedConcepts(value: js.Array[ARIARoleRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedConcepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredProps(value: ARIAPropertyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperClass(value: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

