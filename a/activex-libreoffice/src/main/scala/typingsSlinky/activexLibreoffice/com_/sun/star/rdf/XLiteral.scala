package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a literal that may occur in a RDF graph.
  *
  * RDF literals may come in three varieties: just a string ValueValue and Languagetyped literal: Value and Datatype (represented by an {@link URI} ) Note
  * that there is no literal with both Language and Datatype.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XLiteral extends XNode {
  var Datatype: XURI = js.native
  var Language: String = js.native
  var Value: String = js.native
}

object XLiteral {
  @scala.inline
  def apply(Datatype: XURI, Language: String, StringValue: String, Value: String): XLiteral = {
    val __obj = js.Dynamic.literal(Datatype = Datatype.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XLiteral]
  }
  @scala.inline
  implicit class XLiteralOps[Self <: XLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatatype(value: XURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

