package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification for a token used to generate iframes. The token specifies
  * what data the admin is allowed to modify and the URI the iframe is allowed
  * to communiate with.
  */
@js.native
trait SchemaAdministratorWebTokenSpec extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#administratorWebTokenSpec&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Options for displaying the Managed Configuration page.
    */
  var managedConfigurations: js.UndefOr[SchemaAdministratorWebTokenSpecManagedConfigurations] = js.native
  /**
    * The URI of the parent frame hosting the iframe. To prevent XSS, the
    * iframe may not be hosted at other URIs. This URI must be https.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use PlaySearch.approveApps.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
  /**
    * Options for displaying the managed Play Search apps page.
    */
  var playSearch: js.UndefOr[SchemaAdministratorWebTokenSpecPlaySearch] = js.native
  /**
    * Options for displaying the Private Apps page.
    */
  var privateApps: js.UndefOr[SchemaAdministratorWebTokenSpecPrivateApps] = js.native
  /**
    * Options for displaying the Organize apps page.
    */
  var storeBuilder: js.UndefOr[SchemaAdministratorWebTokenSpecStoreBuilder] = js.native
  /**
    * Options for displaying the Web Apps page.
    */
  var webApps: js.UndefOr[SchemaAdministratorWebTokenSpecWebApps] = js.native
}

object SchemaAdministratorWebTokenSpec {
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpec]
  }
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecOps[Self <: SchemaAdministratorWebTokenSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedConfigurations(value: SchemaAdministratorWebTokenSpecManagedConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
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
    def withPermission(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaySearch(value: SchemaAdministratorWebTokenSpecPlaySearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaySearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateApps(value: SchemaAdministratorWebTokenSpecPrivateApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateApps")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreBuilder(value: SchemaAdministratorWebTokenSpecStoreBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeBuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeBuilder")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApps(value: SchemaAdministratorWebTokenSpecWebApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApps")(js.undefined)
        ret
    }
  }
  
}

