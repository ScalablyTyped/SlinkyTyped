package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Window
import typingsSlinky.ionicCore.ionicCoreStrings.android
import typingsSlinky.ionicCore.ionicCoreStrings.capacitor
import typingsSlinky.ionicCore.ionicCoreStrings.cordova
import typingsSlinky.ionicCore.ionicCoreStrings.desktop
import typingsSlinky.ionicCore.ionicCoreStrings.electron
import typingsSlinky.ionicCore.ionicCoreStrings.hybrid
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.ipad
import typingsSlinky.ionicCore.ionicCoreStrings.iphone
import typingsSlinky.ionicCore.ionicCoreStrings.mobile
import typingsSlinky.ionicCore.ionicCoreStrings.mobileweb
import typingsSlinky.ionicCore.ionicCoreStrings.phablet
import typingsSlinky.ionicCore.ionicCoreStrings.pwa
import typingsSlinky.ionicCore.ionicCoreStrings.tablet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("@ionic/core/dist/types/utils/platform", "getPlatforms")
  @js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  @JSImport("@ionic/core/dist/types/utils/platform", "getPlatforms")
  @js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/platform", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  @JSImport("@ionic/core/dist/types/utils/platform", "setupPlatforms")
  @js.native
  def setupPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  @JSImport("@ionic/core/dist/types/utils/platform", "setupPlatforms")
  @js.native
  def setupPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/platform", "testUserAgent")
  @js.native
  def testUserAgent(win: Window, expr: js.RegExp): Boolean = js.native
  
  @js.native
  trait IsPlatformSignature extends StObject {
    
    def apply(plt: Platforms): Boolean = js.native
    def apply(win: Window, plt: Platforms): Boolean = js.native
  }
  
  /* keyof @ionic/core.anon.Android */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.ipad
    - typingsSlinky.ionicCore.ionicCoreStrings.iphone
    - typingsSlinky.ionicCore.ionicCoreStrings.ios
    - typingsSlinky.ionicCore.ionicCoreStrings.android
    - typingsSlinky.ionicCore.ionicCoreStrings.phablet
    - typingsSlinky.ionicCore.ionicCoreStrings.tablet
    - typingsSlinky.ionicCore.ionicCoreStrings.cordova
    - typingsSlinky.ionicCore.ionicCoreStrings.capacitor
    - typingsSlinky.ionicCore.ionicCoreStrings.electron
    - typingsSlinky.ionicCore.ionicCoreStrings.pwa
    - typingsSlinky.ionicCore.ionicCoreStrings.mobile
    - typingsSlinky.ionicCore.ionicCoreStrings.mobileweb
    - typingsSlinky.ionicCore.ionicCoreStrings.desktop
    - typingsSlinky.ionicCore.ionicCoreStrings.hybrid
  */
  trait Platforms extends StObject
}
