package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicSourceSplit extends js.Object {
  /**
    * Primary part (continued to be processed by worker).
    * Specified relative to the previously-current source.
    * Becomes current.
    */
  var primary: js.UndefOr[DerivedSource] = js.native
  /**
    * Residual part (returned to the pool of work).
    * Specified relative to the previously-current source.
    */
  var residual: js.UndefOr[DerivedSource] = js.native
}

object DynamicSourceSplit {
  @scala.inline
  def apply(): DynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSourceSplit]
  }
  @scala.inline
  implicit class DynamicSourceSplitOps[Self <: DynamicSourceSplit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: DerivedSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withResidual(value: DerivedSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResidual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residual")(js.undefined)
        ret
    }
  }
  
}

