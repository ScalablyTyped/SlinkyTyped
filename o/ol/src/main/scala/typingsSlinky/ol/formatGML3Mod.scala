package typingsSlinky.ol

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.formatGML3Mod.GML3
import typingsSlinky.ol.formatGMLBaseMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/GML3", JSImport.Namespace)
@js.native
object formatGML3Mod extends js.Object {
  @js.native
  trait GML3
    extends typingsSlinky.ol.formatGMLBaseMod.default {
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeFeatureElement(node: Element, feature: typingsSlinky.ol.featureMod.default, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typingsSlinky.ol.geomGeometryMod.default, objectStack: js.Array[_]): Unit = js.native
  }
  
  @js.native
  class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
}

