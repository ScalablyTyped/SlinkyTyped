package typingsSlinky.rcMentions.components

import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-mentions/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MentionsProps): SharedBuilder_MentionsProps1504682567[default] = new SharedBuilder_MentionsProps1504682567[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Lib.type): SharedBuilder_MentionsProps1504682567[default] = new SharedBuilder_MentionsProps1504682567[default](js.Array(this.component, js.Dictionary.empty))()
}

