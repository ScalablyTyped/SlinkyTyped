package typingsSlinky.ionicReact

import typingsSlinky.ionicReact.anon.RouterAnimation
import typingsSlinky.ionicReact.ionicReactStrings.routerDirection
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/hrefprops", JSImport.Namespace)
@js.native
object hrefpropsMod extends js.Object {
  type HrefProps[T] = (Omit[T, routerDirection]) with RouterAnimation
}

