package typingsSlinky.qtip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QTip2 {
  import org.scalajs.dom.raw.Event
  import typingsSlinky.jquery.JQueryGenericPromise
  import typingsSlinky.qtip2.JQuery

  type EventApiFunc = js.Function2[/* event */ Event, /* api */ Api, Unit]
  type Target = JQuery | js.Array[Double] | String
  type Text = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[js.Any]
  /**
  	 * Content property
  	 */
  type Title = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[js.Any]
}
