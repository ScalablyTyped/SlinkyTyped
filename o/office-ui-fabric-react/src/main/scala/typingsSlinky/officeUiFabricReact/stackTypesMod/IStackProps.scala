package typingsSlinky.officeUiFabricReact.stackTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.initial
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.unset
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricFoundation.AnonSlots
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.uifabricFoundation.libIcomponentMod.IStyleableComponentProps because var conflicts: className. Inlined styles, theme, tokens */ @js.native
trait IStackProps
  extends HTMLAttributes[HTMLElement]
     with IStackSlots
     with AnonSlots[IStackSlots] {
  /**
    * Defines how to render the Stack.
    */
  var as: js.UndefOr[ReactElement] = js.native
  /**
    * Defines whether Stack children should not shrink to fit the available space.
    * @defaultvalue false
    */
  var disableShrink: js.UndefOr[Boolean] = js.native
  /**
    * Defines the spacing between Stack children.
    * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
    * If 'column gap' is omitted, it's set to the same value as 'row gap'.
    * @deprecated Use 'childrenGap' token instead.
    */
  var gap: js.UndefOr[Double | String] = js.native
  /**
    * Defines how much to grow the Stack in proportion to its siblings.
    */
  var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
  /**
    * Defines whether to render Stack children horizontally.
    * @defaultvalue false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * Defines how to align Stack children horizontally (along the x-axis).
    */
  var horizontalAlign: js.UndefOr[Alignment] = js.native
  /**
    * Defines the maximum height that the Stack can take.
    * @deprecated Use 'maxHeight' token instead.
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  /**
    * Defines the maximum width that the Stack can take.
    * @deprecated Use 'maxWidth' token instead.
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /**
    * Defines the inner padding of the Stack.
    * @deprecated Use 'padding' token instead.
    */
  var padding: js.UndefOr[Double | String] = js.native
  /**
    * Defines whether to render Stack children in the opposite direction (bottom-to-top if it's a vertical Stack and
    * right-to-left if it's a horizontal Stack).
    * @defaultvalue false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  var tokens: js.UndefOr[ITokenFunctionOrObject[IStackProps, IStackTokens]] = js.native
  /**
    * Defines how to align Stack children vertically (along the y-axis).
    */
  var verticalAlign: js.UndefOr[Alignment] = js.native
  /**
    * Defines whether the Stack should take up 100% of the height of its parent.
    * This property is required to be set to true when using the `grow` flag on children in vertical oriented Stacks.
    * Stacks are rendered as block elements and grow horizontally to the container already.
    * @defaultvalue false
    */
  var verticalFill: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether Stack children should wrap onto multiple rows or columns when they are about to overflow
    * the size of the Stack.
    * @defaultvalue false
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object IStackProps {
  @scala.inline
  def apply(): IStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackProps]
  }
  @scala.inline
  implicit class IStackPropsOps[Self <: IStackProps] (val x: Self) extends AnyVal {
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
    def withDisableShrink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableShrink")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withGrow(value: Boolean | Double | inherit | initial | unset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlign(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction3(value: (IStackProps, /* theme */ ITheme, IStackTokens) => IStackStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]): Self = {
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
    def withTokens(value: ITokenFunctionOrObject[IStackProps, IStackTokens]): Self = {
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
    def withVerticalAlign(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalFill")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

