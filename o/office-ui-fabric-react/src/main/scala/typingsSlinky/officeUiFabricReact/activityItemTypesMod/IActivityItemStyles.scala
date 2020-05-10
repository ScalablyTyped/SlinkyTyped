package typingsSlinky.officeUiFabricReact.activityItemTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActivityItemStyles extends js.Object {
  /**
    * Styles applied to the main container of the activity's description.
    */
  var activityContent: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the persona of the user that did this activity.
    */
  var activityPersona: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the activity's description.
    */
  var activityText: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the icon indicating the type of the activity. Only shown when personas are unavailable.
    */
  var activityTypeIcon: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the text of comments.
    */
  var commentText: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to personas when two users are involved in a single activity.
    */
  var doublePersona: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to main text container in the compact variant.
    */
  var isCompactContent: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to personas and icons in the compact variant.
    */
  var isCompactIcon: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to personas in the compact variant.
    */
  var isCompactPersona: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to a wrapper around personas in the compact variant.
    */
  var isCompactPersonaContainer: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to root in the compact variant.
    */
  var isCompactRoot: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the timestamp in compact mode.
    * This can occur if a host overrides the render behavior to force the timestamp to render.
    */
  var isCompactTimeStamp: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the container of the persona image or activity type icon.
    */
  var personaContainer: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the root activity item container.
    */
  var pulsingBeacon: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the root activity item container.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Styles applied to the timestamp at the end of each activity item.
    */
  var timeStamp: js.UndefOr[IStyle] = js.native
}

object IActivityItemStyles {
  @scala.inline
  def apply(): IActivityItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActivityItemStyles]
  }
  @scala.inline
  implicit class IActivityItemStylesOps[Self <: IActivityItemStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityContent(value: IStyle): Self = {
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
    def withActivityContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityContent")(null)
        ret
    }
    @scala.inline
    def withActivityPersona(value: IStyle): Self = {
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
    def withActivityPersonaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityPersona")(null)
        ret
    }
    @scala.inline
    def withActivityText(value: IStyle): Self = {
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
    def withActivityTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityText")(null)
        ret
    }
    @scala.inline
    def withActivityTypeIcon(value: IStyle): Self = {
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
    def withActivityTypeIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTypeIcon")(null)
        ret
    }
    @scala.inline
    def withCommentText(value: IStyle): Self = {
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
    def withCommentTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentText")(null)
        ret
    }
    @scala.inline
    def withDoublePersona(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doublePersona")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoublePersona: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doublePersona")(js.undefined)
        ret
    }
    @scala.inline
    def withDoublePersonaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doublePersona")(null)
        ret
    }
    @scala.inline
    def withIsCompactContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactContent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompactContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactContent")(null)
        ret
    }
    @scala.inline
    def withIsCompactIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompactIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactIcon")(null)
        ret
    }
    @scala.inline
    def withIsCompactPersona(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactPersona")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactPersona: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactPersona")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompactPersonaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactPersona")(null)
        ret
    }
    @scala.inline
    def withIsCompactPersonaContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactPersonaContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactPersonaContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactPersonaContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompactPersonaContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactPersonaContainer")(null)
        ret
    }
    @scala.inline
    def withIsCompactRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompactRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactRoot")(null)
        ret
    }
    @scala.inline
    def withIsCompactTimeStamp(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompactTimeStampNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactTimeStamp")(null)
        ret
    }
    @scala.inline
    def withPersonaContainer(value: IStyle): Self = {
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
    def withPersonaContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaContainer")(null)
        ret
    }
    @scala.inline
    def withPulsingBeacon(value: IStyle): Self = {
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
    def withPulsingBeaconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulsingBeacon")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
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
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withTimeStamp(value: IStyle): Self = {
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
    @scala.inline
    def withTimeStampNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(null)
        ret
    }
  }
  
}

