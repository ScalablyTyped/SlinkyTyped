package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultDeclaration_
  extends Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration | Expression = js.native
  @JSName("type")
  var type_ExportDefaultDeclaration_ : ExportDefaultDeclaration = js.native
}

object ExportDefaultDeclaration_ {
  @scala.inline
  def apply(
    declaration: Declaration | Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ExportDefaultDeclaration
  ): ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultDeclaration_]
  }
  @scala.inline
  implicit class ExportDefaultDeclaration_Ops[Self <: ExportDefaultDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclaration(value: Declaration | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExportDefaultDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

