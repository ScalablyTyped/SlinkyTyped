package typingsSlinky.rdfExt.anon

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.language
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datatype extends js.Object {
  
  var datatype: TermTypeValue = js.native
  
  var language: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.language] = js.native
  
  var termType: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
  
  var value: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
}
object Datatype {
  
  @scala.inline
  def apply(
    datatype: TermTypeValue,
    language: PropType[Literal, language],
    termType: PropType[Literal, termType],
    value: PropType[Literal, value]
  ): Datatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatype]
  }
  
  @scala.inline
  implicit class DatatypeOps[Self <: Datatype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatatype(value: TermTypeValue): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: PropType[Literal, language]): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermType(value: PropType[Literal, termType]): Self = this.set("termType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: PropType[Literal, value]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
