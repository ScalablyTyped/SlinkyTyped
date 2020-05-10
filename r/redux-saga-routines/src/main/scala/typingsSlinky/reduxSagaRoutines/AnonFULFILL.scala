package typingsSlinky.reduxSagaRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFULFILL[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] extends js.Object {
  var FAILURE: js.UndefOr[TFailureMetaCreator] = js.native
  var FULFILL: js.UndefOr[TFulfillMetaCreator] = js.native
  var REQUEST: js.UndefOr[TRequestMetaCreator] = js.native
  var SUCCESS: js.UndefOr[TSuccessMetaCreator] = js.native
  var TRIGGER: js.UndefOr[TTriggerMetaCreator] = js.native
  var failure: js.UndefOr[TFailureMetaCreator] = js.native
  var fulfill: js.UndefOr[TFulfillMetaCreator] = js.native
  var request: js.UndefOr[TRequestMetaCreator] = js.native
  var success: js.UndefOr[TSuccessMetaCreator] = js.native
  var trigger: js.UndefOr[TTriggerMetaCreator] = js.native
}

object AnonFULFILL {
  @scala.inline
  def apply[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](): AnonFULFILL[
    TTriggerMetaCreator, 
    TRequestMetaCreator, 
    TSuccessMetaCreator, 
    TFailureMetaCreator, 
    TFulfillMetaCreator
  ] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFULFILL[
      TTriggerMetaCreator, 
      TRequestMetaCreator, 
      TSuccessMetaCreator, 
      TFailureMetaCreator, 
      TFulfillMetaCreator
    ]]
  }
  @scala.inline
  implicit class AnonFULFILLOps[Self[ttriggermetacreator, trequestmetacreator, tsuccessmetacreator, tfailuremetacreator, tfulfillmetacreator] <: AnonFULFILL[
    ttriggermetacreator, 
    trequestmetacreator, 
    tsuccessmetacreator, 
    tfailuremetacreator, 
    tfulfillmetacreator
  ], TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] (val x: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ]) extends AnyVal {
    @scala.inline
    def duplicate: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ]) with Other]
    @scala.inline
    def withFAILURE(value: TFailureMetaCreator): Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFAILURE: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(js.undefined)
        ret
    }
    @scala.inline
    def withFULFILL(value: TFulfillMetaCreator): Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULFILL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFULFILL: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULFILL")(js.undefined)
        ret
    }
    @scala.inline
    def withREQUEST(value: TRequestMetaCreator): Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutREQUEST: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(js.undefined)
        ret
    }
    @scala.inline
    def withSUCCESS(value: TSuccessMetaCreator): Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSUCCESS: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(js.undefined)
        ret
    }
    @scala.inline
    def withTRIGGER(value: TTriggerMetaCreator): Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRIGGER: Self[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER")(js.undefined)
        ret
    }
  }
  
}

