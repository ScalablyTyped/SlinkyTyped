package typingsSlinky.officeUiFabricReact.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListProps
import typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyleProps
import typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShimmeredDetailsListBase {
  @JSImport("office-ui-fabric-react", "ShimmeredDetailsListBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ShimmeredDetailsListBase] {
    @scala.inline
    def ariaLabelForShimmer(value: String): this.type = set("ariaLabelForShimmer", value.asInstanceOf[js.Any])
    @scala.inline
    def detailsListStylesFunction1(value: IDetailsListStyleProps => Partial[IDetailsListStyles]): this.type = set("detailsListStyles", js.Any.fromFunction1(value))
    @scala.inline
    def detailsListStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): this.type = set("detailsListStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def enableShimmer(value: Boolean): this.type = set("enableShimmer", value.asInstanceOf[js.Any])
    @scala.inline
    def onRenderCustomPlaceholder(
      value: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, TagMod[Any]]]) => TagMod[Any]
    ): this.type = set("onRenderCustomPlaceholder", js.Any.fromFunction3(value))
    @scala.inline
    def removeFadingOverlay(value: Boolean): this.type = set("removeFadingOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def shimmerLines(value: Double): this.type = set("shimmerLines", value.asInstanceOf[js.Any])
    @scala.inline
    def shimmerOverlayStylesFunction1(value: IShimmeredDetailsListStyleProps => Partial[IShimmeredDetailsListStyles]): this.type = set("shimmerOverlayStyles", js.Any.fromFunction1(value))
    @scala.inline
    def shimmerOverlayStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): this.type = set("shimmerOverlayStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IShimmeredDetailsListStyleProps => Partial[IShimmeredDetailsListStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IShimmeredDetailsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ShimmeredDetailsListBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

