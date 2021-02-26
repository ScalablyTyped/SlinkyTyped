package typingsSlinky.chromeApps.chrome

import typingsSlinky.chromeApps.anon.ALL
import typingsSlinky.chromeApps.anon.CHECKBOX
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chromeAppsStrings.AUDIO
import typingsSlinky.chromeApps.chromeAppsStrings.BROWSER_ACTION
import typingsSlinky.chromeApps.chromeAppsStrings.EDITABLE
import typingsSlinky.chromeApps.chromeAppsStrings.FRAME
import typingsSlinky.chromeApps.chromeAppsStrings.IMAGE
import typingsSlinky.chromeApps.chromeAppsStrings.LAUNCHER
import typingsSlinky.chromeApps.chromeAppsStrings.LINK
import typingsSlinky.chromeApps.chromeAppsStrings.NORMAL
import typingsSlinky.chromeApps.chromeAppsStrings.PAGE
import typingsSlinky.chromeApps.chromeAppsStrings.PAGE_ACTION
import typingsSlinky.chromeApps.chromeAppsStrings.RADIO
import typingsSlinky.chromeApps.chromeAppsStrings.SELECTION
import typingsSlinky.chromeApps.chromeAppsStrings.SEPARATOR
import typingsSlinky.chromeApps.chromeAppsStrings.VIDEO
import typingsSlinky.chromeApps.chromeAppsStrings.all__
import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.browser_action_
import typingsSlinky.chromeApps.chromeAppsStrings.checkbox_
import typingsSlinky.chromeApps.chromeAppsStrings.editable_
import typingsSlinky.chromeApps.chromeAppsStrings.frame_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.launcher_
import typingsSlinky.chromeApps.chromeAppsStrings.link_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.page_
import typingsSlinky.chromeApps.chromeAppsStrings.page_action_
import typingsSlinky.chromeApps.chromeAppsStrings.radio_
import typingsSlinky.chromeApps.chromeAppsStrings.selection_
import typingsSlinky.chromeApps.chromeAppsStrings.separator_
import typingsSlinky.chromeApps.chromeAppsStrings.video_
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.contextMenus
///////////////////
// Context Menus //
///////////////////
/**
  * @since Chrome 24.
  * @requires Permissions: 'contextMenus'
  * @description
  * Use the chrome.contextMenus API to add items to Google Chrome's context menu.
  * You can choose what types of objects your context menu additions apply to,
  * such as images, hyperlinks, and pages.
  *
  * Context menu items can appear in any document (or frame within a document),
  * even those with file:// or chrome:// URLs. To control which documents your
  * items can appear in, specify the documentUrlPatterns field when you call the
  * create() or update() method.
  *
  * You can create as many context menu items as you need,
  * but if more than one from your app is visible at once,
  * Google Chrome automatically collapses them into a single parent menu.
  */
object contextMenus {
  
  @js.native
  trait CreateProperties extends StObject {
    
    /**
      * The initial state of a checkbox or radio item:
      * true for selected and false for unselected.
      * Only one radio item can be selected at a time
      * in a given group of radio items.
      **/
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * List of contexts this menu item will appear in.
      * @default ['page'] - Defaults to ['page'] if not specified.
      * @see ContextType
      **/
    var contexts: js.UndefOr[
        js.Array[
          ToStringLiteral[
            ALL, 
            /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
            Exclude[
              /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
            ]
          ]
        ]
      ] = js.native
    
    /**
      * Lets you restrict the item to apply only to documents whose URL
      * matches one of the given patterns. (This applies to frames as well.)
      * For details on the format of a pattern, see Match Patterns.
      **/
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether this context menu item is enabled or disabled.
      * @default true
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The unique ID to assign to this item.
      * Mandatory for event pages.
      * Cannot be the same as another ID for this app.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
      * @param info Information sent when a context menu item is clicked.
      */
    var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.native
    
    /** The ID of a parent menu item; this makes the item a child of a previously added item.  */
    var parentId: js.UndefOr[integer | String] = js.native
    
    /**
      * Similar to documentUrlPatterns,
      * but lets you filter based on the src attribute
      * of img/audio/video tags and the href of anchor tags.
      **/
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The text to be displayed in the item;
      * this is required unless type is 'separator'.
      * When the context is 'selection', you can use
      * %s within the string to show the selected text.
      * For example, if this parameter's value is
      * 'Translate '%s' to Pig Latin' and the user
      * selects the word 'cool', the context menu
      * item for the selection is 'Translate 'cool'
      * to Pig Latin'.
      **/
    var title: js.UndefOr[String] = js.native
    
    /**
      * The type of menu item.
      * @default 'normal' - Defaults to 'normal' if not specified.
      * @see ItemType
      */
    var `type`: js.UndefOr[
        ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          Exclude[
            /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
            normal_ | checkbox_ | radio_ | separator_
          ]
        ]
      ] = js.native
    
