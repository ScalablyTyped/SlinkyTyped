package typingsSlinky.reactFoundation.gridMod

import org.scalajs.dom.raw.HTMLDivElement
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, translate, typeof, unselectable, vocab */ @js.native
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
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setCenterOnLarge(value: Boolean): Self = this.set("centerOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterOnLarge: Self = this.set("centerOnLarge", js.undefined)
    
    @scala.inline
    def setCenterOnMedium(value: Boolean): Self = this.set("centerOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterOnMedium: Self = this.set("centerOnMedium", js.undefined)
    
    @scala.inline
    def setCenterOnSmall(value: Boolean): Self = this.set("centerOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterOnSmall: Self = this.set("centerOnSmall", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setExpandOnLarge(value: Boolean): Self = this.set("expandOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnLarge: Self = this.set("expandOnLarge", js.undefined)
    
    @scala.inline
    def setExpandOnMedium(value: Boolean): Self = this.set("expandOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnMedium: Self = this.set("expandOnMedium", js.undefined)
    
    @scala.inline
    def setExpandOnSmall(value: Boolean): Self = this.set("expandOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnSmall: Self = this.set("expandOnSmall", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsColumn(value: Boolean): Self = this.set("isColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsColumn: Self = this.set("isColumn", js.undefined)
    
    @scala.inline
    def setIsLast(value: Boolean): Self = this.set("isLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLast: Self = this.set("isLast", js.undefined)
    
    @scala.inline
    def setIsShrunk(value: Boolean): Self = this.set("isShrunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsShrunk: Self = this.set("isShrunk", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLarge(value: Double): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMedium(value: Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setOffsetOnLarge(value: Double): Self = this.set("offsetOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetOnLarge: Self = this.set("offsetOnLarge", js.undefined)
    
    @scala.inline
    def setOffsetOnMedium(value: Double): Self = this.set("offsetOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetOnMedium: Self = this.set("offsetOnMedium", js.undefined)
    
    @scala.inline
    def setOffsetOnSmall(value: Double): Self = this.set("offsetOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetOnSmall: Self = this.set("offsetOnSmall", js.undefined)
    
    @scala.inline
    def setOrderOnLarge(value: Double): Self = this.set("orderOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderOnLarge: Self = this.set("orderOnLarge", js.undefined)
    
    @scala.inline
    def setOrderOnMedium(value: Double): Self = this.set("orderOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderOnMedium: Self = this.set("orderOnMedium", js.undefined)
    
    @scala.inline
    def setOrderOnSmall(value: Double): Self = this.set("orderOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderOnSmall: Self = this.set("orderOnSmall", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setPullOnLarge(value: Double): Self = this.set("pullOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullOnLarge: Self = this.set("pullOnLarge", js.undefined)
    
    @scala.inline
    def setPullOnMedium(value: Double): Self = this.set("pullOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullOnMedium: Self = this.set("pullOnMedium", js.undefined)
    
    @scala.inline
    def setPullOnSmall(value: Double): Self = this.set("pullOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullOnSmall: Self = this.set("pullOnSmall", js.undefined)
    
    @scala.inline
    def setPushOnLarge(value: Double): Self = this.set("pushOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushOnLarge: Self = this.set("pushOnLarge", js.undefined)
    
    @scala.inline
    def setPushOnMedium(value: Double): Self = this.set("pushOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushOnMedium: Self = this.set("pushOnMedium", js.undefined)
    
    @scala.inline
    def setPushOnSmall(value: Double): Self = this.set("pushOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushOnSmall: Self = this.set("pushOnSmall", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSmall(value: Double): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUncenterOnLarge(value: Boolean): Self = this.set("uncenterOnLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncenterOnLarge: Self = this.set("uncenterOnLarge", js.undefined)
    
    @scala.inline
    def setUncenterOnMedium(value: Boolean): Self = this.set("uncenterOnMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncenterOnMedium: Self = this.set("uncenterOnMedium", js.undefined)
    
    @scala.inline
    def setUncenterOnSmall(value: Boolean): Self = this.set("uncenterOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncenterOnSmall: Self = this.set("uncenterOnSmall", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setUpOnSmall(value: Double): Self = this.set("upOnSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpOnSmall: Self = this.set("upOnSmall", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
  }
}
