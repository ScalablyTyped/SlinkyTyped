package typingsSlinky.ecmarkup.biblioMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ecmarkup.ecmarkupStrings.example
import typingsSlinky.ecmarkup.ecmarkupStrings.figure
import typingsSlinky.ecmarkup.ecmarkupStrings.note
import typingsSlinky.ecmarkup.ecmarkupStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FigureBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  
  @JSName("id")
  var id_FigureBiblioEntry: String = js.native
  
  var node: HTMLElement = js.native
  
  @JSName("number")
  var number_FigureBiblioEntry: String | Double = js.native
  
  @JSName("type")
  var type_FigureBiblioEntry: table | figure | example | note = js.native
}
object FigureBiblioEntry {
  
  @scala.inline
  def apply(
    id: String,
    node: HTMLElement,
    number: String | Double,
    referencingIds: js.Array[String],
    `type`: table | figure | example | note
  ): FigureBiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FigureBiblioEntry]
  }
  
  @scala.inline
  implicit class FigureBiblioEntryOps[Self <: FigureBiblioEntry] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String | Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: table | figure | example | note): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
