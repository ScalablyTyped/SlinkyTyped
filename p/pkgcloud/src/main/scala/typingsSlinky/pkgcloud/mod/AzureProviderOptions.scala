package typingsSlinky.pkgcloud.mod

import typingsSlinky.pkgcloud.pkgcloudStrings.azure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureProviderOptions extends js.Object {
  var location: js.UndefOr[String] = js.native
  var provider: azure = js.native
  var storageAccessKey: String = js.native
  var storageAccount: String = js.native
}

object AzureProviderOptions {
  @scala.inline
  def apply(provider: azure, storageAccessKey: String, storageAccount: String): AzureProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], storageAccessKey = storageAccessKey.asInstanceOf[js.Any], storageAccount = storageAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureProviderOptions]
  }
  @scala.inline
  implicit class AzureProviderOptionsOps[Self <: AzureProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: azure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

