package typingsSlinky.ionicReact

import typingsSlinky.ionicReact.utilsMod.IonicReactExternalProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createComponent", "createReactComponent")
  @js.native
  def createReactComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  @JSImport("@ionic/react/dist/types/components/createComponent", "createReactComponent")
  @js.native
  def createReactComponent[PropType, ElementType](tagName: String, routerLinkComponent: Boolean): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
}
