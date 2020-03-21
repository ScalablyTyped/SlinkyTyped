package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyleProps
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressIndicatorBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.ProgressIndicatorBase] {
  @JSImport("office-ui-fabric-react", "ProgressIndicatorBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, title */
  def apply(
    ariaValueText: String = null,
    barHeight: Int | Double = null,
    description: TagMod[Any] = null,
    label: TagMod[Any] = null,
    onRenderProgress: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], ReactElement | Null]
    ]) => ReactElement | Null = null,
    percentComplete: Int | Double = null,
    progressHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ProgressIndicatorBase] = {
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ProgressIndicatorBase] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.mod.ProgressIndicatorBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IProgressIndicatorProps
}

