package typingsSlinky.ionicCore.platformMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/platform", "setupPlatforms")
@js.native
object setupPlatforms extends js.Object {
  def apply(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def apply(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
}

