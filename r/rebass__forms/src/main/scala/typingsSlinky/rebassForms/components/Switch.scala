package typingsSlinky.rebassForms.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.rebass.mod.SxStyleProp
import typingsSlinky.rebassForms.mod.SwitchProps
import typingsSlinky.rebassForms.rebassFormsStrings.`additions removals`
import typingsSlinky.rebassForms.rebassFormsStrings.`additions text`
import typingsSlinky.rebassForms.rebassFormsStrings.`inline`
import typingsSlinky.rebassForms.rebassFormsStrings.`removals additions`
import typingsSlinky.rebassForms.rebassFormsStrings.`removals text`
import typingsSlinky.rebassForms.rebassFormsStrings.`text additions`
import typingsSlinky.rebassForms.rebassFormsStrings.`text removals`
import typingsSlinky.rebassForms.rebassFormsStrings.additions
import typingsSlinky.rebassForms.rebassFormsStrings.all
import typingsSlinky.rebassForms.rebassFormsStrings.ascending
import typingsSlinky.rebassForms.rebassFormsStrings.assertive
import typingsSlinky.rebassForms.rebassFormsStrings.both
import typingsSlinky.rebassForms.rebassFormsStrings.button
import typingsSlinky.rebassForms.rebassFormsStrings.colors
import typingsSlinky.rebassForms.rebassFormsStrings.copy
import typingsSlinky.rebassForms.rebassFormsStrings.date
import typingsSlinky.rebassForms.rebassFormsStrings.decimal
import typingsSlinky.rebassForms.rebassFormsStrings.descending
import typingsSlinky.rebassForms.rebassFormsStrings.dialog
import typingsSlinky.rebassForms.rebassFormsStrings.email
import typingsSlinky.rebassForms.rebassFormsStrings.execute
import typingsSlinky.rebassForms.rebassFormsStrings.fontSizes
import typingsSlinky.rebassForms.rebassFormsStrings.fontWeights
import typingsSlinky.rebassForms.rebassFormsStrings.grammar
import typingsSlinky.rebassForms.rebassFormsStrings.grid
import typingsSlinky.rebassForms.rebassFormsStrings.horizontal
import typingsSlinky.rebassForms.rebassFormsStrings.inherit
import typingsSlinky.rebassForms.rebassFormsStrings.link
import typingsSlinky.rebassForms.rebassFormsStrings.list
import typingsSlinky.rebassForms.rebassFormsStrings.listbox
import typingsSlinky.rebassForms.rebassFormsStrings.location
import typingsSlinky.rebassForms.rebassFormsStrings.menu
import typingsSlinky.rebassForms.rebassFormsStrings.mixed
import typingsSlinky.rebassForms.rebassFormsStrings.move
import typingsSlinky.rebassForms.rebassFormsStrings.no
import typingsSlinky.rebassForms.rebassFormsStrings.none
import typingsSlinky.rebassForms.rebassFormsStrings.numeric
import typingsSlinky.rebassForms.rebassFormsStrings.off
import typingsSlinky.rebassForms.rebassFormsStrings.on
import typingsSlinky.rebassForms.rebassFormsStrings.other
import typingsSlinky.rebassForms.rebassFormsStrings.page
import typingsSlinky.rebassForms.rebassFormsStrings.polite
import typingsSlinky.rebassForms.rebassFormsStrings.popup
import typingsSlinky.rebassForms.rebassFormsStrings.removals
import typingsSlinky.rebassForms.rebassFormsStrings.reset
import typingsSlinky.rebassForms.rebassFormsStrings.search
import typingsSlinky.rebassForms.rebassFormsStrings.space
import typingsSlinky.rebassForms.rebassFormsStrings.spelling
import typingsSlinky.rebassForms.rebassFormsStrings.step
import typingsSlinky.rebassForms.rebassFormsStrings.submit
import typingsSlinky.rebassForms.rebassFormsStrings.tel
import typingsSlinky.rebassForms.rebassFormsStrings.text
import typingsSlinky.rebassForms.rebassFormsStrings.time
import typingsSlinky.rebassForms.rebassFormsStrings.tree
import typingsSlinky.rebassForms.rebassFormsStrings.url
import typingsSlinky.rebassForms.rebassFormsStrings.vertical
import typingsSlinky.rebassForms.rebassFormsStrings.yes
import typingsSlinky.styledComponents.styledComponentsMod.CSSObject
import typingsSlinky.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("@rebass/forms", "Switch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelfVarargs(value: (js.Any | Null)*): this.type = set("alignSelf", js.Array(value :_*))
    
    @scala.inline
    def alignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _, 
          RequiredTheme
        ]
    ): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelfNull: this.type = set("alignSelf", null)
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: ReactElement): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def backgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColorNull: this.type = set("backgroundColor", null)
    
    @scala.inline
    def bgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("bg", js.Array(value :_*))
    
    @scala.inline
    def bg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgNull: this.type = set("bg", null)
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("color", js.Array(value :_*))
    
    @scala.inline
    def color(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorNull: this.type = set("color", null)
    
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def css(value: CSSObject | FlattenSimpleInterpolation | String): this.type = set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayVarargs(value: (js.Any | Null)*): this.type = set("display", js.Array(value :_*))
    
    @scala.inline
    def display(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _, 
          RequiredTheme
        ]
    ): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayNull: this.type = set("display", null)
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexVarargs(value: (js.Any | Null)*): this.type = set("flex", js.Array(value :_*))
    
    @scala.inline
    def flex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexNull: this.type = set("flex", null)
    
    @scala.inline
    def fontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): this.type = set("fontSize", js.Array(value :_*))
    
    @scala.inline
    def fontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeNull: this.type = set("fontSize", null)
    
    @scala.inline
    def fontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): this.type = set("fontWeight", js.Array(value :_*))
    
    @scala.inline
    def fontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, _], RequiredTheme]): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeightNull: this.type = set("fontWeight", null)
    
    @scala.inline
    def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightVarargs(value: (js.Any | Null)*): this.type = set("height", js.Array(value :_*))
    
    @scala.inline
    def height(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightNull: this.type = set("height", null)
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("m", js.Array(value :_*))
    
    @scala.inline
    def m(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mNull: this.type = set("m", null)
    
    @scala.inline
    def marginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("margin", js.Array(value :_*))
    
    @scala.inline
    def margin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginNull: this.type = set("margin", null)
    
    @scala.inline
    def marginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginBottom", js.Array(value :_*))
    
    @scala.inline
    def marginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottomNull: this.type = set("marginBottom", null)
    
    @scala.inline
    def marginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginLeft", js.Array(value :_*))
    
    @scala.inline
    def marginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginLeftNull: this.type = set("marginLeft", null)
    
    @scala.inline
    def marginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginRight", js.Array(value :_*))
    
    @scala.inline
    def marginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginRightNull: this.type = set("marginRight", null)
    
    @scala.inline
    def marginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginTop", js.Array(value :_*))
    
    @scala.inline
    def marginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginTopNull: this.type = set("marginTop", null)
    
    @scala.inline
    def marginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginX", js.Array(value :_*))
    
    @scala.inline
    def marginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginXNull: this.type = set("marginX", null)
    
    @scala.inline
    def marginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginY", js.Array(value :_*))
    
    @scala.inline
    def marginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginYNull: this.type = set("marginY", null)
    
    @scala.inline
    def maxHeightVarargs(value: (js.Any | Null)*): this.type = set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def maxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeightNull: this.type = set("maxHeight", null)
    
    @scala.inline
    def maxWidthVarargs(value: (js.Any | Null)*): this.type = set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def maxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidthNull: this.type = set("maxWidth", null)
    
    @scala.inline
    def mbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mb", js.Array(value :_*))
    
    @scala.inline
    def mb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mbNull: this.type = set("mb", null)
    
    @scala.inline
    def minHeightVarargs(value: (js.Any | Null)*): this.type = set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def minHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeightNull: this.type = set("minHeight", null)
    
    @scala.inline
    def minWidthVarargs(value: (js.Any | Null)*): this.type = set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def minWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidthNull: this.type = set("minWidth", null)
    
    @scala.inline
    def mlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("ml", js.Array(value :_*))
    
    @scala.inline
    def ml(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mlNull: this.type = set("ml", null)
    
    @scala.inline
    def mrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mr", js.Array(value :_*))
    
    @scala.inline
    def mr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mrNull: this.type = set("mr", null)
    
    @scala.inline
    def mtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mt", js.Array(value :_*))
    
    @scala.inline
    def mt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mtNull: this.type = set("mt", null)
    
    @scala.inline
    def mxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mx", js.Array(value :_*))
    
    @scala.inline
    def mx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mxNull: this.type = set("mx", null)
    
    @scala.inline
    def myVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("my", js.Array(value :_*))
    
    @scala.inline
    def my(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def myNull: this.type = set("my", null)
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLButtonElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExit(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: DragEvent[HTMLButtonElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLButtonElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLButtonElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLButtonElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLButtonElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def opacityVarargs(value: (js.Any | Null)*): this.type = set("opacity", js.Array(value :_*))
    
    @scala.inline
    def opacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
          RequiredTheme
        ]
    ): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityNull: this.type = set("opacity", null)
    
    @scala.inline
    def orderVarargs(value: (js.Any | Null)*): this.type = set("order", js.Array(value :_*))
    
    @scala.inline
    def order(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _, 
          RequiredTheme
        ]
    ): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orderNull: this.type = set("order", null)
    
    @scala.inline
    def overflowVarargs(value: (js.Any | Null)*): this.type = set("overflow", js.Array(value :_*))
    
    @scala.inline
    def overflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowNull: this.type = set("overflow", null)
    
    @scala.inline
    def overflowXVarargs(value: (js.Any | Null)*): this.type = set("overflowX", js.Array(value :_*))
    
    @scala.inline
    def overflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowXNull: this.type = set("overflowX", null)
    
    @scala.inline
    def overflowYVarargs(value: (js.Any | Null)*): this.type = set("overflowY", js.Array(value :_*))
    
    @scala.inline
    def overflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowYNull: this.type = set("overflowY", null)
    
    @scala.inline
    def pVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("p", js.Array(value :_*))
    
    @scala.inline
    def p(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pNull: this.type = set("p", null)
    
    @scala.inline
    def paddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("padding", js.Array(value :_*))
    
    @scala.inline
    def padding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingNull: this.type = set("padding", null)
    
    @scala.inline
    def paddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def paddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottomNull: this.type = set("paddingBottom", null)
    
    @scala.inline
    def paddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def paddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeftNull: this.type = set("paddingLeft", null)
    
    @scala.inline
    def paddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingRight", js.Array(value :_*))
    
    @scala.inline
    def paddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRightNull: this.type = set("paddingRight", null)
    
    @scala.inline
    def paddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingTop", js.Array(value :_*))
    
    @scala.inline
    def paddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTopNull: this.type = set("paddingTop", null)
    
    @scala.inline
    def paddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingX", js.Array(value :_*))
    
    @scala.inline
    def paddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingXNull: this.type = set("paddingX", null)
    
    @scala.inline
    def paddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingY", js.Array(value :_*))
    
    @scala.inline
    def paddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingYNull: this.type = set("paddingY", null)
    
    @scala.inline
    def pbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pb", js.Array(value :_*))
    
    @scala.inline
    def pb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pbNull: this.type = set("pb", null)
    
    @scala.inline
    def plVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pl", js.Array(value :_*))
    
    @scala.inline
    def pl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def plNull: this.type = set("pl", null)
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pr", js.Array(value :_*))
    
    @scala.inline
    def pr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prNull: this.type = set("pr", null)
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ptVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pt", js.Array(value :_*))
    
    @scala.inline
    def pt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ptNull: this.type = set("pt", null)
    
    @scala.inline
    def pxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("px", js.Array(value :_*))
    
    @scala.inline
    def px(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pxNull: this.type = set("px", null)
    
    @scala.inline
    def pyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("py", js.Array(value :_*))
    
    @scala.inline
    def py(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("py", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pyNull: this.type = set("py", null)
    
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeVarargs(value: (js.Any | Null)*): this.type = set("size", js.Array(value :_*))
    
    @scala.inline
    def size(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeNull: this.type = set("size", null)
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sx(value: SxStyleProp): this.type = set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sxNull: this.type = set("sx", null)
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tx(value: String): this.type = set("tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variantVarargs(value: (String | Null)*): this.type = set("variant", js.Array(value :_*))
    
    @scala.inline
    def variant(value: ResponsiveValue[String, RequiredTheme]): this.type = set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variantNull: this.type = set("variant", null)
    
    @scala.inline
    def verticalAlignVarargs(value: (js.Any | Null)*): this.type = set("verticalAlign", js.Array(value :_*))
    
    @scala.inline
    def verticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlignNull: this.type = set("verticalAlign", null)
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthVarargs(value: (js.Any | Null)*): this.type = set("width", js.Array(value :_*))
    
    @scala.inline
    def width(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthNull: this.type = set("width", null)
  }
  
  def withProps(p: SwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
