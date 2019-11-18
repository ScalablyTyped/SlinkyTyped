package typingsSlinky.react.reactMod

import slinky.core.TagMod
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: NonNullable[TagMod[Any]] | Null
  /**
    * Tells React whether to “skip” revealing this boundary during the initial load.
    * This API will likely be removed in a future release.
    */
  // NOTE: this is unflagged and is respected even in stable builds
  var unstable_avoidThisFallback: js.UndefOr[Boolean] = js.undefined
}

object SuspenseProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    fallback: NonNullable[TagMod[Any]] = null,
    unstable_avoidThisFallback: js.UndefOr[Boolean] = js.undefined
  ): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(unstable_avoidThisFallback)) __obj.updateDynamic("unstable_avoidThisFallback")(unstable_avoidThisFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseProps]
  }
}

