package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.basic
import typingsSlinky.dateFns.dateFnsStrings.complete
import typingsSlinky.dateFns.dateFnsStrings.date
import typingsSlinky.dateFns.dateFnsStrings.extended
import typingsSlinky.dateFns.dateFnsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  var format: js.UndefOr[extended | basic] = js.native
  
  var representation: js.UndefOr[complete | date | time] = js.native
}
object Format {
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: extended | basic): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setRepresentation(value: complete | date | time): Self = this.set("representation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepresentation: Self = this.set("representation", js.undefined)
  }
}
