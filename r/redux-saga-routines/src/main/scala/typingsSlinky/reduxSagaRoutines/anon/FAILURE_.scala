package typingsSlinky.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FAILURE_[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] extends js.Object {
  var FAILURE: js.UndefOr[TFailurePayloadCreator] = js.native
  var FULFILL: js.UndefOr[TFulfillPayloadCreator] = js.native
  var REQUEST: js.UndefOr[TRequestPayloadCreator] = js.native
  var SUCCESS: js.UndefOr[TSuccessPayloadCreator] = js.native
  var TRIGGER: js.UndefOr[TTriggerPayloadCreator] = js.native
  var failure: js.UndefOr[TFailurePayloadCreator] = js.native
  var fulfill: js.UndefOr[TFulfillPayloadCreator] = js.native
  var request: js.UndefOr[TRequestPayloadCreator] = js.native
  var success: js.UndefOr[TSuccessPayloadCreator] = js.native
  var trigger: js.UndefOr[TTriggerPayloadCreator] = js.native
}

object FAILURE_ {
  @scala.inline
  def apply[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](): FAILURE_[
    TTriggerPayloadCreator, 
    TRequestPayloadCreator, 
    TSuccessPayloadCreator, 
    TFailurePayloadCreator, 
    TFulfillPayloadCreator
  ] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FAILURE_[
      TTriggerPayloadCreator, 
      TRequestPayloadCreator, 
      TSuccessPayloadCreator, 
      TFailurePayloadCreator, 
      TFulfillPayloadCreator
    ]]
  }
  @scala.inline
  implicit class FAILURE_Ops[Self[ttriggerpayloadcreator, trequestpayloadcreator, tsuccesspayloadcreator, tfailurepayloadcreator, tfulfillpayloadcreator] <: FAILURE_[
    ttriggerpayloadcreator, 
    trequestpayloadcreator, 
    tsuccesspayloadcreator, 
    tfailurepayloadcreator, 
    tfulfillpayloadcreator
  ], TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] (val x: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ]) extends AnyVal {
    @scala.inline
    def duplicate: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ]) with Other]
    @scala.inline
    def withFAILURE(value: TFailurePayloadCreator): Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFAILURE: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(js.undefined)
        ret
    }
    @scala.inline
    def withFULFILL(value: TFulfillPayloadCreator): Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULFILL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFULFILL: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULFILL")(js.undefined)
        ret
    }
    @scala.inline
    def withREQUEST(value: TRequestPayloadCreator): Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutREQUEST: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(js.undefined)
        ret
    }
    @scala.inline
    def withSUCCESS(value: TSuccessPayloadCreator): Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSUCCESS: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(js.undefined)
        ret
    }
    @scala.inline
    def withTRIGGER(value: TTriggerPayloadCreator): Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRIGGER: Self[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER")(js.undefined)
        ret
    }
  }
  
}

