package typingsSlinky.expo.aRMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "startAsync")
@js.native
object startAsync extends js.Object {
  def apply(node: ReactNativeNodeHandle, configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def apply(node: ReactComponentClass[js.Object], configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
}

