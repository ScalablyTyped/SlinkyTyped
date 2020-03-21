package typingsSlinky.antd.mod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.mentionsMod.MentionsConfig
import typingsSlinky.antd.mentionsMod.MentionsEntity
import typingsSlinky.antd.mentionsMod.default
import typingsSlinky.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Mentions")
@js.native
class Mentions () extends default

/* static members */
@JSImport("antd", "Mentions")
@js.native
object Mentions extends js.Object {
  var Option: ReactComponentClass[OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

