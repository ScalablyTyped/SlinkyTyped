package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.atIonicCoreStrings.android
import typingsSlinky.atIonicCore.atIonicCoreStrings.capacitor
import typingsSlinky.atIonicCore.atIonicCoreStrings.cordova
import typingsSlinky.atIonicCore.atIonicCoreStrings.desktop
import typingsSlinky.atIonicCore.atIonicCoreStrings.electron
import typingsSlinky.atIonicCore.atIonicCoreStrings.hybrid
import typingsSlinky.atIonicCore.atIonicCoreStrings.ios
import typingsSlinky.atIonicCore.atIonicCoreStrings.ipad
import typingsSlinky.atIonicCore.atIonicCoreStrings.iphone
import typingsSlinky.atIonicCore.atIonicCoreStrings.mobile
import typingsSlinky.atIonicCore.atIonicCoreStrings.mobileweb
import typingsSlinky.atIonicCore.atIonicCoreStrings.phablet
import typingsSlinky.atIonicCore.atIonicCoreStrings.pwa
import typingsSlinky.atIonicCore.atIonicCoreStrings.tablet
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/platform", JSImport.Namespace)
@js.native
object distTypesUtilsPlatformMod extends js.Object {
  @js.native
  trait IsPlatformSignature extends js.Object {
    def apply(plt: Platforms): Boolean = js.native
    def apply(win: Window, plt: Platforms): Boolean = js.native
  }
  
  val isPlatform: IsPlatformSignature = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def testUserAgent(win: org.scalajs.dom.raw.Window, expr: js.RegExp): Boolean = js.native
  type Platforms = String
}

