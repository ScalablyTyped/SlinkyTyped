package typingsSlinky.ionicReact

import typingsSlinky.ionicReact.utilsMod.IonicReactExternalProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/createComponent", JSImport.Namespace)
@js.native
object createComponentMod extends js.Object {
  
  def createReactComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  def createReactComponent[PropType, ElementType](tagName: String, routerLinkComponent: Boolean): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
}
