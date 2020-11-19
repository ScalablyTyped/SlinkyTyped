package typingsSlinky.antd.mentionsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundedComponent extends ForwardRefExoticComponent[MentionProps with RefAttributes[HTMLElement]] {
  
  var Option: ReactComponentClass[typingsSlinky.rcMentions.optionMod.OptionProps] = js.native
  
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}
