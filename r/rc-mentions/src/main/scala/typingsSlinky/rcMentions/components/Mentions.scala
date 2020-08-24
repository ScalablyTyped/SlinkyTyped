package typingsSlinky.rcMentions.components

import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.mentionsMod.default
import typingsSlinky.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mentions {
  @JSImport("rc-mentions/es/Mentions", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MentionsProps): SharedBuilder_MentionsProps1504682567[default] = new SharedBuilder_MentionsProps1504682567[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Mentions.type): SharedBuilder_MentionsProps1504682567[default] = new SharedBuilder_MentionsProps1504682567[default](js.Array(this.component, js.Dictionary.empty))()
  object Option {
    @JSImport("rc-mentions/es/Mentions", "default.Option")
    @js.native
    object component extends js.Object
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Option.type): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

