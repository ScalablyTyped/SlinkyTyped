package typingsSlinky.jointjs.mod.dia.Link

import typingsSlinky.jointjs.mod.connectors.Connector
import typingsSlinky.jointjs.mod.connectors.ConnectorJSON
import typingsSlinky.jointjs.mod.connectors.ConnectorType
import typingsSlinky.jointjs.mod.connectors.GenericConnectorArguments
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.g.Path
import typingsSlinky.jointjs.mod.routers.GenericRouterArguments
import typingsSlinky.jointjs.mod.routers.Router
import typingsSlinky.jointjs.mod.routers.RouterJSON
import typingsSlinky.jointjs.mod.routers.RouterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericAttributes[T]
  extends typingsSlinky.jointjs.mod.dia.Cell.GenericAttributes[T] {
  var connector: js.UndefOr[Connector | ConnectorJSON] = js.native
  var labels: js.UndefOr[js.Array[Label]] = js.native
  var manhattan: js.UndefOr[Boolean] = js.native
  var router: js.UndefOr[Router | RouterJSON] = js.native
  var smooth: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[EndJSON] = js.native
  var target: js.UndefOr[EndJSON] = js.native
  var vertices: js.UndefOr[js.Array[Point]] = js.native
}

object GenericAttributes {
  @scala.inline
  def apply[T](): GenericAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttributes[T]]
  }
  @scala.inline
  implicit class GenericAttributesOps[Self[t] <: GenericAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConnectorFunction4(
      value: (/* sourcePoint */ Point, /* targetPoint */ Point, /* routePoints */ js.Array[Point], /* args */ js.UndefOr[GenericConnectorArguments[ConnectorType]]) => String | Path
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withConnector(value: Connector | ConnectorJSON): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[Label]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withManhattan(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manhattan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManhattan: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manhattan")(js.undefined)
        ret
    }
    @scala.inline
    def withRouterFunction3(
      value: (/* vertices */ js.Array[Point], /* args */ js.UndefOr[GenericRouterArguments[RouterType]], /* linkView */ js.UndefOr[LinkView]) => js.Array[Point]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRouter(value: Router | RouterJSON): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: EndJSON): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: EndJSON): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Point]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertices: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(js.undefined)
        ret
    }
  }
  
}

