package typingsSlinky.inboxsdk.mod

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import typingsSlinky.inboxsdk.mod.Common.DropdownView
import typingsSlinky.inboxsdk.mod.Conversations.ThreadView
import typingsSlinky.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typingsSlinky.inboxsdk.mod.Lists.ThreadRowView
import typingsSlinky.inboxsdk.mod.Router.RouteView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbars {
  
  @js.native
  trait AppToolbarButtonDescriptor extends StObject {
    
    var arrowColor: js.UndefOr[String] = js.native
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: String = js.native
    
    def onClick(event: AppToolbarButtonEvent): Unit = js.native
    
    var title: String = js.native
    
    var titleClass: js.UndefOr[String] = js.native
  }
  object AppToolbarButtonDescriptor {
    
    @scala.inline
    def apply(iconUrl: String, onClick: AppToolbarButtonEvent => Unit, title: String): AppToolbarButtonDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppToolbarButtonDescriptor]
    }
    
    @scala.inline
    implicit class AppToolbarButtonDescriptorMutableBuilder[Self <: AppToolbarButtonDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: AppToolbarButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleClass(value: String): Self = StObject.set(x, "titleClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleClassUndefined: Self = StObject.set(x, "titleClass", js.undefined)
    }
  }
  
  @js.native
  trait AppToolbarButtonEvent extends StObject {
    
    var dropdown: DropdownView = js.native
  }
  object AppToolbarButtonEvent {
    
    @scala.inline
    def apply(dropdown: DropdownView): AppToolbarButtonEvent = {
      val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppToolbarButtonEvent]
    }
    
    @scala.inline
    implicit class AppToolbarButtonEventMutableBuilder[Self <: AppToolbarButtonEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppToolbarButtonView extends StObject {
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
    
    def open(): Unit = js.native
    
    def remove(): Unit = js.native
  }
  object AppToolbarButtonView {
    
    @scala.inline
    def apply(
      close: () => Unit,
      destroyed: Boolean,
      on: (destroy, js.Function0[Unit]) => Unit,
      open: () => Unit,
      remove: () => Unit
    ): AppToolbarButtonView = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[AppToolbarButtonView]
    }
    
    @scala.inline
    implicit class AppToolbarButtonViewMutableBuilder[Self <: AppToolbarButtonView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LegacyToolbarButtonDescriptor extends StObject {
    
    var hasDropdown: js.UndefOr[Boolean] = js.native
    
    var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.native
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: js.UndefOr[String] = js.native
    
    var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.native
    
    def onClick(event: LegacyToolbarButtonEvent): Unit = js.native
    
    var section: SectionNames = js.native
    
    var title: String = js.native
  }
  object LegacyToolbarButtonDescriptor {
    
    @scala.inline
    def apply(onClick: LegacyToolbarButtonEvent => Unit, section: SectionNames, title: String): LegacyToolbarButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyToolbarButtonDescriptor]
    }
    
    @scala.inline
    implicit class LegacyToolbarButtonDescriptorMutableBuilder[Self <: LegacyToolbarButtonDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
      
      @scala.inline
      def setHideFor(value: /* routeView */ RouteView => Unit): Self = StObject.set(x, "hideFor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setKeyboardShortcutHandle(value: KeyboardShortcutHandle): Self = StObject.set(x, "keyboardShortcutHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShortcutHandleUndefined: Self = StObject.set(x, "keyboardShortcutHandle", js.undefined)
      
      @scala.inline
      def setOnClick(value: LegacyToolbarButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSection(value: SectionNames): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LegacyToolbarButtonEvent extends StObject {
    
    var dropdown: js.UndefOr[DropdownView] = js.native
    
    var selectedThreadRowViews: js.Array[ThreadRowView] = js.native
    
    var threadRowViews: js.Array[ThreadRowView] = js.native
    
    var threadView: ThreadView = js.native
  }
  object LegacyToolbarButtonEvent {
    
    @scala.inline
    def apply(
      selectedThreadRowViews: js.Array[ThreadRowView],
      threadRowViews: js.Array[ThreadRowView],
      threadView: ThreadView
    ): LegacyToolbarButtonEvent = {
      val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], threadRowViews = threadRowViews.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyToolbarButtonEvent]
    }
    
    @scala.inline
    implicit class LegacyToolbarButtonEventMutableBuilder[Self <: LegacyToolbarButtonEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      @scala.inline
      def setSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = StObject.set(x, "selectedThreadRowViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedThreadRowViewsVarargs(value: ThreadRowView*): Self = StObject.set(x, "selectedThreadRowViews", js.Array(value :_*))
      
      @scala.inline
      def setThreadRowViews(value: js.Array[ThreadRowView]): Self = StObject.set(x, "threadRowViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadRowViewsVarargs(value: ThreadRowView*): Self = StObject.set(x, "threadRowViews", js.Array(value :_*))
      
      @scala.inline
      def setThreadView(value: ThreadView): Self = StObject.set(x, "threadView", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.inboxsdk.inboxsdkStrings.INBOX_STATE
    - typingsSlinky.inboxsdk.inboxsdkStrings.METADATA_STATE
    - typingsSlinky.inboxsdk.inboxsdkStrings.OTHER
  */
  trait SectionNames extends StObject
  object SectionNames {
    
    @scala.inline
    def INBOX_STATE: typingsSlinky.inboxsdk.inboxsdkStrings.INBOX_STATE = "INBOX_STATE".asInstanceOf[typingsSlinky.inboxsdk.inboxsdkStrings.INBOX_STATE]
    
    @scala.inline
    def METADATA_STATE: typingsSlinky.inboxsdk.inboxsdkStrings.METADATA_STATE = "METADATA_STATE".asInstanceOf[typingsSlinky.inboxsdk.inboxsdkStrings.METADATA_STATE]
    
    @scala.inline
    def OTHER: typingsSlinky.inboxsdk.inboxsdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.inboxsdk.inboxsdkStrings.OTHER]
  }
  
  @js.native
  trait ToolbarButtonDescriptor extends StObject {
    
    var hasDropdown: js.UndefOr[Boolean] = js.native
    
    var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.native
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: js.UndefOr[String] = js.native
    
    var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.native
    
    var listSection: js.UndefOr[SectionNames] = js.native
    
    def onClick(event: ToolbarButtonEvent): Unit = js.native
    
    var orderHint: js.UndefOr[Double] = js.native
    
    var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.native
    
    var threadSection: js.UndefOr[SectionNames] = js.native
    
    var title: String = js.native
  }
  object ToolbarButtonDescriptor {
    
    @scala.inline
    def apply(onClick: ToolbarButtonEvent => Unit, title: String): ToolbarButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarButtonDescriptor]
    }
    
    @scala.inline
    implicit class ToolbarButtonDescriptorMutableBuilder[Self <: ToolbarButtonDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
      
      @scala.inline
      def setHideFor(value: /* routeView */ RouteView => Unit): Self = StObject.set(x, "hideFor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setKeyboardShortcutHandle(value: KeyboardShortcutHandle): Self = StObject.set(x, "keyboardShortcutHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShortcutHandleUndefined: Self = StObject.set(x, "keyboardShortcutHandle", js.undefined)
      
      @scala.inline
      def setListSection(value: SectionNames): Self = StObject.set(x, "listSection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListSectionUndefined: Self = StObject.set(x, "listSection", js.undefined)
      
      @scala.inline
      def setOnClick(value: ToolbarButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      @scala.inline
      def setPositions(value: js.Array[ToolbarButtonPosition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      @scala.inline
      def setPositionsVarargs(value: ToolbarButtonPosition*): Self = StObject.set(x, "positions", js.Array(value :_*))
      
      @scala.inline
      def setThreadSection(value: SectionNames): Self = StObject.set(x, "threadSection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadSectionUndefined: Self = StObject.set(x, "threadSection", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToolbarButtonEvent extends StObject {
    
    var dropdown: js.UndefOr[DropdownView] = js.native
    
    var position: ToolbarButtonPosition = js.native
    
    var selectedThreadRowViews: js.Array[ThreadRowView] = js.native
    
    var selectedThreadViews: js.Array[ThreadView] = js.native
  }
  object ToolbarButtonEvent {
    
    @scala.inline
    def apply(
      position: ToolbarButtonPosition,
      selectedThreadRowViews: js.Array[ThreadRowView],
      selectedThreadViews: js.Array[ThreadView]
    ): ToolbarButtonEvent = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], selectedThreadViews = selectedThreadViews.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarButtonEvent]
    }
    
    @scala.inline
    implicit class ToolbarButtonEventMutableBuilder[Self <: ToolbarButtonEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      @scala.inline
      def setPosition(value: ToolbarButtonPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = StObject.set(x, "selectedThreadRowViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedThreadRowViewsVarargs(value: ThreadRowView*): Self = StObject.set(x, "selectedThreadRowViews", js.Array(value :_*))
      
      @scala.inline
      def setSelectedThreadViews(value: js.Array[ThreadView]): Self = StObject.set(x, "selectedThreadViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedThreadViewsVarargs(value: ThreadView*): Self = StObject.set(x, "selectedThreadViews", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.inboxsdk.inboxsdkStrings.THREAD
    - typingsSlinky.inboxsdk.inboxsdkStrings.ROW
    - typingsSlinky.inboxsdk.inboxsdkStrings.LIST
  */
  trait ToolbarButtonPosition extends StObject
  object ToolbarButtonPosition {
    
    @scala.inline
    def LIST: typingsSlinky.inboxsdk.inboxsdkStrings.LIST = "LIST".asInstanceOf[typingsSlinky.inboxsdk.inboxsdkStrings.LIST]
    
    @scala.inline
    def ROW: typingsSlinky.inboxsdk.inboxsdkStrings.ROW = "ROW".asInstanceOf[typingsSlinky.inboxsdk.inboxsdkStrings.ROW]
    
    @scala.inline
    def THREAD: typingsSlinky.inboxsdk.inboxsdkStrings.THREAD = "THREAD".asInstanceOf[typingsSlinky.inboxsdk.inboxsdkStrings.THREAD]
  }
  
  @js.native
  trait ToolbarsInstance extends StObject {
    
    def addToolbarButtonForApp(appToolbarButtonDescriptor: AppToolbarButtonDescriptor): AppToolbarButtonView = js.native
    
    def registerThreadButton(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[Unit] = js.native
    
    /**
      * @deprecated. use registerThreadButton
      * @param toolbarButtonDescriptor
      */
    def registerToolbarButtonForList(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit] = js.native
    
    /**
      * @deprecated. use registerThreadButton
      * @param toolbarButtonDescriptor
      */
    def registerToolbarButtonForThreadView(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit] = js.native
  }
  object ToolbarsInstance {
    
    @scala.inline
    def apply(
      addToolbarButtonForApp: AppToolbarButtonDescriptor => AppToolbarButtonView,
      registerThreadButton: ToolbarButtonDescriptor => js.Function0[Unit],
      registerToolbarButtonForList: LegacyToolbarButtonDescriptor => js.Function0[Unit],
      registerToolbarButtonForThreadView: LegacyToolbarButtonDescriptor => js.Function0[Unit]
    ): ToolbarsInstance = {
      val __obj = js.Dynamic.literal(addToolbarButtonForApp = js.Any.fromFunction1(addToolbarButtonForApp), registerThreadButton = js.Any.fromFunction1(registerThreadButton), registerToolbarButtonForList = js.Any.fromFunction1(registerToolbarButtonForList), registerToolbarButtonForThreadView = js.Any.fromFunction1(registerToolbarButtonForThreadView))
      __obj.asInstanceOf[ToolbarsInstance]
    }
    
    @scala.inline
    implicit class ToolbarsInstanceMutableBuilder[Self <: ToolbarsInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddToolbarButtonForApp(value: AppToolbarButtonDescriptor => AppToolbarButtonView): Self = StObject.set(x, "addToolbarButtonForApp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterThreadButton(value: ToolbarButtonDescriptor => js.Function0[Unit]): Self = StObject.set(x, "registerThreadButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterToolbarButtonForList(value: LegacyToolbarButtonDescriptor => js.Function0[Unit]): Self = StObject.set(x, "registerToolbarButtonForList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterToolbarButtonForThreadView(value: LegacyToolbarButtonDescriptor => js.Function0[Unit]): Self = StObject.set(x, "registerToolbarButtonForThreadView", js.Any.fromFunction1(value))
    }
  }
}
