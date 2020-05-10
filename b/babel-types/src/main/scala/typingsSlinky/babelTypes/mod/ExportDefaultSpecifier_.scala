package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultSpecifier_
  extends Node
     with ModuleSpecifier {
  var exported: Identifier_ = js.native
  @JSName("type")
  var type_ExportDefaultSpecifier_ : ExportDefaultSpecifier = js.native
}

object ExportDefaultSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ExportDefaultSpecifier
  ): ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultSpecifier_]
  }
  @scala.inline
  implicit class ExportDefaultSpecifier_Ops[Self <: ExportDefaultSpecifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExported(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExportDefaultSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

