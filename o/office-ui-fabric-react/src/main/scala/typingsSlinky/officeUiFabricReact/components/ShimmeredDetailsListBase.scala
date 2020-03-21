package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListProps
import typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyleProps
import typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShimmeredDetailsListBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.ShimmeredDetailsListBase] {
  @JSImport("office-ui-fabric-react", "ShimmeredDetailsListBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    ariaLabelForShimmer: String = null,
    detailsListStyles: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles] = null,
    enableShimmer: js.UndefOr[Boolean] = js.undefined,
    onRenderCustomPlaceholder: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, TagMod[Any]]]) => TagMod[Any] = null,
    removeFadingOverlay: js.UndefOr[Boolean] = js.undefined,
    shimmerLines: Int | Double = null,
    shimmerOverlayStyles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    styles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ShimmeredDetailsListBase] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelForShimmer != null) __obj.updateDynamic("ariaLabelForShimmer")(ariaLabelForShimmer.asInstanceOf[js.Any])
    if (detailsListStyles != null) __obj.updateDynamic("detailsListStyles")(detailsListStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(enableShimmer)) __obj.updateDynamic("enableShimmer")(enableShimmer.asInstanceOf[js.Any])
    if (onRenderCustomPlaceholder != null) __obj.updateDynamic("onRenderCustomPlaceholder")(js.Any.fromFunction3(onRenderCustomPlaceholder))
    if (!js.isUndefined(removeFadingOverlay)) __obj.updateDynamic("removeFadingOverlay")(removeFadingOverlay.asInstanceOf[js.Any])
    if (shimmerLines != null) __obj.updateDynamic("shimmerLines")(shimmerLines.asInstanceOf[js.Any])
    if (shimmerOverlayStyles != null) __obj.updateDynamic("shimmerOverlayStyles")(shimmerOverlayStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ShimmeredDetailsListBase] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.mod.ShimmeredDetailsListBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IShimmeredDetailsListProps
}

