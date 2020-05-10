package typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendConnectionErrors extends js.Object {
  /**
    * <p/>
    */
  var ConnectionRefusedCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var HTTPCode4XXCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var HTTPCode5XXCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var OtherCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var TimeoutCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var UnknownHostCount: js.UndefOr[Double] = js.native
}

object BackendConnectionErrors {
  @scala.inline
  def apply(): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendConnectionErrors]
  }
  @scala.inline
  implicit class BackendConnectionErrorsOps[Self <: BackendConnectionErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionRefusedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionRefusedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRefusedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionRefusedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHTTPCode4XXCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPCode4XXCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTTPCode4XXCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPCode4XXCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHTTPCode5XXCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPCode5XXCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTTPCode5XXCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPCode5XXCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownHostCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnknownHostCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownHostCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnknownHostCount")(js.undefined)
        ret
    }
  }
  
}

