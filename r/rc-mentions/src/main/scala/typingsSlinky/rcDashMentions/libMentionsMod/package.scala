package typingsSlinky.rcDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMentionsMod {
  import typingsSlinky.rcDashMentions.libUtilMod.Omit
  import typingsSlinky.rcDashMentions.rcDashMentionsStrings.onChange
  import typingsSlinky.rcDashMentions.rcDashMentionsStrings.onSelect
  import typingsSlinky.rcDashMentions.rcDashMentionsStrings.prefix
  import typingsSlinky.react.reactMod.TextareaHTMLAttributes
  import typingsSlinky.std.HTMLTextAreaElement

  type BaseTextareaAttrs = Omit[TextareaHTMLAttributes[HTMLTextAreaElement], prefix | onChange | onSelect]
}
