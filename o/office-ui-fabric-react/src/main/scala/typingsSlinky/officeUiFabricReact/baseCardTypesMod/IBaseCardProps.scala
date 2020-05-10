package typingsSlinky.officeUiFabricReact.baseCardTypesMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseCardProps[TComponent, TStyles, TStyleProps] extends HTMLAttributes[HTMLDivElement] {
  /**
    * Custom overriding props to Callout
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Optional callback to access the TComponent interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[TComponent]] = js.native
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.bottomLeftEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  /**
    * Make callout content show on the set side
    * @defaultvalue true
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  /**
    * Focus on first element by default on card or not
    */
  var firstFocus: js.UndefOr[Boolean] = js.native
  /**
    * The gap between the card and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  /**
    * Callback upon focus or mouse enter event
    */
  var onEnter: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Callback upon blur or mouse leave event
    */
  var onLeave: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    *  Item to be returned with onRender functions
    */
  var renderData: js.UndefOr[js.Any] = js.native
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[
      TStyleProps, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
    ]
  ] = js.native
  /**
    * Element to anchor the card to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Trap focus or not
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
}

object IBaseCardProps {
  @scala.inline
  def apply[TComponent, TStyles, TStyleProps](): IBaseCardProps[TComponent, TStyles, TStyleProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseCardProps[TComponent, TStyles, TStyleProps]]
  }
  @scala.inline
  implicit class IBaseCardPropsOps[Self[tcomponent, tstyles, tstyleprops] <: IBaseCardProps[tcomponent, tstyles, tstyleprops], TComponent, TStyles, TStyleProps] (val x: Self[TComponent, TStyles, TStyleProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TComponent, TStyles, TStyleProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TComponent, TStyles, TStyleProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TComponent, TStyles, TStyleProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TComponent, TStyles, TStyleProps]) with Other]
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[TComponent]): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[TComponent]): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHint(value: DirectionalHint): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintFixed(value: Boolean): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintFixed: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstFocus(value: Boolean): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstFocus: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSpace: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: /* ev */ js.UndefOr[js.Any] => Unit): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: /* ev */ js.UndefOr[js.Any] => Unit): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeave: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderData(value: js.Any): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderData: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderData")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(
      value: TStyleProps => Partial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
      */ typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
        ]
    ): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(
      value: IStyleFunctionOrObject[
          TStyleProps, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
      */ typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
        ]
    ): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: HTMLElement): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetElement: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTrapFocus(value: Boolean): Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrapFocus: Self[TComponent, TStyles, TStyleProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(js.undefined)
        ret
    }
  }
  
}

