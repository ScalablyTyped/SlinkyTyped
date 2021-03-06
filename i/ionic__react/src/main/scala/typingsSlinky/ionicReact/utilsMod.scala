package typingsSlinky.ionicReact

import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.Config_
import typingsSlinky.ionicCore.platformMod.Platforms
import typingsSlinky.ionicReact.anon.ElementeventskeystringeEv
import typingsSlinky.ionicReact.ionicReactPropsMod.IonicReactProps
import typingsSlinky.ionicReact.ionicReactStrings.android
import typingsSlinky.ionicReact.ionicReactStrings.capacitor
import typingsSlinky.ionicReact.ionicReactStrings.cordova
import typingsSlinky.ionicReact.ionicReactStrings.desktop
import typingsSlinky.ionicReact.ionicReactStrings.electron
import typingsSlinky.ionicReact.ionicReactStrings.hybrid
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.ipad
import typingsSlinky.ionicReact.ionicReactStrings.iphone
import typingsSlinky.ionicReact.ionicReactStrings.mobile
import typingsSlinky.ionicReact.ionicReactStrings.mobileweb
import typingsSlinky.ionicReact.ionicReactStrings.phablet
import typingsSlinky.ionicReact.ionicReactStrings.pwa
import typingsSlinky.ionicReact.ionicReactStrings.style
import typingsSlinky.ionicReact.ionicReactStrings.tablet
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ionic/react/dist/types/components/utils", "attachProps")
  @js.native
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  @JSImport("@ionic/react/dist/types/components/utils", "attachProps")
  @js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "camelToDashCase")
  @js.native
  def camelToDashCase(str: String): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "createForwardRef")
  @js.native
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "dashToPascalCase")
  @js.native
  def dashToPascalCase(str: String): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "getClassName")
  @js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "getConfig")
  @js.native
  def getConfig(): Config_ | Null = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "getPlatforms")
  @js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "isCoveredByReact")
  @js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "isPlatform")
  @js.native
  def isPlatform(platform: Platforms): Boolean = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "syncEvent")
  @js.native
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = js.native
  @JSImport("@ionic/react/dist/types/components/utils", "syncEvent")
  @js.native
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, _]
  ): Unit = js.native
  
  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}
