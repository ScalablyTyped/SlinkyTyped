package typingsSlinky.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetainDirtyFlags
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.native
  var throttledSaves: js.UndefOr[Boolean] = js.native
}

object RetainDirtyFlags {
  @scala.inline
  def apply(): RetainDirtyFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetainDirtyFlags]
  }
  @scala.inline
  implicit class RetainDirtyFlagsOps[Self <: RetainDirtyFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetainDirtyFlags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainDirtyFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainDirtyFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainDirtyFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottledSaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottledSaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(js.undefined)
        ret
    }
  }
  
}

