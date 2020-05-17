package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The description of an interaction request. */
@js.native
trait XInteractionRequest extends XInterface {
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  val Continuations: SafeArray[XInteractionContinuation] = js.native
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  val Request: js.Any = js.native
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  def getContinuations(): SafeArray[XInteractionContinuation] = js.native
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  def getRequest(): js.Any = js.native
}

object XInteractionRequest {
  @scala.inline
  def apply(
    Continuations: SafeArray[XInteractionContinuation],
    Request: js.Any,
    acquire: () => Unit,
    getContinuations: () => SafeArray[XInteractionContinuation],
    getRequest: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionRequest = {
    val __obj = js.Dynamic.literal(Continuations = Continuations.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContinuations = js.Any.fromFunction0(getContinuations), getRequest = js.Any.fromFunction0(getRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionRequest]
  }
  @scala.inline
  implicit class XInteractionRequestOps[Self <: XInteractionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuations(value: SafeArray[XInteractionContinuation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Continuations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContinuations(value: () => SafeArray[XInteractionContinuation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContinuations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequest(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequest")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

