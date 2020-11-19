package typingsSlinky.rcMentions.mentionsMod

import slinky.core.ReactComponentClass
import typingsSlinky.rcMentions.anon.FilterOption
import typingsSlinky.rcMentions.anon.PartialMentionsState
import typingsSlinky.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-mentions/es/Mentions", JSImport.Default)
@js.native
class default protected () extends Mentions {
  def this(props: MentionsProps) = this()
}
/* static members */
@JSImport("rc-mentions/es/Mentions", JSImport.Default)
@js.native
object default extends js.Object {
  
  var Option: ReactComponentClass[OptionProps] = js.native
  
  var defaultProps: FilterOption = js.native
  
  def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
}
