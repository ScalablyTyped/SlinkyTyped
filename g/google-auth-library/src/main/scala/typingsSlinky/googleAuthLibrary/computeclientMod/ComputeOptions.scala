package typingsSlinky.googleAuthLibrary.computeclientMod

import typingsSlinky.googleAuthLibrary.oauth2clientMod.RefreshOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeOptions extends RefreshOptions {
  /**
    * The scopes that will be requested when acquiring service account
    * credentials. Only applicable to modern App Engine and Cloud Function
    * runtimes as of March 2019.
    */
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The service account email to use, or 'default'. A Compute Engine instance
    * may have multiple service accounts.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}

object ComputeOptions {
  @scala.inline
  def apply(): ComputeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeOptions]
  }
  @scala.inline
  implicit class ComputeOptionsOps[Self <: ComputeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
        ret
    }
  }
  
}

