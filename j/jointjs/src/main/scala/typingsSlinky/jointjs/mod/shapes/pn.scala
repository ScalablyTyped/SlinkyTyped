package typingsSlinky.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Element.Attributes
import typingsSlinky.jointjs.mod.dia.Element.GenericAttributes
import typingsSlinky.jointjs.mod.dia.ElementView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "shapes.pn")
@js.native
object pn extends js.Object {
  @js.native
  class Link ()
    extends typingsSlinky.jointjs.mod.dia.Link
  
  @js.native
  class Place () extends Element {
    def this(attributes: Attributes) = this()
    def this(attributes: Attributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class PlaceView () extends ElementView {
    def renderTokens(): Unit = js.native
  }
  
  @js.native
  class Transition () extends Element {
    def this(attributes: GenericAttributes[SVGRectSelector]) = this()
    def this(attributes: GenericAttributes[SVGRectSelector], opt: StringDictionary[js.Any]) = this()
  }
  
}

