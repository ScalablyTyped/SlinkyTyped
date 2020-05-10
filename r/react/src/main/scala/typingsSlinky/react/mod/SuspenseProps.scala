package typingsSlinky.react.mod

import slinky.core.TagMod
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspenseProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: NonNullable[TagMod[Any]] | Null = js.native
  /**
    * Tells React whether to “skip” revealing this boundary during the initial load.
    * This API will likely be removed in a future release.
    */
  // NOTE: this is unflagged and is respected even in stable builds
  var unstable_avoidThisFallback: js.UndefOr[Boolean] = js.native
}

object SuspenseProps {
  @scala.inline
  def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseProps]
  }
  @scala.inline
  implicit class SuspensePropsOps[Self <: SuspenseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: slinky.core.facade.ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: NonNullable[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(null)
        ret
    }
    @scala.inline
    def withUnstable_avoidThisFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstable_avoidThisFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstable_avoidThisFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstable_avoidThisFallback")(js.undefined)
        ret
    }
  }
  
}