    /**
      * Whether the item is visible in the menu.
      * @since Chrome 62.
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CreateProperties {
    
    @scala.inline
    def apply(): CreateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateProperties]
    }
    
    @scala.inline
    implicit class CreatePropertiesMutableBuilder[Self <: CreateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContexts(
        value: js.Array[
              ToStringLiteral[
                ALL, 
                /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                Exclude[
                  /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                  browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
                ]
              ]
            ]
      ): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(
        value: (ToStringLiteral[
              ALL, 
              /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              Exclude[
                /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
              ]
            ])*
      ): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      @scala.inline
      def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnclick(value: /* info */ OnClickData => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      @scala.inline
      def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(
        value: ToStringLiteral[
              CHECKBOX, 
              /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
              Exclude[
                /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
                normal_ | checkbox_ | radio_ | separator_
              ]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.image_
    - typingsSlinky.chromeApps.chromeAppsStrings.video_
    - typingsSlinky.chromeApps.chromeAppsStrings.audio_
  */
  trait MediaType extends StObject
  object MediaType {
    
    @scala.inline
    def audio: audio_ = "audio".asInstanceOf[audio_]
    
    @scala.inline
    def image: image_ = "image".asInstanceOf[image_]
    
    @scala.inline
    def video: video_ = "video".asInstanceOf[video_]
  }
  
  type MenuClickedEvent = Event[js.Function1[/* info */ OnClickData, Unit]]
  
  @js.native
  trait OnClickData extends StObject {
    
    /**
      * A flag indicating the state of a checkbox or radio item after it is clicked.
      * @since Chrome 35.
      */
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * A flag indicating whether the element is editable (text input, textarea, etc.).
      * @since Chrome 35.
      */
    var editable: Boolean = js.native
    
    /**
      * The ID of the frame of the element where the context menu was clicked,
      * if it was in a frame.
      * @since Chrome 35.
      */
    var frameId: js.UndefOr[integer] = js.native
    
    /**
      * The URL of the frame of the element where the context menu was clicked,
      * if it was in a frame.
      * @since Chrome 35.
      */
    var frameUrl: js.UndefOr[String] = js.native
    
    /**
      * If the element is a link, the URL it points to.
      * @since Chrome 35.
      */
    var linkUrl: js.UndefOr[String] = js.native
    
    /**
      * One of 'image', 'video', or 'audio' if the context menu was
      * activated on one of these types of elements.
      * @since Chrome 35.
      */
    var mediaType: js.UndefOr[MediaType] = js.native
    
    /**
      * The ID of the menu item that was clicked.
      * @since Chrome 35.
      */
    var menuItemId: integer | String = js.native
    
    /**
      * The URL of the page where the menu item was clicked.
      * This property is not set if the click occured in a
      * context where there is no current page, such as in
      * a launcher context menu.
      * @since Chrome 35.
      */
    var pageUrl: String = js.native
    
    /**
      * The parent ID, if any, for the item clicked.
      * @since Chrome 35.
      */
    var parentMenuItemId: js.UndefOr[integer | String] = js.native
    
    /**
      * The text for the context selection, if any.
      * @since Chrome 35.
      */
    var selectionText: js.UndefOr[String] = js.native
    
    /**
      * Will be present for elements with a 'src' URL.
      * @since Chrome 35.
      */
    var srcUrl: js.UndefOr[String] = js.native
    
    /**
      * A flag indicating the state of a checkbox or radio item before it was clicked.
      * @since Chrome 35.
      */
    var wasChecked: js.UndefOr[Boolean] = js.native
  }
  object OnClickData {
    
    @scala.inline
    def apply(editable: Boolean, menuItemId: integer | String, pageUrl: String): OnClickData = {
      val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    @scala.inline
    implicit class OnClickDataMutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameId(value: integer): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      @scala.inline
      def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      @scala.inline
      def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      @scala.inline
      def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMenuItemId(value: integer | String): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuItemId(value: integer | String): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
      
      @scala.inline
      def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      @scala.inline
      def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      @scala.inline
      def setWasChecked(value: Boolean): Self = StObject.set(x, "wasChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasCheckedUndefined: Self = StObject.set(x, "wasChecked", js.undefined)
    }
  }
  
  @js.native
  trait UpdateProperties extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    /** @see ContextType */
    var contexts: js.UndefOr[
        js.Array[
          ToStringLiteral[
            ALL, 
            /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
            Exclude[
              /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
            ]
          ]
        ]
      ] = js.native
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Information sent when a context menu item is clicked.
      * @since Chrome 44
      */
    var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.native
    
    /** Note: You cannot change an item to be a child of one of its own descendants.  */
    var parentId: js.UndefOr[integer | String] = js.native
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    /** @see ItemType */
    var `type`: js.UndefOr[
        ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          Exclude[
            /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
            normal_ | checkbox_ | radio_ | separator_
          ]
        ]
      ] = js.native
    
    /**
      * Whether the item is visible in the menu.
      * @since Chrome 62.
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object UpdateProperties {
    
    @scala.inline
    def apply(): UpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProperties]
    }
    
    @scala.inline
    implicit class UpdatePropertiesMutableBuilder[Self <: UpdateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContexts(
        value: js.Array[
              ToStringLiteral[
                ALL, 
                /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                Exclude[
                  /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                  browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
                ]
              ]
            ]
      ): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(
        value: (ToStringLiteral[
              ALL, 
              /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
              Exclude[
                /* keyof chrome-apps.anon.ALL */ typingsSlinky.chromeApps.chromeAppsStrings.ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
                browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
              ]
            ])*
      ): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      @scala.inline
      def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setOnclick(value: /* info */ OnClickData => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      @scala.inline
      def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(
        value: ToStringLiteral[
              CHECKBOX, 
              /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
              Exclude[
                /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
                normal_ | checkbox_ | radio_ | separator_
              ]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
