package typingsSlinky.reactNativeVersionCheck.anon

import typingsSlinky.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentVersion extends js.Object {
  /**
    * app's current version from getCurrentVersion()
    */
  var currentVersion: js.UndefOr[String] = js.native
  /**
    * @default Infinity
    */
  var depth: js.UndefOr[Double] = js.native
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
    * app's latest version from getLatestVersion()
    */
  var latestVersion: js.UndefOr[String] = js.native
  /**
    * app's Package Name
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String] | String] = js.native
}

object CurrentVersion {
  @scala.inline
  def apply(): CurrentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentVersion]
  }
  @scala.inline
  implicit class CurrentVersionOps[Self <: CurrentVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
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
    def withLatestVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
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

