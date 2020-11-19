package typingsSlinky.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompetitiveQuickplay extends js.Object {
  
  var competitive: Gameswon = js.native
  
  var quickplay: Eliminationsperlife = js.native
}
object CompetitiveQuickplay {
  
  @scala.inline
  def apply(competitive: Gameswon, quickplay: Eliminationsperlife): CompetitiveQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompetitiveQuickplay]
  }
  
  @scala.inline
  implicit class CompetitiveQuickplayOps[Self <: CompetitiveQuickplay] (val x: Self) extends AnyVal {
    
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
    def setCompetitive(value: Gameswon): Self = this.set("competitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickplay(value: Eliminationsperlife): Self = this.set("quickplay", value.asInstanceOf[js.Any])
  }
}
