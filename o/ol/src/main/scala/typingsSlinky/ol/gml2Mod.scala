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
    
    def innerBoundaryIsParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def outerBoundaryIsParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def readBox(node: Element, objectStack: js.Array[_]): js.UndefOr[Extent] = js.native
    
    def readFlatCoordinates(node: Node, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def writeCurveOrLineString(node: Element, geometry: typingsSlinky.ol.lineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[_]): Unit = js.native
    
    def writeFeatureElement(
      node: Element,
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      objectStack: js.Array[_]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typingsSlinky.ol.geometryMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeLineStringOrCurveMember(node: Element, line: typingsSlinky.ol.lineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeLinearRing(node: Element, geometry: typingsSlinky.ol.linearRingMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeMultiCurveOrLineString(node: Element, geometry: typingsSlinky.ol.multiLineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeMultiPoint(node: Element, geometry: typingsSlinky.ol.multiPointMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeMultiSurfaceOrPolygon(node: Element, geometry: typingsSlinky.ol.multiPolygonMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writePoint(node: Element, geometry: typingsSlinky.ol.pointMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writePointMember(node: Node, point: typingsSlinky.ol.pointMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeRing(node: Node, ring: typingsSlinky.ol.linearRingMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeSurfaceOrPolygon(node: Element, geometry: typingsSlinky.ol.polygonMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeSurfaceOrPolygonMember(node: Node, polygon: typingsSlinky.ol.polygonMod.default, objectStack: js.Array[_]): Unit = js.native
  }
  
  @js.native
  class default () extends GML2 {
    def this(opt_options: Options) = this()
  }
}
