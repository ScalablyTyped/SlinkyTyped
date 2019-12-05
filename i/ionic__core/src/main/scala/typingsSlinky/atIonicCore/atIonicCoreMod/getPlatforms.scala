package typingsSlinky.atIonicCore.atIonicCoreMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "getPlatforms")
@js.native
object getPlatforms extends js.Object {
  def apply(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
}

