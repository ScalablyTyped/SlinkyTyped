package typingsSlinky.jssip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHandler[T] = js.Function1[/* e */ T, scala.Unit]
  type SessionCreateAnswerFailedEvent = typingsSlinky.std.DOMError
  type SessionCreateOfferFailedEvent = typingsSlinky.std.DOMError
  type SessionSetLocalDescriptionFailedEvent = typingsSlinky.std.DOMError
  type SessionSetRemoteDescriptionFailedEvent = typingsSlinky.std.DOMError
  type SessionUserMediaFailedEvent = typingsSlinky.std.DOMError
}
