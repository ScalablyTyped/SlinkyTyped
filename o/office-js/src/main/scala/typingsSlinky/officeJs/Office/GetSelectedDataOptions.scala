package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for customizing what data is returned and how it is formatted.
  */
@js.native
trait GetSelectedDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Specify whether to get only the visible (that is, filtered-in) data or all the data. Useful when filtering data. 
    * Use {@link Office.FilterType} or string equivalent. This parameter is ignored in Word documents.
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /**
    * Specify whether the data is formatted. Use Office.ValueFormat or string equivalent.
    */
  var valueFormat: js.UndefOr[ValueFormat | String] = js.native
}

object GetSelectedDataOptions {
  @scala.inline
  def apply(): GetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSelectedDataOptions]
  }
  @scala.inline
  implicit class GetSelectedDataOptionsOps[Self <: GetSelectedDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncContext")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: FilterType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormat(value: ValueFormat | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.undefined)
        ret
    }
  }
  
}

