package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.featureMod.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmlbaseMod {
  
  @JSImport("ol/format/GMLBase", JSImport.Default)
  @js.native
  abstract class default () extends GMLBase {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/format/GMLBase", "GMLNS")
  @js.native
  val GMLNS: String = js.native
  
  @js.native
  trait GMLBase
    extends typingsSlinky.ol.xmlfeatureMod.default {
    
    var featureNS: StringDictionary[String] | String = js.native
    
    var featureType: js.Array[String] | String = js.native
    
    def lineStringMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def pointMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def polygonMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def readFeatureElement(node: Element, objectStack: js.Array[_]): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    def readFeatureElementInternal(node: Element, objectStack: js.Array[_], asFeature: Boolean): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] | js.Object = js.native
    
    def readFeaturesInternal(node: Element, objectStack: js.Array[_]): js.UndefOr[
        js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ] = js.native
    
    def readFlatCoordinatesFromNode(node: Element, objectStack: js.Array[_]): js.Array[Double] = js.native
    
    def readFlatLinearRing(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readGeometryElement(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.geometryMod.default | Extent] = js.native
    
    @JSName("readGeometryFromNode")
    /* protected */ def readGeometryFromNode_default(node: Element): typingsSlinky.ol.geometryMod.default = js.native
    @JSName("readGeometryFromNode")
    /* protected */ def readGeometryFromNode_default(node: Element, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    
    def readLineString(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.lineStringMod.default] = js.native
    
    def readLinearRing(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.linearRingMod.default] = js.native
    
    def readMultiLineString(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.multiLineStringMod.default] = js.native
    
    def readMultiPoint(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.multiPointMod.default] = js.native
    
    def readMultiPolygon(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.multiPolygonMod.default] = js.native
    
    def readPoint(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.pointMod.default] = js.native
    
    def readPolygon(node: Element, objectStack: js.Array[_]): js.UndefOr[typingsSlinky.ol.polygonMod.default] = js.native
    
    var schemaLocation: String = js.native
    
    var srsName: String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var curve: js.UndefOr[Boolean] = js.native
    
    var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
    
    var featureType: js.UndefOr[js.Array[String] | String] = js.native
    
    var hasZ: js.UndefOr[Boolean] = js.native
    
    var multiCurve: js.UndefOr[Boolean] = js.native
    
    var multiSurface: js.UndefOr[Boolean] = js.native
    
    var schemaLocation: js.UndefOr[String] = js.native
    
    var srsName: String = js.native
    
    var surface: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(srsName: String): Options = {
      val __obj = js.Dynamic.literal(srsName = srsName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurve(value: Boolean): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      @scala.inline
      def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
      
      @scala.inline
      def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
      
      @scala.inline
      def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value :_*))
      
      @scala.inline
      def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      @scala.inline
      def setMultiCurve(value: Boolean): Self = StObject.set(x, "multiCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiCurveUndefined: Self = StObject.set(x, "multiCurve", js.undefined)
      
      @scala.inline
      def setMultiSurface(value: Boolean): Self = StObject.set(x, "multiSurface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSurfaceUndefined: Self = StObject.set(x, "multiSurface", js.undefined)
      
      @scala.inline
      def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
      
      @scala.inline
      def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurface(value: Boolean): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
    }
  }
}
