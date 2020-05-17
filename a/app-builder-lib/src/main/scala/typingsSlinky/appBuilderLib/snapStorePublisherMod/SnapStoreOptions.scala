package typingsSlinky.appBuilderLib.snapStorePublisherMod

import typingsSlinky.appBuilderLib.coreMod.Publish
import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapStoreOptions
  extends PublishConfiguration
     with Publish {
  /**
    * The list of channels the snap would be released.
    * @default ["edge"]
    */
  val channels: js.UndefOr[String | js.Array[String] | Null] = js.native
}

object SnapStoreOptions {
  @scala.inline
  def apply(provider: PublishProvider): SnapStoreOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapStoreOptions]
  }
  @scala.inline
  implicit class SnapStoreOptionsOps[Self <: SnapStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(null)
        ret
    }
  }
  
}

