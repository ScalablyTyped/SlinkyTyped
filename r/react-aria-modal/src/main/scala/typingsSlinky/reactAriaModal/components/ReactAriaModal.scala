package typingsSlinky.reactAriaModal.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleId
import typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleTe
import typingsSlinky.reactAriaModal.mod.AriaModalProps
import typingsSlinky.reactAriaModal.mod.RequiredAriaTypes
import typingsSlinky.reactAriaModal.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactAriaModal.mod.AriaModalProps with (typingsSlinky.reactAriaModal.mod.RequiredAriaTypes[
typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleId, 
typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleTe]) because: IArray(Couldn't find props for typingsSlinky.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleId with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with js.Any with typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleTe because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object ReactAriaModal {
  
  @JSImport("react-aria-modal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe])): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactAriaModal.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
