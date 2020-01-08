package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotTypesMod.IProgressIndicatorProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotTypesMod.IProgressIndicatorStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotTypesMod.IProgressIndicatorStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressIndicatorBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libIndexDotBundleMod.ProgressIndicatorBase
    ] {
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ProgressIndicatorBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    ariaValueText: String = null,
    barHeight: Int | Double = null,
    description: TagMod[Any] = null,
    label: TagMod[Any] = null,
    onRenderProgress: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IProgressIndicatorProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    percentComplete: Int | Double = null,
    progressHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles] = null,
    theme: ITheme = null,
    title: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libIndexDotBundleMod.ProgressIndicatorBase
  ] = {
    val __obj = js.Dynamic.literal()
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText.asInstanceOf[js.Any])
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onRenderProgress != null) __obj.updateDynamic("onRenderProgress")(js.Any.fromFunction2(onRenderProgress))
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(progressHidden)) __obj.updateDynamic("progressHidden")(progressHidden.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libIndexDotBundleMod.ProgressIndicatorBase
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libIndexDotBundleMod.ProgressIndicatorBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IProgressIndicatorProps
}

