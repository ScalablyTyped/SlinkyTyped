package typingsSlinky.rcDashMentions

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashMentions.esMentionsMod.MentionsProps
import typingsSlinky.rcDashMentions.esMentionsMod.MentionsState
import typingsSlinky.rcDashMentions.esOptionMod.OptionProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.rcDashMentions.esMentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: ReactComponentClass[OptionProps] = js.native
    var defaultProps: Anon_FilterOption = js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
  }
  
}

