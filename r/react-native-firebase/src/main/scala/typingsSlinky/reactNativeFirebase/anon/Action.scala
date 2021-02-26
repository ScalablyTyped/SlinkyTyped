package typingsSlinky.reactNativeFirebase.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
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
object Action {
  
  @scala.inline
  def apply(
    Action: Instantiable3[
      /* action */ String, 
      /* icon */ String, 
      /* title */ String, 
      typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
    ],
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
  ): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], BadgeIconType = BadgeIconType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ChannelGroup = ChannelGroup.asInstanceOf[js.Any], Defaults = Defaults.asInstanceOf[js.Any], GroupAlert = GroupAlert.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], RemoteInput = RemoteInput.asInstanceOf[js.Any], SemanticAction = SemanticAction.asInstanceOf[js.Any], Visibility = Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(
      value: Instantiable3[
          /* action */ String, 
          /* icon */ String, 
          /* title */ String, 
          typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
        ]
    ): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeIconType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ js.Any
    ): Self = StObject.set(x, "BadgeIconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Category): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(
      value: Instantiable3[/* channelId */ String, /* name */ String, /* importance */ Importance, Channel]
    ): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroup(value: Instantiable2[/* groupId */ String, /* name */ String, ChannelGroup]): Self = StObject.set(x, "ChannelGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ js.Any
    ): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupAlert(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ js.Any
    ): Self = StObject.set(x, "GroupAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportance(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ js.Any
    ): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ js.Any
    ): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteInput(value: Instantiable1[/* resultKey */ String, RemoteInput]): Self = StObject.set(x, "RemoteInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAction(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ js.Any
    ): Self = StObject.set(x, "SemanticAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ js.Any
    ): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
  }
}
