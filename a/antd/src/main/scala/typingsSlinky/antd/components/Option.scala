package typingsSlinky.antd.components

import typingsSlinky.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Option {
  @JSImport("antd/lib/mentions", "Option")
  @js.native
  object component extends js.Object
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Option.type): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, js.Dictionary.empty))()
}

