package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type ListenerFunction = js.Function1[
    /* p0 */ org.scalajs.dom.raw.Event | typingsSlinky.ol.eventMod.default, 
    scala.Unit | scala.Boolean
  ]
}
