package typingsSlinky.gitSemverTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * What package should lerna style tags be listed for, e.g., `foo-package`.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /**
    * Extract lerna style tags (`foo-package@2.0.0`) from the git history, rather
    * than `v1.0.0` format.
    */
  var lernaTags: js.UndefOr[Boolean] = js.native
  /**
    * Specify a prefix for the git tag to be ignored from the semver checks.
    */
  var tagPrefix: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def withLernaTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lernaTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLernaTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lernaTags")(js.undefined)
        ret
    }
    @scala.inline
    def withTagPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(js.undefined)
        ret
    }
  }
  
}

