package typingsSlinky.builderUtilRuntime.publishOptionsMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.`private`
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.`public-read`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseS3Options extends PublishConfiguration {
  /**
    * The ACL. Set to `null` to not [add](https://github.com/electron-userland/electron-builder/issues/1822).
    *
    * @default public-read
    */
  val acl: js.UndefOr[`private` | `public-read` | Null] = js.undefined
  /**
    * The update channel.
    * @default latest
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  /**
    * The directory path.
    * @default /
    */
  val path: js.UndefOr[String | Null] = js.undefined
}

object BaseS3Options {
  @scala.inline
  def apply(
    provider: PublishProvider,
    acl: js.UndefOr[Null | `private` | `public-read`] = js.undefined,
    channel: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    updaterCacheDirName: js.UndefOr[Null | String] = js.undefined
  ): BaseS3Options = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(acl)) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (!js.isUndefined(channel)) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (!js.isUndefined(updaterCacheDirName)) __obj.updateDynamic("updaterCacheDirName")(updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseS3Options]
  }
}

