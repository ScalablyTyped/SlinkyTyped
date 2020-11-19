package typingsSlinky.rcMentions

import slinky.core.ReactComponentClass
import typingsSlinky.rcMentions.anon.FilterOption
import typingsSlinky.rcMentions.anon.PartialMentionsState
import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.mentionsMod.MentionsState
import typingsSlinky.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-mentions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typingsSlinky.rcMentions.mentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Option: ReactComponentClass[OptionProps] = js.native
    
    var defaultProps: FilterOption = js.native
    
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
  }
}
