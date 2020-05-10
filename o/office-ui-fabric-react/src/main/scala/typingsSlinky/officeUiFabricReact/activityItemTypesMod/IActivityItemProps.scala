package typingsSlinky.officeUiFabricReact.activityItemTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActivityItemProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * An element describing the activity that took place. If no activityDescription, activityDescriptionText, or
    * onRenderActivityDescription are included, no description of the activity is shown.
    */
  var activityDescription: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.native
  /**
    * Text describing the activity that occurred and naming the people involved in it.
    * Deprecated, use `activityDescription` instead.
    * @deprecated Use `activityDescription` instead.
    */
  var activityDescriptionText: js.UndefOr[String] = js.native
  /**
    * An element containing an icon shown next to the activity item.
    */
  var activityIcon: js.UndefOr[TagMod[Any]] = js.native
  /**
    * If activityIcon is not set, then the persona props in this array will be used as the icon for this activity item.
    */
  var activityPersonas: js.UndefOr[js.Array[IPersonaSharedProps]] = js.native
  /**
    * Enables/Disables the beacon that radiates
    * from the center of the center of the activity icon. Signals an activity has started.
    * @defaultvalue false
    */
  var animateBeaconSignal: js.UndefOr[Boolean] = js.native
  /**
    * Beacon color one
    */
  var beaconColorOne: js.UndefOr[String] = js.native
  /**
    * Beacon color two
    */
  var beaconColorTwo: js.UndefOr[String] = js.native
  /**
    * Text of comments or \@mention messages.
    * Deprecated, use `comments` instead.
    * @deprecated Use `comments` instead.
    */
  var commentText: js.UndefOr[String] = js.native
  /**
    * An element containing the text of comments or \@mention messages.
    * If no comments, commentText, or onRenderComments are included, no comments are shown.
    */
  var comments: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.native
  /**
    * Indicated if the compact styling should be used.
    */
  var isCompact: js.UndefOr[Boolean] = js.native
  /**
    * A renderer for the description of the current activity.
    */
  var onRenderActivityDescription: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
  /**
    * A renderer that adds the text of a comment below the activity description.
    */
  var onRenderComments: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
  /**
    * A renderer to create the icon next to the activity item.
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
  /**
    * A renderer adds a time stamp. If not included, timeStamp is shown as plain text below the activity.
    */
  var onRenderTimeStamp: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.native
  /**
    * Optional styling for the elements within the Activity Item.
    */
  var styles: js.UndefOr[IActivityItemStyles] = js.native
  /**
    * Element shown as a timestamp on this activity. If not included, no timestamp is shown.
    */
  var timeStamp: js.UndefOr[String | js.Array[TagMod[Any]] | TagMod[Any]] = js.native
}

object IActivityItemProps {
  @scala.inline
  def apply(): IActivityItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActivityItemProps]
  }
  @scala.inline
  implicit class IActivityItemPropsOps[Self <: IActivityItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityDescriptionReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityDescription(value: js.Array[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityDescriptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDescriptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDescriptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDescriptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityPersonas(value: js.Array[IPersonaSharedProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityPersonas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityPersonas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityPersonas")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateBeaconSignal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateBeaconSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateBeaconSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateBeaconSignal")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconColorOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconColorOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorOne")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconColorTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconColorTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorTwo")(js.undefined)
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
    def withCommentsReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompact")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderActivityDescription(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderActivityDescription")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderActivityDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderActivityDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderComments(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderComments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderComments")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderIcon(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderIcon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderTimeStamp(
      value: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTimeStamp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: IActivityItemStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStampReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: String | js.Array[TagMod[Any]] | TagMod[Any]): Self = {
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

