package typingsSlinky.canvasDashGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CanvasGauges {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLElement

  type AnimationRule = js.Function1[/* percent */ Double, Double]
  type DrawEventCallback = js.Function1[/* percent */ Double, js.Any]
  type EndEventCallback = js.Function0[js.Any]
  type EventListeners = StringDictionary[js.Function | js.Array[js.Function]]
  type MajorTicks = js.Array[Double | String]
  type RenderTarget = String | HTMLElement
}
