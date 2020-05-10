package typingsSlinky.reactNativeFirebase

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var Action: Instantiable3[
    /* action */ String, 
    /* icon */ String, 
    /* title */ String, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
  ] = js.native
  var BadgeIconType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ js.Any = js.native
  var Category: typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category = js.native
  var Channel: Instantiable3[
    /* channelId */ String, 
    /* name */ String, 
    /* importance */ Importance, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
  ] = js.native
  var ChannelGroup: Instantiable2[
    /* groupId */ String, 
    /* name */ String, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
  ] = js.native
  var Defaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ js.Any = js.native
  var GroupAlert: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ js.Any = js.native
  var Importance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ js.Any = js.native
  var Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ js.Any = js.native
  var RemoteInput: Instantiable1[
    /* resultKey */ String, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
  ] = js.native
  var SemanticAction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ js.Any = js.native
  var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ js.Any = js.native
}

object AnonAction {
  @scala.inline
  def apply(
    Action: Instantiable3[/* action */ String, /* icon */ String, /* title */ String, Action],
    BadgeIconType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ js.Any,
    Category: Category,
    Channel: Instantiable3[/* channelId */ String, /* name */ String, /* importance */ Importance, Channel],
    ChannelGroup: Instantiable2[/* groupId */ String, /* name */ String, ChannelGroup],
    Defaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ js.Any,
    GroupAlert: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ js.Any,
    Importance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ js.Any,
    Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ js.Any,
    RemoteInput: Instantiable1[/* resultKey */ String, RemoteInput],
    SemanticAction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ js.Any,
    Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ js.Any
  ): AnonAction = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], BadgeIconType = BadgeIconType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ChannelGroup = ChannelGroup.asInstanceOf[js.Any], Defaults = Defaults.asInstanceOf[js.Any], GroupAlert = GroupAlert.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], RemoteInput = RemoteInput.asInstanceOf[js.Any], SemanticAction = SemanticAction.asInstanceOf[js.Any], Visibility = Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
  @scala.inline
  implicit class AnonActionOps[Self <: AnonAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Instantiable3[/* action */ String, /* icon */ String, /* title */ String, Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadgeIconType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BadgeIconType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(
      value: Instantiable3[/* channelId */ String, /* name */ String, /* importance */ Importance, Channel]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelGroup(value: Instantiable2[/* groupId */ String, /* name */ String, ChannelGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupAlert(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportance(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteInput(value: Instantiable1[/* resultKey */ String, RemoteInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAction(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

