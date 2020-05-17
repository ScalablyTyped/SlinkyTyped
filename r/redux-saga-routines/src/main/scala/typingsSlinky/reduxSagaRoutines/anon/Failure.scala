package typingsSlinky.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] extends js.Object {
  var failure: TFailureActionCreator = js.native
  var fulfill: TFulfillActionCreator = js.native
  var request: TRequestActionCreator = js.native
  var success: TSuccessActionCreator = js.native
  var trigger: TTriggerActionCreator = js.native
}

object Failure {
  @scala.inline
  def apply[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator](
    failure: TFailureActionCreator,
    fulfill: TFulfillActionCreator,
    request: TRequestActionCreator,
    success: TSuccessActionCreator,
    trigger: TTriggerActionCreator
  ): Failure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ] = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure[
      TTriggerActionCreator, 
      TRequestActionCreator, 
      TSuccessActionCreator, 
      TFailureActionCreator, 
      TFulfillActionCreator
    ]]
  }
  @scala.inline
  implicit class FailureOps[Self[ttriggeractioncreator, trequestactioncreator, tsuccessactioncreator, tfailureactioncreator, tfulfillactioncreator] <: Failure[
    ttriggeractioncreator, 
    trequestactioncreator, 
    tsuccessactioncreator, 
    tfailureactioncreator, 
    tfulfillactioncreator
  ], TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] (val x: Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ]) extends AnyVal {
    @scala.inline
    def duplicate: Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ]) with Other]
    @scala.inline
    def withFailure(value: TFailureActionCreator): Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFulfill(value: TFulfillActionCreator): Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: TRequestActionCreator): Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: TSuccessActionCreator): Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: TTriggerActionCreator): Self[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

