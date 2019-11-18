package typingsSlinky.rcDashMentions

import slinky.core.ReactComponentClass
import typingsSlinky.rcDashMentions.libMentionsMod.MentionsProps
import typingsSlinky.rcDashMentions.libMentionsMod.MentionsState
import typingsSlinky.rcDashMentions.libOptionMod.OptionProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.rcDashMentions.libMentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: ReactComponentClass[OptionProps] = js.native
    var defaultProps: Anon_FilterOptionHasValue = js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
  }
  
}

