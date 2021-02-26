package typingsSlinky.rcMentions.components

import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.mod.default
import typingsSlinky.rcMentions.optionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcMentions {
  
  object Option {
    
    @JSImport("rc-mentions", "default.Option")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Option.type): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-mentions", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcMentions.type): SharedBuilder_MentionsProps1504682567[default] = new SharedBuilder_MentionsProps1504682567[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MentionsProps): SharedBuilder_MentionsProps1504682567[default] = new SharedBuilder_MentionsProps1504682567[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
