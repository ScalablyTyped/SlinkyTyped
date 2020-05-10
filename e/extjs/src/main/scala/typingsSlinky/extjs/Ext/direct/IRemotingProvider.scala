package typingsSlinky.extjs.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var actions: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var disableNestedActions: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number/Boolean) */
  var enableBuffer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var enableUrlEncode: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var maxRetries: js.UndefOr[Double] = js.native
  /** [Config Option] (String/Object) */
  var namespace: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IRemotingProvider {
  @scala.inline
  def apply(): IRemotingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingProvider]
  }
  @scala.inline
  implicit class IRemotingProviderOps[Self <: IRemotingProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNestedActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNestedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNestedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNestedActions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUrlEncode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUrlEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUrlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUrlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

