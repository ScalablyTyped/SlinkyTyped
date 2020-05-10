package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextualMenuItemWrapper {
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper", "ContextualMenuItemWrapper")
  @js.native
  object component extends js.Object
  
  def withProps(p: IContextualMenuItemWrapperProps): SharedBuilder_IContextualMenuItemWrapperProps2045562707[
    typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ] = new SharedBuilder_IContextualMenuItemWrapperProps2045562707[
    typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    classNames: IMenuItemClassNames,
    focusableElementIndex: Double,
    index: Double,
    item: IContextualMenuItem,
    totalItemCount: Double
  ): SharedBuilder_IContextualMenuItemWrapperProps2045562707[
    typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ] = {
    val __props = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    new SharedBuilder_IContextualMenuItemWrapperProps2045562707[
      typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperMod.ContextualMenuItemWrapper
    ](js.Array(this.component, __props.asInstanceOf[IContextualMenuItemWrapperProps]))
  }
}

