package typingsSlinky.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildARMod {
  import typingsSlinky.expo.Anon_BlendShapes
  import typingsSlinky.expo.Anon_Center
  import typingsSlinky.expo.Anon_Image

  type Anchor = BaseAnchor | PlaneAnchor | ImageAnchor | FaceAnchor
  type FaceAnchor = BaseAnchor with Anon_BlendShapes
  type FrameDidUpdateEvent = js.Object
  type ImageAnchor = BaseAnchor with Anon_Image
  type Matrix = js.Array[Double]
  type PlaneAnchor = BaseAnchor with Anon_Center
  type ReactNativeNodeHandle = Double
  type SessionInterruptionEndedEvent = js.Object
  type SessionWasInterruptedEvent = js.Object
}
