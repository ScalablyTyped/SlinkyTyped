package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedConfiguration extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfiguration". */
  var kind: js.UndefOr[String] = js.native
  /** The set of managed properties for this configuration. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.native
  /** The ID of the product that the managed configuration is for, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.native
}

object ManagedConfiguration {
  @scala.inline
  def apply(): ManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfiguration]
  }
  @scala.inline
  implicit class ManagedConfigurationOps[Self <: ManagedConfiguration] (val x: Self) extends AnyVal {
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
    def withManagedProperty(value: js.Array[ManagedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedProperty")(js.undefined)
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
  }
  
}

