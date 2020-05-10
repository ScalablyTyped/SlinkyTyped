package typingsSlinky.got.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hooks allow modifications during the request lifecycle. Hook functions may be async and are
  * run serially.
  *
  * @see https://github.com/sindresorhus/got#hooks
  * @template Options Request options.
  * @template Body Response body type.
  */
@js.native
trait Hooks[Options, Body /* <: Buffer | String | js.Object */] extends js.Object {
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook[Options, Body]]] = js.native
  var beforeError: js.UndefOr[js.Array[BeforeErrorHook]] = js.native
  var beforeRedirect: js.UndefOr[js.Array[BeforeRedirectHook[Options]]] = js.native
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook[Options]]] = js.native
  var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook[Options]]] = js.native
  var init: js.UndefOr[js.Array[InitHook[Options]]] = js.native
}

object Hooks {
  @scala.inline
  def apply[Options, Body](): Hooks[Options, Body] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks[Options, Body]]
  }
  @scala.inline
  implicit class HooksOps[Self[options, body] <: Hooks[options, body], Options, Body] (val x: Self[Options, Body]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, Body] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, Body]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, Body]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, Body]) with Other]
    @scala.inline
    def withAfterResponse(value: js.Array[AfterResponseHook[Options, Body]]): Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterResponse: Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeError(value: js.Array[BeforeErrorHook]): Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeError: Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeError")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRedirect(value: js.Array[BeforeRedirectHook[Options]]): Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeRedirect: Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRequest(value: js.Array[BeforeRequestHook[Options]]): Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeRequest: Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRetry(value: js.Array[BeforeRetryHook[Options]]): Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeRetry: Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: js.Array[InitHook[Options]]): Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self[Options, Body] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
  }
  
}

