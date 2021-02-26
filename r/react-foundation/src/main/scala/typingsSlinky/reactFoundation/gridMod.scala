package typingsSlinky.reactFoundation

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AriaAttributes
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.reactStrings.decimal
import typingsSlinky.react.reactStrings.email
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.numeric
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import typingsSlinky.react.reactStrings.search
import typingsSlinky.react.reactStrings.tel
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.url
import typingsSlinky.react.reactStrings.yes
import typingsSlinky.reactFoundation.utilsMod.FlexboxPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("react-foundation/components/grid", "Column")
  @js.native
  val Column: ReactComponentClass[ColumnProps] = js.native
  
  @JSImport("react-foundation/components/grid", "Row")
  @js.native
  val Row: ReactComponentClass[RowProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results */ @js.native
  trait ColumnProps
    extends FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLDivElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var centerOnLarge: js.UndefOr[Boolean] = js.native
    
    var centerOnMedium: js.UndefOr[Boolean] = js.native
    
    var centerOnSmall: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var expandOnLarge: js.UndefOr[Boolean] = js.native
    
    var expandOnMedium: js.UndefOr[Boolean] = js.native
    
    var expandOnSmall: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.native
    
    var isColumn: js.UndefOr[Boolean] = js.native
    
    var isLast: js.UndefOr[Boolean] = js.native
    
    var isShrunk: js.UndefOr[Boolean] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var large: js.UndefOr[Double] = js.native
    
    var medium: js.UndefOr[Double] = js.native
    
    var offsetOnLarge: js.UndefOr[Double] = js.native
    
    var offsetOnMedium: js.UndefOr[Double] = js.native
    
    var offsetOnSmall: js.UndefOr[Double] = js.native
    
    var orderOnLarge: js.UndefOr[Double] = js.native
    
    var orderOnMedium: js.UndefOr[Double] = js.native
    
    var orderOnSmall: js.UndefOr[Double] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var pullOnLarge: js.UndefOr[Double] = js.native
    
    var pullOnMedium: js.UndefOr[Double] = js.native
    
    var pullOnSmall: js.UndefOr[Double] = js.native
    
    var pushOnLarge: js.UndefOr[Double] = js.native
    
    var pushOnMedium: js.UndefOr[Double] = js.native
    
    var pushOnSmall: js.UndefOr[Double] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var small: js.UndefOr[Double] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var uncenterOnLarge: js.UndefOr[Boolean] = js.native
    
    var uncenterOnMedium: js.UndefOr[Boolean] = js.native
    
    var uncenterOnSmall: js.UndefOr[Boolean] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var upOnSmall: js.UndefOr[Double] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object ColumnProps {
    
    @scala.inline
    def apply(): ColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps]
    }
    
    @scala.inline
    implicit class ColumnPropsMutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCenterOnLarge(value: Boolean): Self = StObject.set(x, "centerOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterOnLargeUndefined: Self = StObject.set(x, "centerOnLarge", js.undefined)
      
      @scala.inline
      def setCenterOnMedium(value: Boolean): Self = StObject.set(x, "centerOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterOnMediumUndefined: Self = StObject.set(x, "centerOnMedium", js.undefined)
      
      @scala.inline
      def setCenterOnSmall(value: Boolean): Self = StObject.set(x, "centerOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterOnSmallUndefined: Self = StObject.set(x, "centerOnSmall", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setExpandOnLarge(value: Boolean): Self = StObject.set(x, "expandOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnLargeUndefined: Self = StObject.set(x, "expandOnLarge", js.undefined)
      
      @scala.inline
      def setExpandOnMedium(value: Boolean): Self = StObject.set(x, "expandOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnMediumUndefined: Self = StObject.set(x, "expandOnMedium", js.undefined)
      
      @scala.inline
      def setExpandOnSmall(value: Boolean): Self = StObject.set(x, "expandOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnSmallUndefined: Self = StObject.set(x, "expandOnSmall", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumn(value: Boolean): Self = StObject.set(x, "isColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumnUndefined: Self = StObject.set(x, "isColumn", js.undefined)
      
      @scala.inline
      def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
      
      @scala.inline
      def setIsShrunk(value: Boolean): Self = StObject.set(x, "isShrunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsShrunkUndefined: Self = StObject.set(x, "isShrunk", js.undefined)
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      @scala.inline
      def setOffsetOnLarge(value: Double): Self = StObject.set(x, "offsetOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOnLargeUndefined: Self = StObject.set(x, "offsetOnLarge", js.undefined)
      
      @scala.inline
      def setOffsetOnMedium(value: Double): Self = StObject.set(x, "offsetOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOnMediumUndefined: Self = StObject.set(x, "offsetOnMedium", js.undefined)
      
      @scala.inline
      def setOffsetOnSmall(value: Double): Self = StObject.set(x, "offsetOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOnSmallUndefined: Self = StObject.set(x, "offsetOnSmall", js.undefined)
      
      @scala.inline
      def setOrderOnLarge(value: Double): Self = StObject.set(x, "orderOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderOnLargeUndefined: Self = StObject.set(x, "orderOnLarge", js.undefined)
      
      @scala.inline
      def setOrderOnMedium(value: Double): Self = StObject.set(x, "orderOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderOnMediumUndefined: Self = StObject.set(x, "orderOnMedium", js.undefined)
      
      @scala.inline
      def setOrderOnSmall(value: Double): Self = StObject.set(x, "orderOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderOnSmallUndefined: Self = StObject.set(x, "orderOnSmall", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setPullOnLarge(value: Double): Self = StObject.set(x, "pullOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullOnLargeUndefined: Self = StObject.set(x, "pullOnLarge", js.undefined)
      
      @scala.inline
      def setPullOnMedium(value: Double): Self = StObject.set(x, "pullOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullOnMediumUndefined: Self = StObject.set(x, "pullOnMedium", js.undefined)
      
      @scala.inline
      def setPullOnSmall(value: Double): Self = StObject.set(x, "pullOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullOnSmallUndefined: Self = StObject.set(x, "pullOnSmall", js.undefined)
      
      @scala.inline
      def setPushOnLarge(value: Double): Self = StObject.set(x, "pushOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushOnLargeUndefined: Self = StObject.set(x, "pushOnLarge", js.undefined)
      
      @scala.inline
      def setPushOnMedium(value: Double): Self = StObject.set(x, "pushOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushOnMediumUndefined: Self = StObject.set(x, "pushOnMedium", js.undefined)
      
      @scala.inline
      def setPushOnSmall(value: Double): Self = StObject.set(x, "pushOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushOnSmallUndefined: Self = StObject.set(x, "pushOnSmall", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUncenterOnLarge(value: Boolean): Self = StObject.set(x, "uncenterOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncenterOnLargeUndefined: Self = StObject.set(x, "uncenterOnLarge", js.undefined)
      
      @scala.inline
      def setUncenterOnMedium(value: Boolean): Self = StObject.set(x, "uncenterOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncenterOnMediumUndefined: Self = StObject.set(x, "uncenterOnMedium", js.undefined)
      
      @scala.inline
      def setUncenterOnSmall(value: Boolean): Self = StObject.set(x, "uncenterOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncenterOnSmallUndefined: Self = StObject.set(x, "uncenterOnSmall", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUpOnSmall(value: Double): Self = StObject.set(x, "upOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpOnSmallUndefined: Self = StObject.set(x, "upOnSmall", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results */ @js.native
  trait RowProps
    extends FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLDivElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var collapseOnLarge: js.UndefOr[Boolean] = js.native
    
    var collapseOnMedium: js.UndefOr[Boolean] = js.native
    
    var collapseOnSmall: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var horizontalAlignment: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.native
    
    var isCollapsed: js.UndefOr[Boolean] = js.native
    
    var isColumn: js.UndefOr[Boolean] = js.native
    
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var uncollapseOnLarge: js.UndefOr[Boolean] = js.native
    
    var uncollapseOnMedium: js.UndefOr[Boolean] = js.native
    
    var uncollapseOnSmall: js.UndefOr[Boolean] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var unstackOnLarge: js.UndefOr[Boolean] = js.native
    
    var unstackOnMedium: js.UndefOr[Boolean] = js.native
    
    var unstackOnSmall: js.UndefOr[Boolean] = js.native
    
    var upOnLarge: js.UndefOr[Double] = js.native
    
    var upOnMedium: js.UndefOr[Double] = js.native
    
    var upOnSmall: js.UndefOr[Double] = js.native
    
    var verticalAlignment: js.UndefOr[String] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCollapseOnLarge(value: Boolean): Self = StObject.set(x, "collapseOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnLargeUndefined: Self = StObject.set(x, "collapseOnLarge", js.undefined)
      
      @scala.inline
      def setCollapseOnMedium(value: Boolean): Self = StObject.set(x, "collapseOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnMediumUndefined: Self = StObject.set(x, "collapseOnMedium", js.undefined)
      
      @scala.inline
      def setCollapseOnSmall(value: Boolean): Self = StObject.set(x, "collapseOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnSmallUndefined: Self = StObject.set(x, "collapseOnSmall", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setIsColumn(value: Boolean): Self = StObject.set(x, "isColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumnUndefined: Self = StObject.set(x, "isColumn", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUncollapseOnLarge(value: Boolean): Self = StObject.set(x, "uncollapseOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncollapseOnLargeUndefined: Self = StObject.set(x, "uncollapseOnLarge", js.undefined)
      
      @scala.inline
      def setUncollapseOnMedium(value: Boolean): Self = StObject.set(x, "uncollapseOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncollapseOnMediumUndefined: Self = StObject.set(x, "uncollapseOnMedium", js.undefined)
      
      @scala.inline
      def setUncollapseOnSmall(value: Boolean): Self = StObject.set(x, "uncollapseOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncollapseOnSmallUndefined: Self = StObject.set(x, "uncollapseOnSmall", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUnstackOnLarge(value: Boolean): Self = StObject.set(x, "unstackOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackOnLargeUndefined: Self = StObject.set(x, "unstackOnLarge", js.undefined)
      
      @scala.inline
      def setUnstackOnMedium(value: Boolean): Self = StObject.set(x, "unstackOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackOnMediumUndefined: Self = StObject.set(x, "unstackOnMedium", js.undefined)
      
      @scala.inline
      def setUnstackOnSmall(value: Boolean): Self = StObject.set(x, "unstackOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackOnSmallUndefined: Self = StObject.set(x, "unstackOnSmall", js.undefined)
      
      @scala.inline
      def setUpOnLarge(value: Double): Self = StObject.set(x, "upOnLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpOnLargeUndefined: Self = StObject.set(x, "upOnLarge", js.undefined)
      
      @scala.inline
      def setUpOnMedium(value: Double): Self = StObject.set(x, "upOnMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpOnMediumUndefined: Self = StObject.set(x, "upOnMedium", js.undefined)
      
      @scala.inline
      def setUpOnSmall(value: Double): Self = StObject.set(x, "upOnSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpOnSmallUndefined: Self = StObject.set(x, "upOnSmall", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
}
