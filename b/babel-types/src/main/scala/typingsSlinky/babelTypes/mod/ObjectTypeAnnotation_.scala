package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var callProperties: js.Array[ObjectTypeCallProperty_] = js.native
  var indexers: js.Array[ObjectTypeIndexer_] = js.native
  var properties: js.Array[ObjectTypeProperty_] = js.native
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation = js.native
}

object ObjectTypeAnnotation_ {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double,
    `type`: ObjectTypeAnnotation
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
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
    def withCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexers(value: js.Array[ObjectTypeIndexer_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[ObjectTypeProperty_]): Self = {
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
  }
  
}

