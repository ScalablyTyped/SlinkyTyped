package typingsSlinky.reactFoundation

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AriaAttributes
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.LabelHTMLAttributes
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
import typingsSlinky.reactFoundation.enumsMod.Breakpoints
import typingsSlinky.reactFoundation.enumsMod.FloatTypes
import typingsSlinky.reactFoundation.enumsMod.SwitchInputTypes
import typingsSlinky.reactFoundation.enumsMod.SwitchSizes
import typingsSlinky.reactFoundation.reactFoundationStrings.large
import typingsSlinky.reactFoundation.reactFoundationStrings.medium
import typingsSlinky.reactFoundation.utilsMod.FlexboxPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  @JSImport("react-foundation/components/switch", "Switch")
  @js.native
  val Switch: ReactComponentClass[SwitchProps] = js.native
  
  @JSImport("react-foundation/components/switch", "SwitchActive")
  @js.native
  val SwitchActive: ReactComponentClass[SwitchActiveProps] = js.native
  
  @JSImport("react-foundation/components/switch", "SwitchInactive")
  @js.native
  val SwitchInactive: ReactComponentClass[SwitchInactiveProps] = js.native
  
  @JSImport("react-foundation/components/switch", "SwitchInput")
  @js.native
  val SwitchInput: ReactComponentClass[SwitchInputProps] = js.native
  
  @JSImport("react-foundation/components/switch", "SwitchPaddle")
  @js.native
  val SwitchPaddle: ReactComponentClass[SwitchPaddleProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typingsSlinky.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait SwitchActiveProps extends HTMLAttributes[HTMLSpanElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object SwitchActiveProps {
    
    @scala.inline
    def apply(): SwitchActiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchActiveProps]
    }
    
    @scala.inline
    implicit class SwitchActivePropsMutableBuilder[Self <: SwitchActiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typingsSlinky.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait SwitchInactiveProps extends HTMLAttributes[HTMLSpanElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object SwitchInactiveProps {
    
    @scala.inline
    def apply(): SwitchInactiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchInactiveProps]
    }
    
    @scala.inline
    implicit class SwitchInactivePropsMutableBuilder[Self <: SwitchInactiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typingsSlinky.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait SwitchInputProps extends InputHTMLAttributes[HTMLInputElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    @JSName("type")
    var type_SwitchInputProps: js.UndefOr[SwitchInputTypes] = js.native
  }
  object SwitchInputProps {
    
    @scala.inline
    def apply(): SwitchInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchInputProps]
    }
    
    @scala.inline
    implicit class SwitchInputPropsMutableBuilder[Self <: SwitchInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
      
      @scala.inline
      def setType(value: SwitchInputTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
  - typingsSlinky.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
  trait SwitchPaddleProps extends LabelHTMLAttributes[HTMLLabelElement] {
    
    var float: js.UndefOr[FloatTypes] = js.native
    
    var hideFor: js.UndefOr[medium | large] = js.native
    
    var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
    
    var isClearfix: js.UndefOr[Boolean] = js.native
    
    var isHidden: js.UndefOr[Boolean] = js.native
    
    var isInvisible: js.UndefOr[Boolean] = js.native
    
    var noDefaultClassName: js.UndefOr[String] = js.native
    
    var showFor: js.UndefOr[Breakpoints] = js.native
    
    var showForLandscape: js.UndefOr[Boolean] = js.native
    
    var showForPortrait: js.UndefOr[Boolean] = js.native
    
    var showForSr: js.UndefOr[Boolean] = js.native
    
    var showOnFocus: js.UndefOr[Boolean] = js.native
    
    var showOnlyFor: js.UndefOr[Breakpoints] = js.native
  }
  object SwitchPaddleProps {
    
    @scala.inline
    def apply(): SwitchPaddleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchPaddleProps]
    }
    
    @scala.inline
    implicit class SwitchPaddlePropsMutableBuilder[Self <: SwitchPaddleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloat(value: FloatTypes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setHideFor(value: medium | large): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
      
      @scala.inline
      def setHideOnlyFor(value: Breakpoints): Self = StObject.set(x, "hideOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyForUndefined: Self = StObject.set(x, "hideOnlyFor", js.undefined)
      
      @scala.inline
      def setIsClearfix(value: Boolean): Self = StObject.set(x, "isClearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearfixUndefined: Self = StObject.set(x, "isClearfix", js.undefined)
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsInvisible(value: Boolean): Self = StObject.set(x, "isInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvisibleUndefined: Self = StObject.set(x, "isInvisible", js.undefined)
      
      @scala.inline
      def setNoDefaultClassName(value: String): Self = StObject.set(x, "noDefaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDefaultClassNameUndefined: Self = StObject.set(x, "noDefaultClassName", js.undefined)
      
      @scala.inline
      def setShowFor(value: Breakpoints): Self = StObject.set(x, "showFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscape(value: Boolean): Self = StObject.set(x, "showForLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForLandscapeUndefined: Self = StObject.set(x, "showForLandscape", js.undefined)
      
      @scala.inline
      def setShowForPortrait(value: Boolean): Self = StObject.set(x, "showForPortrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForPortraitUndefined: Self = StObject.set(x, "showForPortrait", js.undefined)
      
      @scala.inline
      def setShowForSr(value: Boolean): Self = StObject.set(x, "showForSr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForSrUndefined: Self = StObject.set(x, "showForSr", js.undefined)
      
      @scala.inline
      def setShowForUndefined: Self = StObject.set(x, "showFor", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOnlyFor(value: Breakpoints): Self = StObject.set(x, "showOnlyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnlyForUndefined: Self = StObject.set(x, "showOnlyFor", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results */ @js.native
  trait SwitchProps
    extends FlexboxPropTypes
       with AriaAttributes
       with DOMAttributes[HTMLDivElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    var active: js.UndefOr[SwitchActiveProps] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
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
    
    var id: js.UndefOr[String] = js.native
    
    var inactive: js.UndefOr[SwitchInactiveProps] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    var input: js.UndefOr[SwitchInputProps] = js.native
    
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
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var paddle: js.UndefOr[SwitchPaddleProps] = js.native
    
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
    
    var size: js.UndefOr[SwitchSizes] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setActive(value: SwitchActiveProps): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInactive(value: SwitchInactiveProps): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInput(value: SwitchInputProps): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
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
      def setPaddle(value: SwitchPaddleProps): Self = StObject.set(x, "paddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddleUndefined: Self = StObject.set(x, "paddle", js.undefined)
      
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
      def setSize(value: SwitchSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
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
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
}
