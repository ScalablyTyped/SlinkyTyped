package typingsSlinky.builderUtilRuntime.publishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishConfiguration extends js.Object {
  /**
    * The provider.
    */
  val provider: PublishProvider = js.native
  /**
    * Whether to publish auto update info files.
    *
    * Auto update relies only on the first provider in the list (you can specify several publishers).
    * Thus, probably, there`s no need to upload the metadata files for the other configured providers. But by default will be uploaded.
    *
    * @default true
    */
  val publishAutoUpdate: js.UndefOr[Boolean] = js.native
  /**
    * @private
    * win-only
    */
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * @private
    * win-only
    */
  val updaterCacheDirName: js.UndefOr[String | Null] = js.native
}

object PublishConfiguration {
  @scala.inline
  def apply(provider: PublishProvider): PublishConfiguration = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishConfiguration]
  }
  @scala.inline
  implicit class PublishConfigurationOps[Self <: PublishConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: PublishProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishAutoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishAutoUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(null)
        ret
    }
    @scala.inline
    def withUpdaterCacheDirName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updaterCacheDirName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdaterCacheDirName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updaterCacheDirName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdaterCacheDirNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updaterCacheDirName")(null)
        ret
    }
  }
  
}

