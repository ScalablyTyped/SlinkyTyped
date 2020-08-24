package typingsSlinky.emittery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventName = java.lang.String | js.Symbol
  type EventNameFromDataMap[EventDataMap] = typingsSlinky.std.Extract[/* keyof EventDataMap */ java.lang.String, typingsSlinky.emittery.mod.EventName]
  /**
  Emittery also accepts an array of strings and symbols as event names.
  */
  type EventNames = typingsSlinky.emittery.mod.EventName | js.Array[typingsSlinky.emittery.mod.EventName]
  /**
  	Removes an event subscription.
  	*/
  type UnsubscribeFn = js.Function0[scala.Unit]
}
