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
import scala.scalajs.js.annotation._

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
    def withAsFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withNowrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowrap")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction3(value: (ITextProps, /* theme */ ITheme, ITextTokens) => ITextStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: ITokenFunctionOrObject[ITextProps, ITextTokens]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(
      value: tiny | xSmall | small | smallPlus | medium | mediumPlus | large | xLarge | xLargePlus | xxLarge | xxLargePlus | superLarge | mega
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

