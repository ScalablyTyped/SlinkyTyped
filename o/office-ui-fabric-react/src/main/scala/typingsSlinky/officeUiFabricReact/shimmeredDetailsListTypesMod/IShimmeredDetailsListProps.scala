package typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod

import slinky.core.TagMod
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.Diff<keyof office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'styles'> ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]} */ @js.native
trait IShimmeredDetailsListProps extends js.Object {
  /**
    * Aria label for shimmer. Set on grid while shimmer is enabled.
    */
  var ariaLabelForShimmer: js.UndefOr[String] = js.native
  /**
    * DetailsList styles to pass through.
    */
  var detailsListStyles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.native
  /**
    * Boolean flag to control when to render placeholders vs real items.
    * It's up to the consumer app to know when fetching of the data is done to toggle this prop.
    */
  var enableShimmer: js.UndefOr[Boolean] = js.native
  /**
    * Custom placeholder renderer to be used when in need to override the default placeholder of a DetailsRow.
    * `rowProps` argument is passed to leverage the calculated column measurements done by DetailsList
    * or you can use the optional arguments of item `index` and `defaultRender` to execute additional
    * logic before rendering the default placeholder.
    */
  var onRenderCustomPlaceholder: js.UndefOr[
    js.Function3[
      /* rowProps */ IDetailsRowProps, 
      /* index */ js.UndefOr[Double], 
      /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, TagMod[Any]]], 
      TagMod[Any]
    ]
  ] = js.native
  /**
    * Determines whether to remove a fading out to bottom overlay over the shimmering items
    * used to further emphasize the unknown number of items that will be fetched.
    */
  var removeFadingOverlay: js.UndefOr[Boolean] = js.native
  /**
    * Number of shimmer placeholder lines to render.
    * @defaultvalue 10
    */
  var shimmerLines: js.UndefOr[Double] = js.native
  /**
    * Custom styles to override the styles specific to the ShimmeredDetailsList root area.
    * @deprecated Use `styles` prop instead. Any value provided will be ignored.
    */
  var shimmerOverlayStyles: js.UndefOr[
    IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]
  ] = js.native
  /**
    * Custom styles to override the styles specific to the ShimmeredDetailsList root area.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]
  ] = js.native
}

object IShimmeredDetailsListProps {
  @scala.inline
  def apply(): IShimmeredDetailsListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmeredDetailsListProps]
  }
  @scala.inline
  implicit class IShimmeredDetailsListPropsOps[Self <: IShimmeredDetailsListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabelForShimmer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForShimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelForShimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForShimmer")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsListStylesFunction1(value: IDetailsListStyleProps => Partial[IDetailsListStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsListStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetailsListStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsListStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsListStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsListStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableShimmer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableShimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableShimmer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCustomPlaceholder(
      value: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, TagMod[Any]]]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCustomPlaceholder")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCustomPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCustomPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFadingOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFadingOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFadingOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFadingOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerOverlayStylesFunction1(value: IShimmeredDetailsListStyleProps => Partial[IShimmeredDetailsListStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerOverlayStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShimmerOverlayStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerOverlayStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerOverlayStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerOverlayStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IShimmeredDetailsListStyleProps => Partial[IShimmeredDetailsListStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = {
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
  }
  
}

