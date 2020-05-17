package typingsSlinky.jointjs.mod.dia.Paper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.anon.Radius
import typingsSlinky.jointjs.jointjsStrings.bbox
import typingsSlinky.jointjs.jointjsStrings.bottomLeft
import typingsSlinky.jointjs.jointjsStrings.center
import typingsSlinky.jointjs.jointjsStrings.corner
import typingsSlinky.jointjs.jointjsStrings.origin
import typingsSlinky.jointjs.jointjsStrings.topRight
import typingsSlinky.jointjs.mod.anchors.Anchor
import typingsSlinky.jointjs.mod.anchors.AnchorJSON
import typingsSlinky.jointjs.mod.connectionPoints.ConnectionPoint
import typingsSlinky.jointjs.mod.connectionPoints.ConnectionPointJSON
import typingsSlinky.jointjs.mod.connectionStrategies.ConnectionStrategy
import typingsSlinky.jointjs.mod.connectors.Connector
import typingsSlinky.jointjs.mod.connectors.ConnectorJSON
import typingsSlinky.jointjs.mod.connectors.ConnectorType
import typingsSlinky.jointjs.mod.connectors.GenericConnectorArguments
import typingsSlinky.jointjs.mod.dia.BBox
import typingsSlinky.jointjs.mod.dia.Cell
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.CellView.InteractivityOptions
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.ElementView
import typingsSlinky.jointjs.mod.dia.Event
import typingsSlinky.jointjs.mod.dia.Graph
import typingsSlinky.jointjs.mod.dia.Link
import typingsSlinky.jointjs.mod.dia.LinkEnd
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.LinkView.GetConnectionPoint
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.g.Line
import typingsSlinky.jointjs.mod.g.Path
import typingsSlinky.jointjs.mod.highlighters.HighlighterJSON
import typingsSlinky.jointjs.mod.mvc.View
import typingsSlinky.jointjs.mod.mvc.ViewOptions
import typingsSlinky.jointjs.mod.routers.GenericRouterArguments
import typingsSlinky.jointjs.mod.routers.Router
import typingsSlinky.jointjs.mod.routers.RouterJSON
import typingsSlinky.jointjs.mod.routers.RouterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ViewOptions[Graph] {
  var allowLink: js.UndefOr[
    (js.Function2[/* linkView */ LinkView, /* paper */ typingsSlinky.jointjs.mod.dia.Paper, Boolean]) | Null
  ] = js.native
  var anchorNamespace: js.UndefOr[js.Any] = js.native
  // rendering
  var async: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[BackgroundOptions] = js.native
  // default views, models & attributes
  var cellViewNamespace: js.UndefOr[js.Any] = js.native
  var clickThreshold: js.UndefOr[Double] = js.native
  var connectionPointNamespace: js.UndefOr[js.Any] = js.native
  // connecting
  var connectionStrategy: js.UndefOr[ConnectionStrategy] = js.native
  var defaultAnchor: js.UndefOr[AnchorJSON | Anchor] = js.native
  var defaultConnectionPoint: js.UndefOr[
    ConnectionPointJSON | ConnectionPoint | (js.Function1[/* repeated */ js.Any, ConnectionPoint])
  ] = js.native
  var defaultConnector: js.UndefOr[Connector | ConnectorJSON] = js.native
  var defaultLink: js.UndefOr[(js.Function2[/* cellView */ CellView, /* magnet */ SVGElement, Link]) | Link] = js.native
  var defaultLinkAnchor: js.UndefOr[AnchorJSON | Anchor] = js.native
  var defaultRouter: js.UndefOr[Router | RouterJSON] = js.native
  var drawGrid: js.UndefOr[Boolean | GridOptions | js.Array[GridOptions]] = js.native
  // views
  var elementView: js.UndefOr[
    Instantiable0[ElementView] | (js.Function1[/* element */ Element, Instantiable0[ElementView]])
  ] = js.native
  // embedding
  var embeddingMode: js.UndefOr[Boolean] = js.native
  var findParentBy: js.UndefOr[bbox | center | origin | corner | topRight | bottomLeft] = js.native
  var frozen: js.UndefOr[Boolean] = js.native
  // interactions
  var gridSize: js.UndefOr[Double] = js.native
  // events
  var guard: js.UndefOr[js.Function2[/* evt */ Event, /* view */ CellView, Boolean]] = js.native
  var height: js.UndefOr[Dimension] = js.native
  var highlighterNamespace: js.UndefOr[js.Any] = js.native
  var highlighting: js.UndefOr[StringDictionary[HighlighterJSON]] = js.native
  var interactive: js.UndefOr[
    (js.Function2[/* cellView */ CellView, /* event */ String, Boolean | InteractivityOptions]) | Boolean | InteractivityOptions
  ] = js.native
  var linkAnchorNamespace: js.UndefOr[js.Any] = js.native
  var linkConnectionPoint: js.UndefOr[GetConnectionPoint] = js.native
  var linkPinning: js.UndefOr[Boolean] = js.native
  var linkView: js.UndefOr[
    Instantiable0[LinkView] | (js.Function1[/* link */ Link, Instantiable0[LinkView]])
  ] = js.native
  var magnetThreshold: js.UndefOr[Double | String] = js.native
  var markAvailable: js.UndefOr[Boolean] = js.native
  var moveThreshold: js.UndefOr[Double] = js.native
  var multiLinks: js.UndefOr[Boolean] = js.native
  var onViewPostponed: js.UndefOr[
    js.Function3[
      /* view */ View[_], 
      /* flag */ Double, 
      /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
      Boolean
    ]
  ] = js.native
  var onViewUpdate: js.UndefOr[
    js.Function4[
      /* view */ View[_], 
      /* flag */ Double, 
      /* opt */ StringDictionary[js.Any], 
      /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
      Unit
    ]
  ] = js.native
  var origin: js.UndefOr[Point] = js.native
  var perpendicularLinks: js.UndefOr[Boolean] = js.native
  var preventContextMenu: js.UndefOr[Boolean] = js.native
  var preventDefaultBlankAction: js.UndefOr[Boolean] = js.native
  var restrictTranslate: js.UndefOr[(js.Function1[/* elementView */ ElementView, BBox]) | Boolean] = js.native
  var snapLinks: js.UndefOr[Boolean | Radius] = js.native
  var sorting: js.UndefOr[typingsSlinky.jointjs.mod.dia.Paper.sorting] = js.native
  var validateConnection: js.UndefOr[
    js.Function6[
      /* cellViewS */ CellView, 
      /* magnetS */ SVGElement, 
      /* cellViewT */ CellView, 
      /* magnetT */ SVGElement, 
      /* end */ LinkEnd, 
      /* linkView */ LinkView, 
      Boolean
    ]
  ] = js.native
  var validateEmbedding: js.UndefOr[js.Function2[/* childView */ ElementView, /* parentView */ ElementView, Boolean]] = js.native
  // validations
  var validateMagnet: js.UndefOr[
    js.Function3[/* cellView */ CellView, /* magnet */ SVGElement, /* evt */ Event, Boolean]
  ] = js.native
  var viewport: js.UndefOr[ViewportCallback | Null] = js.native
  // appearance
  var width: js.UndefOr[Dimension] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLink(value: (/* linkView */ LinkView, /* paper */ typingsSlinky.jointjs.mod.dia.Paper) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAllowLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLink")(null)
        ret
    }
    @scala.inline
    def withAnchorNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: BackgroundOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCellViewNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellViewNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellViewNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellViewNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionPointNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPointNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionPointNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPointNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionStrategy(
      value: (/* endDefinition */ Cell, /* endView */ CellView, /* endMagnet */ SVGElement, /* coords */ Point) => Element
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionStrategy")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutConnectionStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAnchorFunction4(
      value: (/* endView */ CellView, /* endMagnet */ SVGElement, /* anchorReference */ typingsSlinky.jointjs.mod.g.Point | SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any) => typingsSlinky.jointjs.mod.g.Point
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAnchor")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefaultAnchor(value: AnchorJSON | Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultConnectionPointFunction1(value: /* repeated */ js.Any => ConnectionPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnectionPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultConnectionPointFunction4(
      value: (/* endPathSegmentLine */ Line, /* endView */ CellView, /* endMagnet */ SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any) => typingsSlinky.jointjs.mod.g.Point
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnectionPoint")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefaultConnectionPoint(
      value: ConnectionPointJSON | ConnectionPoint | (js.Function1[/* repeated */ js.Any, ConnectionPoint])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnectionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultConnectionPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnectionPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultConnectorFunction4(
      value: (/* sourcePoint */ Point, /* targetPoint */ Point, /* routePoints */ js.Array[Point], /* args */ js.UndefOr[GenericConnectorArguments[ConnectorType]]) => String | Path
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnector")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefaultConnector(value: Connector | ConnectorJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConnector")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLinkFunction2(value: (/* cellView */ CellView, /* magnet */ SVGElement) => Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefaultLink(value: (js.Function2[/* cellView */ CellView, /* magnet */ SVGElement, Link]) | Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLink")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLinkAnchorFunction4(
      value: (/* endView */ CellView, /* endMagnet */ SVGElement, /* anchorReference */ typingsSlinky.jointjs.mod.g.Point | SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any) => typingsSlinky.jointjs.mod.g.Point
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkAnchor")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefaultLinkAnchor(value: AnchorJSON | Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLinkAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouterFunction3(
      value: (/* vertices */ js.Array[Point], /* args */ js.UndefOr[GenericRouterArguments[RouterType]], /* linkView */ js.UndefOr[LinkView]) => js.Array[Point]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDefaultRouter(value: Router | RouterJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouter")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawGrid(value: Boolean | GridOptions | js.Array[GridOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withElementViewFunction1(value: /* element */ Element => Instantiable0[ElementView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElementView(
      value: Instantiable0[ElementView] | (js.Function1[/* element */ Element, Instantiable0[ElementView]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementView")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddingMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParentBy(value: bbox | center | origin | corner | topRight | bottomLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindParentBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGuard(value: (/* evt */ Event, /* view */ CellView) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGuard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(null)
        ret
    }
    @scala.inline
    def withHighlighterNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighterNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlighterNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighterNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlighting(value: StringDictionary[HighlighterJSON]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighting")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractiveFunction2(value: (/* cellView */ CellView, /* event */ String) => Boolean | InteractivityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInteractive(
      value: (js.Function2[/* cellView */ CellView, /* event */ String, Boolean | InteractivityOptions]) | Boolean | InteractivityOptions
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkAnchorNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAnchorNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkAnchorNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAnchorNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkConnectionPoint(
      value: (/* linkView */ LinkView, /* view */ ElementView, /* magnet */ SVGElement, /* reference */ Point, /* end */ LinkEnd) => Point
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkConnectionPoint")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutLinkConnectionPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkConnectionPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkPinning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkPinning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkPinning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkPinning")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkViewFunction1(value: /* link */ Link => Instantiable0[LinkView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinkView(value: Instantiable0[LinkView] | (js.Function1[/* link */ Link, Instantiable0[LinkView]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkView")(js.undefined)
        ret
    }
    @scala.inline
    def withMagnetThreshold(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnetThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnetThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnetThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewPostponed(
      value: (/* view */ View[_], /* flag */ Double, /* paper */ typingsSlinky.jointjs.mod.dia.Paper) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewPostponed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnViewPostponed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewPostponed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewUpdate(
      value: (/* view */ View[_], /* flag */ Double, /* opt */ StringDictionary[js.Any], /* paper */ typingsSlinky.jointjs.mod.dia.Paper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewUpdate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnViewUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPerpendicularLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perpendicularLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerpendicularLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perpendicularLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultBlankAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultBlankAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultBlankAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultBlankAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictTranslateFunction1(value: /* elementView */ ElementView => BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictTranslate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestrictTranslate(value: (js.Function1[/* elementView */ ElementView, BBox]) | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictTranslate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapLinks(value: Boolean | Radius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: sorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateConnection(
      value: (/* cellViewS */ CellView, /* magnetS */ SVGElement, /* cellViewT */ CellView, /* magnetT */ SVGElement, /* end */ LinkEnd, /* linkView */ LinkView) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateConnection")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutValidateConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateEmbedding(value: (/* childView */ ElementView, /* parentView */ ElementView) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateEmbedding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidateEmbedding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateEmbedding")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateMagnet(value: (/* cellView */ CellView, /* magnet */ SVGElement, /* evt */ Event) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMagnet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutValidateMagnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMagnet")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(
      value: (/* view */ View[js.Any], /* isDetached */ Boolean, /* paper */ typingsSlinky.jointjs.mod.dia.Paper) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(null)
        ret
    }
    @scala.inline
    def withWidth(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(null)
        ret
    }
  }
  
}

