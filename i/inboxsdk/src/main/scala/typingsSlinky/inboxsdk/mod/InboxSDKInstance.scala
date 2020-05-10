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

@js.native
trait InboxSDKInstance extends js.Object {
  var ButterBar: ButterBarInstance = js.native
  var Compose: ComposeInstance = js.native
  var Conversations: ConversationsInstance = js.native
  var Global: GlobalInstance = js.native
  var Keyboard: KeyboardInstance = js.native
  var Lists: ListsInstance = js.native
  var NavMenu: NavMenuInstance = js.native
  var Router: RouterInstance = js.native
  var Search: SearchInstance = js.native
  var Toolbars: ToolbarsInstance = js.native
  var User: UserInstance = js.native
  var Widgets: WidgetsInstance = js.native
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
  @scala.inline
  implicit class InboxSDKInstanceOps[Self <: InboxSDKInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButterBar(value: ButterBarInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButterBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompose(value: ComposeInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversations(value: ConversationsInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conversations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: GlobalInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboard(value: KeyboardInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLists(value: ListsInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavMenu(value: NavMenuInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: RouterInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: SearchInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbars(value: ToolbarsInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: UserInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgets(value: WidgetsInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Widgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

