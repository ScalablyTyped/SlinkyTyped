package typingsSlinky.expo.updatesMod

import typingsSlinky.expo.anon.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Updates/Updates", "fetchUpdateAsync")
@js.native
object fetchUpdateAsync extends js.Object {
  def apply(): js.Promise[UpdateFetchResult] = js.native
  def apply(hasEventListener: EventListener): js.Promise[UpdateFetchResult] = js.native
}

