package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickThroughUrlSuffixProperties extends js.Object {
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.native
}

object ClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(): ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickThroughUrlSuffixProperties]
  }
  @scala.inline
  implicit class ClickThroughUrlSuffixPropertiesOps[Self <: ClickThroughUrlSuffixProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThroughUrlSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrlSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideInheritedSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideInheritedSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedSuffix")(js.undefined)
        ret
    }
  }
  
}

