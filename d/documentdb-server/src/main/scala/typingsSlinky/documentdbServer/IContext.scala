package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContext extends js.Object {
  /** Gets the collection object. */
  def getCollection(): ICollection = js.native
  /** Gets the request object. */
  def getRequest(): IRequest = js.native
  /**
    * Gets the response object.
    * Note: this is not available in pre-triggers.
    */
  def getResponse(): IResponse = js.native
}

object IContext {
  @scala.inline
  def apply(getCollection: () => ICollection, getRequest: () => IRequest, getResponse: () => IResponse): IContext = {
    val __obj = js.Dynamic.literal(getCollection = js.Any.fromFunction0(getCollection), getRequest = js.Any.fromFunction0(getRequest), getResponse = js.Any.fromFunction0(getResponse))
    __obj.asInstanceOf[IContext]
  }
  @scala.inline
  implicit class IContextOps[Self <: IContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCollection(value: () => ICollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequest(value: () => IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResponse(value: () => IResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponse")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

