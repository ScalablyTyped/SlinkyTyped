package typingsSlinky.rcMentions.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcMentions.mentionsContextMod.MentionsContextProps
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsContextProvider {
  @JSImport("rc-mentions/lib/MentionsContext", "MentionsContextProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[MentionsContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: MentionsContextProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[MentionsContextProps]]))
  }
}

