package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MkdirOptions extends js.Object {
  // iOS only
  var NSFileProtectionKey: js.UndefOr[String] = js.native
  var NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.native
}

object MkdirOptions {
  @scala.inline
  def apply(): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MkdirOptions]
  }
  @scala.inline
  implicit class MkdirOptionsOps[Self <: MkdirOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNSFileProtectionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NSFileProtectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNSFileProtectionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NSFileProtectionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNSURLIsExcludedFromBackupKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NSURLIsExcludedFromBackupKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNSURLIsExcludedFromBackupKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NSURLIsExcludedFromBackupKey")(js.undefined)
        ret
    }
  }
  
}

