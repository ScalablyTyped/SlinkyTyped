package typingsSlinky.rcMentions.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcMentions.mentionsContextMod.MentionsContextProps
import typingsSlinky.react.mod.ConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MentionsContextConsumer {
  
  @scala.inline
  def apply(children: MentionsContextProps => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[MentionsContextProps]]))
  }
  
  @JSImport("rc-mentions/es/MentionsContext", "MentionsContextConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[MentionsContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
