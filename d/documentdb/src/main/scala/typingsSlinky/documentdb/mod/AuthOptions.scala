package typingsSlinky.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /** The authorization master key to use to create the client. */
  var masterKey: js.UndefOr[String] = js.native
  /** An array of {@link Permission} objects. */
  var permissionFeed: js.UndefOr[js.Array[Permission]] = js.native
  /** An object that contains resources tokens. Keys for the object are resource Ids and values are the resource tokens. */
  var resourceTokens: js.UndefOr[StringDictionary[String]] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasterKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionFeed(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionFeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionFeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionFeed")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTokens(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTokens")(js.undefined)
        ret
    }
  }
  
}

