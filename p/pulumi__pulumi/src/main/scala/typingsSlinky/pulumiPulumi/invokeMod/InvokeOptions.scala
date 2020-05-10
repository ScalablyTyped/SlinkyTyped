package typingsSlinky.pulumiPulumi.invokeMod

import typingsSlinky.pulumiPulumi.resourceMod.ProviderResource
import typingsSlinky.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeOptions extends js.Object {
  /**
    * Invoke this function asynchronously.  If 'true' is passed in here, then an invoked function
    * will only supply the `Promise<>` side of its result.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * An optional parent to use for default options for this invoke (e.g. the default provider to use).
    */
  var parent: js.UndefOr[Resource] = js.native
  /**
    * An optional provider to use for this invocation. If no provider is supplied, the default provider for the
    * invoked function's package will be used.
    */
  var provider: js.UndefOr[ProviderResource] = js.native
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when performing this
    * invoke.
    */
  var version: js.UndefOr[String] = js.native
}

object InvokeOptions {
  @scala.inline
  def apply(): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeOptions]
  }
  @scala.inline
  implicit class InvokeOptionsOps[Self <: InvokeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: ProviderResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

