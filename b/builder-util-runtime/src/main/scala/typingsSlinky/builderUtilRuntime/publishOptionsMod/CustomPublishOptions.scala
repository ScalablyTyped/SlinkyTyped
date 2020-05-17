package typingsSlinky.builderUtilRuntime.publishOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPublishOptions
  extends AllPublishOptions
     with PublishConfiguration
     with /* index */ StringDictionary[js.Any]

object CustomPublishOptions {
  @scala.inline
  def apply(provider: PublishProvider): CustomPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPublishOptions]
  }
}

