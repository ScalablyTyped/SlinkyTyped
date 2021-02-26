package typingsSlinky.emotionReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionReact.emotionReactMod.ClassNamesContent
import typingsSlinky.emotionReact.emotionReactMod.ClassNamesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClassNames {
  
  @scala.inline
  def apply(children: ClassNamesContent => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ClassNamesProps]))
  }
  
  @JSImport("@emotion/react", "ClassNames")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClassNamesProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
