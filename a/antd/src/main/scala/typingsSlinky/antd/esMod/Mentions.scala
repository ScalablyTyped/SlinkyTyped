package typingsSlinky.antd.esMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.esMentionsMod.MentionsConfig
import typingsSlinky.antd.esMentionsMod.MentionsEntity
import typingsSlinky.antd.esMentionsMod.default
import typingsSlinky.rcDashMentions.libOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Mentions")
@js.native
class Mentions () extends default

/* static members */
@JSImport("antd/es", "Mentions")
@js.native
object Mentions extends js.Object {
  var Option: ReactComponentClass[OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

