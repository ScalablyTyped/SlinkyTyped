package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultClickThroughEventTagProperties extends js.Object {
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.native
}

object DefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
  @scala.inline
  implicit class DefaultClickThroughEventTagPropertiesOps[Self <: DefaultClickThroughEventTagProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultClickThroughEventTagId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClickThroughEventTagId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagId")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideInheritedEventTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedEventTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideInheritedEventTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedEventTag")(js.undefined)
        ret
    }
  }
  
}

