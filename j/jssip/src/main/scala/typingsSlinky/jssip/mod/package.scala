package typingsSlinky.jssip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHandler[T] = js.Function1[/* e */ T, scala.Unit]
  type SessionCreateAnswerFailedEvent = org.scalajs.dom.raw.DOMError
  type SessionCreateOfferFailedEvent = org.scalajs.dom.raw.DOMError
  type SessionSetLocalDescriptionFailedEvent = org.scalajs.dom.raw.DOMError
  type SessionSetRemoteDescriptionFailedEvent = org.scalajs.dom.raw.DOMError
  type SessionUserMediaFailedEvent = org.scalajs.dom.raw.DOMError
}
