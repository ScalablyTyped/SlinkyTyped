package typingsSlinky.knuddelsUserappsApi.anon

import typingsSlinky.knuddelsUserappsApi.mod.global.ExternalServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFailure extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
}

object OnFailure {
  @scala.inline
  def apply(): OnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFailure]
  }
  @scala.inline
  implicit class OnFailureOps[Self <: OnFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFailure(value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
  }
  
}

