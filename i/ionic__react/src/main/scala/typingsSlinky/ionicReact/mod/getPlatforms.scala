package typingsSlinky.ionicReact.mod

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
import typingsSlinky.ionicReact.ionicReactStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "getPlatforms")
@js.native
object getPlatforms extends js.Object {
  def apply(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
}

