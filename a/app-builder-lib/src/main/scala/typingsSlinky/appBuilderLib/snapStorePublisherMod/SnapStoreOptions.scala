package typingsSlinky.appBuilderLib.snapStorePublisherMod

import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapStoreOptions extends PublishConfiguration {
  /**
    * The list of channels the snap would be released.
    * @default ["edge"]
    */
  val channels: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}

object SnapStoreOptions {
  @scala.inline
  def apply(
    provider: PublishProvider,
    channels: js.UndefOr[Null | String | js.Array[String]] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): SnapStoreOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapStoreOptions]
  }
}

