package typingsSlinky.ol

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.gmlbaseMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/GML2", JSImport.Namespace)
@js.native
object gml2Mod extends js.Object {
  
  @js.native
  trait GML2
    extends typingsSlinky.ol.gmlbaseMod.default {
    
    def writeFeatureElement(
      node: Element,
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      objectStack: js.Array[_]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typingsSlinky.ol.geometryMod.default, objectStack: js.Array[_]): Unit = js.native
  }
  
  @js.native
  class default () extends GML2 {
    def this(opt_options: Options) = this()
  }
}
