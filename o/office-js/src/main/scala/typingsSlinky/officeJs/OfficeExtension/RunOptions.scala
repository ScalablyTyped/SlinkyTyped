package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunOptions[T] extends js.Object {
  /**
    *  A previously-created context, or API object, or array of objects. 
    * The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up 
    * by `context.sync()`.
    */
  var previousObjects: js.UndefOr[ClientObject | js.Array[ClientObject] | ClientRequestContext] = js.native
  /**
    * The URL of the remote workbook and the request headers to be sent.
    */
  var session: js.UndefOr[RequestUrlAndHeaderInfo | T] = js.native
}

object RunOptions {
  @scala.inline
  def apply[T](): RunOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions[T]]
  }
  @scala.inline
  implicit class RunOptionsOps[Self[t] <: RunOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPreviousObjects(value: ClientObject | js.Array[ClientObject] | ClientRequestContext): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousObjects: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: RequestUrlAndHeaderInfo | T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

