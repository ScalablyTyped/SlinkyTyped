package typingsSlinky.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.ApiConfig")
@js.native
class ApiConfig protected ()
  extends typingsSlinky.chrome.chrome.cast.ApiConfig {
  /**
    * @param {!chrome.cast.SessionRequest} sessionRequest
    * @param {function(!chrome.cast.Session)} sessionListener
    * @param {function(!chrome.cast.ReceiverAvailability,Array<Object>)}
    *     receiverListener
    * @param {chrome.cast.AutoJoinPolicy=} opt_autoJoinPolicy
    * @param {chrome.cast.DefaultActionPolicy=} opt_defaultActionPolicy
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ApiConfig
    */
  def this(
    sessionRequest: typingsSlinky.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsSlinky.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ]
  ) = this()
  def this(
    sessionRequest: typingsSlinky.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsSlinky.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ],
    autoJoinPolicy: typingsSlinky.chrome.chrome.cast.AutoJoinPolicy
  ) = this()
  def this(
    sessionRequest: typingsSlinky.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsSlinky.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ],
    autoJoinPolicy: typingsSlinky.chrome.chrome.cast.AutoJoinPolicy,
    defaultActionPolicy: typingsSlinky.chrome.chrome.cast.DefaultActionPolicy
  ) = this()
  /* CompleteClass */
  override var defaultActionPolicy: typingsSlinky.chrome.chrome.cast.DefaultActionPolicy = js.native
  /* CompleteClass */
  override var sessionRequest: typingsSlinky.chrome.chrome.cast.SessionRequest = js.native
  /* CompleteClass */
  override def receiverListener(receiverAvailability: typingsSlinky.chrome.chrome.cast.ReceiverAvailability): Unit = js.native
  /* CompleteClass */
  override def sessionListener(session: typingsSlinky.chrome.chrome.cast.Session): Unit = js.native
}

