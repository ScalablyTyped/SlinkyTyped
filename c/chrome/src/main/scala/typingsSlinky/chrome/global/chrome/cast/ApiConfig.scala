package typingsSlinky.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    autoJoinPolicy: js.UndefOr[scala.Nothing],
    defaultActionPolicy: typingsSlinky.chrome.chrome.cast.DefaultActionPolicy
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
}
