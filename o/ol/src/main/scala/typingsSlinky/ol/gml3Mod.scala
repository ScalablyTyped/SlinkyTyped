package typingsSlinky.ol

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.gmlbaseMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gml3Mod {
  
  @JSImport("ol/format/GML3", JSImport.Default)
  @js.native
  class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GML3
    extends typingsSlinky.ol.gmlbaseMod.default {
    
    def curveMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def exteriorParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def interiorParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def readCurve(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.lineStringMod.default] = js.native
    
    def readEnvelope(node: Element, objectStack: js.Array[_]): js.UndefOr[Extent] = js.native
    
    def readFlatPos(node: Node, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readFlatPosList(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readLineStringSegment(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readMultiCurve(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.multiLineStringMod.default] = js.native
    
    def readMultiSurface(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.multiPolygonMod.default] = js.native
    
    def readPatch(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readPolygonPatch(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readSegment(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readSurface(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.polygonMod.default] = js.native
    
    def surfaceMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def writeCurveOrLineString(node: Element, geometry: typingsSlinky.ol.lineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[_]): Unit = js.native
    
    def writeFeatureElement(
      node: Element,
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      objectStack: js.Array[_]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typingsSlinky.ol.geometryMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeLineStringOrCurveMember(node: Node, line: typingsSlinky.ol.lineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
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
}
