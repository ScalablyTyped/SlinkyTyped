package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeParam_
  extends Node
     with Flow {
  var name: Identifier_ = js.native
  var typeAnnotation: FlowTypeAnnotation = js.native
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam = js.native
}

object FunctionTypeParam_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    `type`: FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation
  ): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam_]
  }
  @scala.inline
  implicit class FunctionTypeParam_Ops[Self <: FunctionTypeParam_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: FunctionTypeParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: FlowTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

