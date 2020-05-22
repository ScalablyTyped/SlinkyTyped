package typingsSlinky.inboxsdk.mod

import typingsSlinky.inboxsdk.mod.ButterBar.ButterBarInstance
import typingsSlinky.inboxsdk.mod.Compose.ComposeInstance
import typingsSlinky.inboxsdk.mod.Conversations.ConversationsInstance
import typingsSlinky.inboxsdk.mod.Global.GlobalInstance
import typingsSlinky.inboxsdk.mod.Keyboard.KeyboardInstance
import typingsSlinky.inboxsdk.mod.Lists.ListsInstance
import typingsSlinky.inboxsdk.mod.NavMenu.NavMenuInstance
import typingsSlinky.inboxsdk.mod.Router.RouterInstance
import typingsSlinky.inboxsdk.mod.Search.SearchInstance
import typingsSlinky.inboxsdk.mod.Toolbars.ToolbarsInstance
import typingsSlinky.inboxsdk.mod.User.UserInstance
import typingsSlinky.inboxsdk.mod.Widgets.WidgetsInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboxSDKInstance extends js.Object {
  var ButterBar: ButterBarInstance
  var Compose: ComposeInstance
  var Conversations: ConversationsInstance
  var Global: GlobalInstance
  var Keyboard: KeyboardInstance
  var Lists: ListsInstance
  var NavMenu: NavMenuInstance
  var Router: RouterInstance
  var Search: SearchInstance
  var Toolbars: ToolbarsInstance
  var User: UserInstance
  var Widgets: WidgetsInstance
}

object InboxSDKInstance {
  @scala.inline
  def apply(
    ButterBar: ButterBarInstance,
    Compose: ComposeInstance,
    Conversations: ConversationsInstance,
    Global: GlobalInstance,
    Keyboard: KeyboardInstance,
    Lists: ListsInstance,
    NavMenu: NavMenuInstance,
    Router: RouterInstance,
    Search: SearchInstance,
    Toolbars: ToolbarsInstance,
    User: UserInstance,
    Widgets: WidgetsInstance
  ): InboxSDKInstance = {
    val __obj = js.Dynamic.literal(ButterBar = ButterBar.asInstanceOf[js.Any], Compose = Compose.asInstanceOf[js.Any], Conversations = Conversations.asInstanceOf[js.Any], Global = Global.asInstanceOf[js.Any], Keyboard = Keyboard.asInstanceOf[js.Any], Lists = Lists.asInstanceOf[js.Any], NavMenu = NavMenu.asInstanceOf[js.Any], Router = Router.asInstanceOf[js.Any], Search = Search.asInstanceOf[js.Any], Toolbars = Toolbars.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Widgets = Widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboxSDKInstance]
  }
}

