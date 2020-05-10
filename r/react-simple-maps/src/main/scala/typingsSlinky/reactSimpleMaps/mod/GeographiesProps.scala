package typingsSlinky.reactSimpleMaps.mod

import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographiesProps extends SVGAttributes[SVGGElement] {
  @JSName("children")
  var children_GeographiesProps: js.UndefOr[js.Function1[/* data */ GeographiesChildrenArgument, Unit]] = js.native
  var geography: js.UndefOr[String | (Record[String, _]) | js.Array[String]] = js.native
  var parseGeographies: js.UndefOr[js.Function1[/* features */ js.Array[Feature[_, _]], js.Array[Feature[_, _]]]] = js.native
}

object GeographiesProps {
  @scala.inline
  def apply(): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeographiesProps]
  }
  @scala.inline
  implicit class GeographiesPropsOps[Self <: GeographiesProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* data */ GeographiesChildrenArgument => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withGeography(value: String | (Record[String, _]) | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geography")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeography: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geography")(js.undefined)
        ret
    }
    @scala.inline
    def withParseGeographies(value: /* features */ js.Array[Feature[_, _]] => js.Array[Feature[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseGeographies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseGeographies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseGeographies")(js.undefined)
        ret
    }
  }
  
}

