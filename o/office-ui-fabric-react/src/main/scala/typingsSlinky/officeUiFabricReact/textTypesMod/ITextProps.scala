package typingsSlinky.officeUiFabricReact.textTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.large
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.medium
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.mediumPlus
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.mega
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.small
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.smallPlus
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.superLarge
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.tiny
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xLarge
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xLargePlus
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xSmall
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xxLarge
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.xxLargePlus
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricFoundation.anon.Slots
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.uifabricFoundation.libIcomponentMod.IStyleableComponentProps because var conflicts: className. Inlined styles, theme, tokens */ @js.native
trait ITextProps
  extends HTMLAttributes[HTMLElement]
     with ITextSlots
     with Slots[ITextSlots] {
  
  /**
    * Optionally render the component as another component type or primitive.
    */
  var as: js.UndefOr[ReactElement] = js.native
  
  /**
    * Whether the text is displayed as a block element.
    *
    * Note that in order for ellipsis on overflow to work properly,
    * `block` and `nowrap` should be set to true.
    */
  var block: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the text is not wrapped.
    *
    * Note that in order for ellipsis on overflow to work properly,
    * `block` and `nowrap` should be set to true.
    */
  var nowrap: js.UndefOr[Boolean] = js.native
  
  var styles: js.UndefOr[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
  
  var tokens: js.UndefOr[ITokenFunctionOrObject[ITextProps, ITextTokens]] = js.native
  
  /**
    * Optional font type for Text.
    */
  var variant: js.UndefOr[
    tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
  ] = js.native
}
object ITextProps {
  
  @scala.inline
  def apply(): ITextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextProps]
  }
  
  @scala.inline
  implicit class ITextPropsOps[Self <: ITextProps] (val x: Self) extends AnyVal {
    
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
    def setAsFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: ReactElement): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setNowrap(value: Boolean): Self = this.set("nowrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNowrap: Self = this.set("nowrap", js.undefined)
    
    @scala.inline
    def setStylesFunction3(value: (ITextProps, /* theme */ ITheme, ITextTokens) => ITextStyles): Self = this.set("styles", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyles(value: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTokens(value: ITokenFunctionOrObject[ITextProps, ITextTokens]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    
    @scala.inline
    def setVariant(
      value: tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
    ): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
