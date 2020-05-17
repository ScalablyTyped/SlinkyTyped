package typingsSlinky.libxmljs.anon

import typingsSlinky.libxmljs.libxmljsStrings.html
import typingsSlinky.libxmljs.libxmljsStrings.xhtml
import typingsSlinky.libxmljs.libxmljsStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Declaration extends js.Object {
  var declaration: Boolean = js.native
  var selfCloseEmpty: Boolean = js.native
  var `type`: xml | html | xhtml = js.native
  var whitespace: Boolean = js.native
}

object Declaration {
  @scala.inline
  def apply(declaration: Boolean, selfCloseEmpty: Boolean, `type`: xml | html | xhtml, whitespace: Boolean): Declaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], selfCloseEmpty = selfCloseEmpty.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  implicit class DeclarationOps[Self <: Declaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfCloseEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfCloseEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: xml | html | xhtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

