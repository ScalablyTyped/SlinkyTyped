package typingsSlinky.jointjs.mod.routers

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var manhattan: ManhattanRouterArguments = js.native
  var metro: ManhattanRouterArguments = js.native
  var normal: NormalRouterArguments = js.native
  var oneSide: OneSideRouterArguments = js.native
  var orthogonal: OrthogonalRouterArguments = js.native
}

object RouterArgumentsMap {
  @scala.inline
  def apply(
    manhattan: ManhattanRouterArguments,
    metro: ManhattanRouterArguments,
    normal: NormalRouterArguments,
    oneSide: OneSideRouterArguments,
    orthogonal: OrthogonalRouterArguments
  ): RouterArgumentsMap = {
    val __obj = js.Dynamic.literal(manhattan = manhattan.asInstanceOf[js.Any], metro = metro.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], oneSide = oneSide.asInstanceOf[js.Any], orthogonal = orthogonal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterArgumentsMap]
  }
  @scala.inline
  implicit class RouterArgumentsMapOps[Self <: RouterArgumentsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManhattan(value: ManhattanRouterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manhattan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetro(value: ManhattanRouterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: NormalRouterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneSide(value: OneSideRouterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrthogonal(value: OrthogonalRouterArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orthogonal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

