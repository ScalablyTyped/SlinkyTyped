package typingsSlinky.rcMentions.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcMentions.mentionsContextMod.MentionsContextProps
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MentionsContextProvider {
  
  @scala.inline
  def apply(value: MentionsContextProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[MentionsContextProps]]))
  }
  
  @JSImport("rc-mentions/es/MentionsContext", "MentionsContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[MentionsContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
