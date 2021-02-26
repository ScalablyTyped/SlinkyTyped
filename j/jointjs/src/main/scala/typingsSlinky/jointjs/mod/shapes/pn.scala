package typingsSlinky.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Element.GenericAttributes
import typingsSlinky.jointjs.mod.dia.ElementView
import typingsSlinky.jointjs.mod.dia.Graph.Options
import typingsSlinky.jointjs.mod.dia.Link.Attributes
import typingsSlinky.jointjs.mod.shapes.basic.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pn {
  
  @JSImport("jointjs", "shapes.pn.Link")
  @js.native
  // default label props
  class Link ()
    extends typingsSlinky.jointjs.mod.dia.Link {
    def this(attributes: Attributes) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.pn.Place")
  @js.native
  class Place () extends Generic {
    def this(attributes: typingsSlinky.jointjs.mod.dia.Element.Attributes) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: typingsSlinky.jointjs.mod.dia.Element.Attributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.pn.PlaceView")
  @js.native
  class PlaceView () extends ElementView {
    def this(opt: typingsSlinky.jointjs.mod.dia.CellView.Options[Element]) = this()
    
    def renderTokens(): Unit = js.native
  }
  
  @JSImport("jointjs", "shapes.pn.Transition")
  @js.native
  class Transition () extends Generic {
    def this(attributes: GenericAttributes[SVGRectSelector]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[SVGRectSelector], opt: StringDictionary[js.Any]) = this()
  }
}
