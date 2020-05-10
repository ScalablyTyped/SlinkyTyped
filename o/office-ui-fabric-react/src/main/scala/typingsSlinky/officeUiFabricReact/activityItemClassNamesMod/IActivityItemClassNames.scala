package typingsSlinky.officeUiFabricReact.activityItemClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActivityItemClassNames extends js.Object {
  var activityContent: js.UndefOr[String] = js.native
  var activityPersona: js.UndefOr[String] = js.native
  var activityText: js.UndefOr[String] = js.native
  var activityTypeIcon: js.UndefOr[String] = js.native
  var commentText: js.UndefOr[String] = js.native
  var personaContainer: js.UndefOr[String] = js.native
  var pulsingBeacon: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var timeStamp: js.UndefOr[String] = js.native
}

object IActivityItemClassNames {
  @scala.inline
  def apply(): IActivityItemClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActivityItemClassNames]
  }
  @scala.inline
  implicit class IActivityItemClassNamesOps[Self <: IActivityItemClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityContent")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityPersona(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityPersona")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityPersona: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityPersona")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityText")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTypeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTypeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentText")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonaContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonaContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPulsingBeacon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulsingBeacon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulsingBeacon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulsingBeacon")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.undefined)
        ret
    }
  }
  
}

