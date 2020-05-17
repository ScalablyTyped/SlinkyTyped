package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
@js.native
trait ASPxClientGridViewBatchEditRowValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Provides validation information of a row currently being validated.
    */
  var validationInfo: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientGridViewBatchEditRowValidatingEventArgs {
  @scala.inline
  def apply(key: js.Any, validationInfo: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowValidatingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowValidatingEventArgsOps[Self <: ASPxClientGridViewBatchEditRowValidatingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

