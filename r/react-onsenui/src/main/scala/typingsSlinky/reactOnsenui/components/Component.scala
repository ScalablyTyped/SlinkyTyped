package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassName with P because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object Component {
  
  def apply[P, S](p: HTMLAttributesidclassName with P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-onsenui", "Component")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P, S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Component[P, S]]
  
  implicit def make[P, S](companion: Component.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
