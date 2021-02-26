package typingsSlinky.rbx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rbx.anon.As
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.typesMod.Prefer
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (typingsSlinky.rbx.typesMod.Prefer[
typingsSlinky.rbx.anon.As[TAsComponent] with typingsSlinky.rbx.anon.PreferHelpersPropsOverrid, 
typingsSlinky.react.mod.ComponentProps[TAsComponent]]) with (typingsSlinky.react.mod.RefAttributes[TAsComponent | typingsSlinky.rbx.exoticMod.FromReactType[TAsComponent]]) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Radio {
  
  def apply[TAsComponent /* <: ReactType[js.Any] */](
    p: (Prefer[As[TAsComponent] with PreferHelpersPropsOverrid, ComponentProps[TAsComponent]]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("rbx", "Radio")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[TAsComponent /* <: ReactType[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[TAsComponent /* <: ReactType[js.Any] */](companion: Radio.type): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, js.Dictionary.empty))()
}
