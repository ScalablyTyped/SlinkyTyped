package typingsSlinky.antd.antdMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.libMentionsMod.MentionsConfig
import typingsSlinky.antd.libMentionsMod.MentionsEntity
import typingsSlinky.antd.libMentionsMod.default
import typingsSlinky.rcDashMentions.libOptionMod.OptionProps
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

