package typingsSlinky.appBuilderLib.anon

import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var provider: PublishProvider
  var publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
  var updaterCacheDirName: String
}

object Provider {
  @scala.inline
  def apply(
    provider: PublishProvider,
    updaterCacheDirName: String,
    publishAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    publisherName: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAutoUpdate)) __obj.updateDynamic("publishAutoUpdate")(publishAutoUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

