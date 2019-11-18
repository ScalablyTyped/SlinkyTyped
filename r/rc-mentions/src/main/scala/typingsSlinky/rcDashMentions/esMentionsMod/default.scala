package typingsSlinky.rcDashMentions.esMentionsMod

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashMentions.Anon_FilterOption
import typingsSlinky.rcDashMentions.esOptionMod.OptionProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var defaultProps: Anon_FilterOption = js.native
  def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
}

