package typingsSlinky.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyInfo extends js.Object {
  var installedVersion: String | Null = js.native
  var isInstalled: Boolean | Null = js.native
  var isValid: Boolean | Null = js.native
  var pkgPath: String = js.native
  var supportedRange: String | Null = js.native
}

object DependencyInfo {
  @scala.inline
  def apply(pkgPath: String): DependencyInfo = {
    val __obj = js.Dynamic.literal(pkgPath = pkgPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyInfo]
  }
  @scala.inline
  implicit class DependencyInfoOps[Self <: DependencyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPkgPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkgPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalledVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalledVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedVersion")(null)
        ret
    }
    @scala.inline
    def withIsInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInstalledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInstalled")(null)
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(null)
        ret
    }
    @scala.inline
    def withSupportedRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedRangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedRange")(null)
        ret
    }
  }
  
}

