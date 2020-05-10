package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDefaultSpecifier_
  extends Node
     with ModuleSpecifier {
  var local: Identifier_ = js.native
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier = js.native
}

object ImportDefaultSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportDefaultSpecifier
  ): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  @scala.inline
  implicit class ImportDefaultSpecifier_Ops[Self <: ImportDefaultSpecifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ImportDefaultSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

