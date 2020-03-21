package typingsSlinky.reactSimpleMaps.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.std.Record
import typingsSlinky.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesProps extends SVGAttributes[SVGGElement] {
  @JSName("children")
  var children_GeographiesProps: js.UndefOr[js.Function1[/* data */ GeographiesChildrenArgument, Unit]] = js.undefined
  var geography: js.UndefOr[String | (Record[String, _]) | js.Array[String]] = js.undefined
  var parseGeographies: js.UndefOr[js.Function1[/* features */ js.Array[Feature[_, _]], js.Array[Feature[_, _]]]] = js.undefined
}

object GeographiesProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[org.scalajs.dom.raw.SVGGElement] = null,
    children: /* data */ GeographiesChildrenArgument => Unit = null,
    geography: String | (Record[String, _]) | js.Array[String] = null,
    parseGeographies: /* features */ js.Array[Feature[_, _]] => js.Array[Feature[_, _]] = null
  ): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (parseGeographies != null) __obj.updateDynamic("parseGeographies")(js.Any.fromFunction1(parseGeographies))
    __obj.asInstanceOf[GeographiesProps]
  }
}

