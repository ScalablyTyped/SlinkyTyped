package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileRequest extends js.Object {
  /**
    * Raised when the request is complete (success or error).
    */
  var onCompleteObservable: Observable[IFileRequest] = js.native
  /**
    * Aborts the request for a file.
    */
  def abort(): Unit = js.native
}

object IFileRequest {
  @scala.inline
  def apply(abort: () => Unit, onCompleteObservable: Observable[IFileRequest]): IFileRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onCompleteObservable = onCompleteObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRequest]
  }
  @scala.inline
  implicit class IFileRequestOps[Self <: IFileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCompleteObservable(value: Observable[IFileRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleteObservable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

