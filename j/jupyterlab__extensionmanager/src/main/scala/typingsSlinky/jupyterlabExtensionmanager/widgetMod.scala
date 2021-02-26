package typingsSlinky.jupyterlabExtensionmanager

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabApputils.mod.VDomRenderer
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.installed
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.searchResult
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typingsSlinky.jupyterlabExtensionmanager.modelMod.Action
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import typingsSlinky.jupyterlabExtensionmanager.modelMod.ListModel
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IState
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/widget", "CollapsibleSection")
  @js.native
  class CollapsibleSection protected ()
    extends Component[IProperties, IState, js.Any] {
    def this(props: IProperties) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCollapsibleSection(nextProps: IProperties): Unit = js.native
    
    /**
      * Handler for search input changes.
      */
    def handleCollapse(): Unit = js.native
  }
  object CollapsibleSection {
    
    /**
      * React properties for collapsible section component.
      */
    @js.native
    trait IProperties extends StObject {
      
      /**
        * If true, the section will be collapsed and will not respond
        * to open nor close actions.
        */
      var disabled: js.UndefOr[Boolean] = js.native
      
      /**
        * If given, this will be diplayed instead of the children.
        */
      var errorMessage: js.UndefOr[String | Null] = js.native
      
      /**
        * If true, the section will be opened if not disabled.
        */
      var forceOpen: js.UndefOr[Boolean] = js.native
      
      /**
        * The header string for section list.
        */
      var header: String = js.native
      
      /**
        * Any additional elements to add to the header.
        */
      var headerElements: js.UndefOr[ReactElement] = js.native
      
      /**
        * Whether the view will be expanded or collapsed initially, defaults to open.
        */
      var isOpen: js.UndefOr[Boolean] = js.native
      
      /**
        * Handle collapse event.
        */
      var onCollapse: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
    }
    object IProperties {
      
      @scala.inline
      def apply(header: String): IProperties = {
        val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProperties]
      }
      
      @scala.inline
      implicit class IPropertiesMutableBuilder[Self <: IProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
        
        @scala.inline
        def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
        
        @scala.inline
        def setForceOpen(value: Boolean): Self = StObject.set(x, "forceOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceOpenUndefined: Self = StObject.set(x, "forceOpen", js.undefined)
        
        @scala.inline
        def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderElements(value: ReactElement): Self = StObject.set(x, "headerElements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderElementsReactElement(value: ReactElement): Self = StObject.set(x, "headerElements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderElementsUndefined: Self = StObject.set(x, "headerElements", js.undefined)
        
        @scala.inline
        def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
        
        @scala.inline
        def setOnCollapse(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      }
    }
    
    /**
      * React state for collapsible section component.
      */
    @js.native
    trait IState extends StObject {
      
      /**
        * Whether the section is expanded or collapsed.
        */
      var isOpen: Boolean = js.native
    }
    object IState {
      
      @scala.inline
      def apply(isOpen: Boolean): IState = {
        val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
        __obj.asInstanceOf[IState]
      }
      
      @scala.inline
      implicit class IStateMutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/extensionmanager/lib/widget", "ExtensionView")
  @js.native
  class ExtensionView protected () extends VDomRenderer[ListModel] {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
    
    var _forceOpen: js.Any = js.native
    
    var _settings: js.Any = js.native
    
    /**
      * Toggle the focused modifier based on the input node focus state.
      */
    var _toggleFocused: js.Any = js.native
    
    /**
      * Handle the DOM events for the command palette.
      *
      * @param event - The DOM event sent to the command palette.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the command palette's DOM node.
      * It should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The search input node.
      */
    def inputNode: HTMLInputElement = js.native
    
    /**
      * Callback handler for when the user wants to perform an action on an extension.
      *
      * @param action The action to perform.
      * @param entry The entry to perform the action on.
      */
    def onAction(action: Action, entry: IEntry): js.Promise[Unit] = js.native
    
    /**
      * Callback handler for the user changes the page of the search result pagination.
      *
      * @param value The pagination page number.
      */
    def onPage(value: Double): Unit = js.native
    
    /**
      * Callback handler for the user specifies a new search query.
      *
      * @param value The new query.
      */
    def onSearch(value: String): Unit = js.native
  }
  
  object ListView {
    
    @JSImport("@jupyterlab/extensionmanager/lib/widget", "ListView")
    @js.native
    def apply(props: typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties): ReactElement = js.native
    
    @js.native
    trait IProperties extends StObject {
      
      /**
        * The extension entries to display.
        */
      var entries: js.Array[IEntry] = js.native
      
      /**
        * The list mode to apply.
        */
      var listMode: black | white | default | invalid = js.native
      
      /**
        * The number of pages that can be viewed via pagination.
        */
      var numPages: Double = js.native
      
      /**
        * The callback to use for changing the page
        */
      def onPage(page: Double): Unit = js.native
      
      /**
        * Callback to use for performing an action on an entry.
        */
      def performAction(action: Action, entry: IEntry): Unit = js.native
      
      /**
        * The requested view type.
        */
      var viewType: installed | searchResult = js.native
    }
    object IProperties {
      
      @scala.inline
      def apply(
        entries: js.Array[IEntry],
        listMode: black | white | default | invalid,
        numPages: Double,
        onPage: Double => Unit,
        performAction: (Action, IEntry) => Unit,
        viewType: installed | searchResult
      ): typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties = {
        val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties]
      }
      
      @scala.inline
      implicit class IPropertiesMutableBuilder[Self <: typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEntries(value: js.Array[IEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntriesVarargs(value: IEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
        
        @scala.inline
        def setListMode(value: black | white | default | invalid): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPage(value: Double => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPerformAction(value: (Action, IEntry) => Unit): Self = StObject.set(x, "performAction", js.Any.fromFunction2(value))
        
        @scala.inline
        def setViewType(value: installed | searchResult): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
  @js.native
  class SearchBar protected ()
    extends Component[
          typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties, 
          typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IState, 
          js.Any
        ] {
    def this(props: typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties) = this()
    
    /**
      * Handler for search input changes.
      */
    def handleChange(e: SyntheticEvent[EventTarget with HTMLElement, Event]): Unit = js.native
  }
  object SearchBar {
    
    /**
      * React properties for search bar component.
      */
    @js.native
    trait IProperties extends StObject {
      
      var disabled: Boolean = js.native
      
      /**
        * The placeholder string to use in the search bar input field when empty.
        */
      var placeholder: String = js.native
      
      var settings: ISettings = js.native
    }
    object IProperties {
      
      @scala.inline
      def apply(disabled: Boolean, placeholder: String, settings: ISettings): typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties = {
        val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties]
      }
      
      @scala.inline
      implicit class IPropertiesMutableBuilder[Self <: typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSettings(value: ISettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * React state for search bar component.
      */
    @js.native
    trait IState extends StObject {
      
      /**
        * The value of the search bar input field.
        */
      var value: String = js.native
    }
    object IState {
      
      @scala.inline
      def apply(value: String): typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IState = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IState]
      }
      
      @scala.inline
      implicit class IStateMutableBuilder[Self <: typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object ListEntry {
    
    @js.native
    trait IProperties extends StObject {
      
      /**
        * The entry to visualize.
        */
      var entry: IEntry = js.native
      
      /**
        * The list mode to apply.
        */
      var listMode: black | white | default | invalid = js.native
      
      /**
        * Callback to use for performing an action on the entry.
        */
      def performAction(action: Action, entry: IEntry): Unit = js.native
      
      /**
        * The requested view type.
        */
      var viewType: installed | searchResult = js.native
    }
    object IProperties {
      
      @scala.inline
      def apply(
        entry: IEntry,
        listMode: black | white | default | invalid,
        performAction: (Action, IEntry) => Unit,
        viewType: installed | searchResult
      ): typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListEntry.IProperties = {
        val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListEntry.IProperties]
      }
      
      @scala.inline
      implicit class IPropertiesMutableBuilder[Self <: typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListEntry.IProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEntry(value: IEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListMode(value: black | white | default | invalid): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerformAction(value: (Action, IEntry) => Unit): Self = StObject.set(x, "performAction", js.Any.fromFunction2(value))
        
        @scala.inline
        def setViewType(value: installed | searchResult): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      }
    }
  }
}
