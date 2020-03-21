package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.ReactNode
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.std.Partial
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.controlledMod.IControlledStateOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IViewComponent
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlot
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotFactory
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidShorthand
import typingsSlinky.uifabricFoundation.themeProviderMod.IThemeProviderProps
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsSlinky.uifabricUtilities.styledMod.ICustomizableProps
import typingsSlinky.uifabricUtilities.styledMod.IPropsWithStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  val ThemeProvider: ReactComponentClass[IThemeProviderProps] = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): ReactComponentClass[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): ReactComponentClass[TComponentProps] with TStatics = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getControlledDerivedProps[TProps, TProp /* <: String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def withSlots[P](`type`: String): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
}

