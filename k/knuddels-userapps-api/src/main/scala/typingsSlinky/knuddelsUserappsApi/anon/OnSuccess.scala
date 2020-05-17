package typingsSlinky.knuddelsUserappsApi.anon

import typingsSlinky.knuddelsUserappsApi.mod.global.ExternalServerResponse
import typingsSlinky.knuddelsUserappsApi.mod.global.Json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSuccess extends js.Object {
  var data: js.UndefOr[Json] = js.native
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
}

object OnSuccess {
  @scala.inline
  def apply(): OnSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSuccess]
  }
  @scala.inline
  implicit class OnSuccessOps[Self <: OnSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
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

