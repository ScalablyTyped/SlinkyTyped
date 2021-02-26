package typingsSlinky.emotionCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionCore.mod.ClassNamesContent
import typingsSlinky.emotionCore.mod.ClassNamesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClassNames {
  
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => ReactElement): Builder[Theme] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Theme](js.Array(this.component, __props.asInstanceOf[ClassNamesProps[Theme]]))
  }
  
  @JSImport("@emotion/core", "ClassNames")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Theme] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[Theme](p: ClassNamesProps[Theme]): Builder[Theme] = new Builder[Theme](js.Array(this.component, p.asInstanceOf[js.Any]))
}
