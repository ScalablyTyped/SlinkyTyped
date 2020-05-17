package typingsSlinky.ionicReact

import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.Config_
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def camelToDashCase(str: String): String = js.native
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  def dashToPascalCase(str: String): String = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def getConfig(): Config_ | Null = js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document): Boolean = js.native
  def isPlatform(
    platform: ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ): Boolean = js.native
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = js.native
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, _]
  ): Unit = js.native
  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}

