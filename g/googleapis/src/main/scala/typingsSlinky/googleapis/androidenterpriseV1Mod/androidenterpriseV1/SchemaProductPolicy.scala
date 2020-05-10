package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The policy for a product.
  */
@js.native
trait SchemaProductPolicy extends js.Object {
  /**
    * The auto-install policy for the product.
    */
  var autoInstallPolicy: js.UndefOr[SchemaAutoInstallPolicy] = js.native
  /**
    * The managed configuration for the product.
    */
  var managedConfiguration: js.UndefOr[SchemaManagedConfiguration] = js.native
  /**
    * The ID of the product. For example,
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Grants the device visibility to the specified product release track(s),
    * identified by trackIds. The list of release tracks of a product can be
    * obtained by calling Products.Get.
    */
  var trackIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String]] = js.native
}

object SchemaProductPolicy {
  @scala.inline
  def apply(): SchemaProductPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPolicy]
  }
  @scala.inline
  implicit class SchemaProductPolicyOps[Self <: SchemaProductPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoInstallPolicy(value: SchemaAutoInstallPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInstallPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedConfiguration(value: SchemaManagedConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(js.undefined)
        ret
    }
  }
  
}

