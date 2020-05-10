package typingsSlinky.reactNativeVersionCheck

import typingsSlinky.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFetchOptions extends js.Object {
  /**
    * isomorphic-fetch options (https://github.github.io/fetch/)
    */
  var fetchOptions: js.UndefOr[RequestInit] = js.native
  /**
    * @default false
    */
  var forceUpdate: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  /**
    * Package name or function that returns promise or value of package name
    */
  var packageName: js.UndefOr[String | js.Function0[String]] = js.native
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String] | String] = js.native
}

object AnonFetchOptions {
  @scala.inline
  def apply(): AnonFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFetchOptions]
  }
  @scala.inline
  implicit class AnonFetchOptionsOps[Self <: AnonFetchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchOptions(value: RequestInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withForceUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageNameFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPackageName(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProvider(value: js.Function0[String] | String): Self = {
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
  }
  
}

