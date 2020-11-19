package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an external link in a formula.
  * @since OOo 3.1
  */
@js.native
trait ExternalLinkInfo extends js.Object {
  
  /**
    * Location of this link type.
    *
    * Modes used:
    *
    *  1. If {@link Type} is ExternalLinkType::EXTERNAL, this member shall contain a `string` with the **URI** of a document. The formula that would need
    * this information for example would contain `=[1]Sheet1!A1` or `='[1]Sheet name'!A1` where **[1]** does resolve to the URI contained in the member
    * {@link Data} . Note that the quotes cover both, the document name and the sheet name.
    *
    *  2. If {@link Type} is {@link ExternalLinkType.DDE} , this member shall contain a {@link DDELinkInfo} describing service name, topic, and all known
    * items of a DDE link.
    */
  var Data: js.Any = js.native
  
  /** Link type, one of {@link ExternalLinkType} constants. */
  var Type: Double = js.native
}
object ExternalLinkInfo {
  
  @scala.inline
  def apply(Data: js.Any, Type: Double): ExternalLinkInfo = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalLinkInfo]
  }
  
  @scala.inline
  implicit class ExternalLinkInfoOps[Self <: ExternalLinkInfo] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
