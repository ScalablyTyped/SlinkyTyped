package typingsSlinky.rbx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rbx.anon.As
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.titleTitleMod.TitleProps
import typingsSlinky.rbx.typesMod.Prefer
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (typingsSlinky.rbx.typesMod.Prefer[
typingsSlinky.rbx.anon.As[TAsComponent] with typingsSlinky.rbx.titleTitleMod.TitleProps, 
typingsSlinky.react.mod.ComponentProps[TAsComponent]]) with (typingsSlinky.react.mod.RefAttributes[TAsComponent | typingsSlinky.rbx.exoticMod.FromReactType[TAsComponent]]) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Title {
  @JSImport("rbx", "Title")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.react.mod.ReactType[js.Any] */ TAsComponent] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: typingsSlinky.react.mod.ReactType[js.Any] */ TAsComponent](
    p: (Prefer[As[TAsComponent] with TitleProps, ComponentProps[TAsComponent]]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.react.mod.ReactType[js.Any] */ TAsComponent](companion: Title.type): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, js.Dictionary.empty))()
}

