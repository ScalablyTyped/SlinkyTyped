package typingsSlinky.rcDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMentionsMod {
  import org.scalajs.dom.raw.HTMLTextAreaElement
  import typingsSlinky.rcDashMentions.esUtilMod.Omit
  import typingsSlinky.rcDashMentions.rcDashMentionsStrings.onChange
  import typingsSlinky.rcDashMentions.rcDashMentionsStrings.onSelect
  import typingsSlinky.rcDashMentions.rcDashMentionsStrings.prefix
  import typingsSlinky.react.reactMod.TextareaHTMLAttributes

  type BaseTextareaAttrs = Omit[TextareaHTMLAttributes[HTMLTextAreaElement], prefix | onChange | onSelect]
}
