package typingsSlinky.atNivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoSankeyMod {
  import org.scalajs.dom.raw.Element
  import slinky.core.TagMod
  import slinky.web.SyntheticMouseEvent

  type AccessorFunc = js.Function1[/* datum */ SankeyNodeDatum, String]
  type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]
  type SankeyMouseHandler = js.Function2[
    /* data */ SankeyNodeDatum | SankeyLinkDatum, 
    /* event */ SyntheticMouseEvent[Element], 
    Unit
  ]
  type SankeySortFunction = js.Function2[/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode, Double]
  type TooltipFormat = js.Function1[/* value */ Double, TagMod[Any]]
  type TooltipRenderer[T] = js.Function1[/* data */ T, TagMod[Any]]
}
