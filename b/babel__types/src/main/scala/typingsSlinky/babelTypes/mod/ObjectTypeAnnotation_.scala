package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ObjectTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var callProperties: js.Array[ObjectTypeCallProperty_] | Null = js.native
  var exact: Boolean = js.native
  var indexers: js.Array[ObjectTypeIndexer_] | Null = js.native
  var inexact: Boolean | Null = js.native
  var internalSlots: js.Array[ObjectTypeInternalSlot_] | Null = js.native
  var properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_] = js.native
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation = js.native
}

object ObjectTypeAnnotation_ {
  @scala.inline
  def apply(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  @scala.inline
  implicit class ObjectTypeAnnotation_Ops[Self <: ObjectTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ObjectTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallPropertiesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callProperties")(null)
        ret
    }
    @scala.inline
    def withIndexers(value: js.Array[ObjectTypeIndexer_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexers")(null)
        ret
    }
    @scala.inline
    def withInexact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inexact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInexactNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inexact")(null)
        ret
    }
    @scala.inline
    def withInternalSlots(value: js.Array[ObjectTypeInternalSlot_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalSlotsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSlots")(null)
        ret
    }
  }
  
}

