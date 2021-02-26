package typingsSlinky.proj4

import typingsSlinky.proj4.proj4Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  def apply(fromProjection: String): Converter = js.native
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  def apply(fromProjection: String, toProjection: String): Converter = js.native
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  
  @JSImport("proj4", "Point")
  @js.native
  def Point(coordinates: String): InterfaceCoordinates = js.native
  @JSImport("proj4", "Point")
  @js.native
  def Point(coordinates: TemplateCoordinates): InterfaceCoordinates = js.native
  /**
    * @deprecated v3
    */
  @JSImport("proj4", "Point")
  @js.native
  def Point(x: Double, y: Double): InterfaceCoordinates = js.native
  @JSImport("proj4", "Point")
  @js.native
  def Point(x: Double, y: Double, z: Double): InterfaceCoordinates = js.native
  
  @JSImport("proj4", "Proj")
  @js.native
  def Proj(srsCode: js.Any): InterfaceProjection = js.native
  @JSImport("proj4", "Proj")
  @js.native
  def Proj(srsCode: js.Any, callback: js.Any): InterfaceProjection = js.native
  
  @JSImport("proj4", "WGS84")
  @js.native
  val WGS84: js.Any = js.native
  
  @JSImport("proj4", "defaultDatum")
  @js.native
  val defaultDatum: String = js.native
  
  @JSImport("proj4", "defs")
  @js.native
  def defs(name: String): ProjectionDefinition = js.native
  @JSImport("proj4", "defs")
  @js.native
  def defs(name: String, projection: String): Unit = js.native
  @JSImport("proj4", "defs")
  @js.native
  def defs(name: String, projection: ProjectionDefinition): Unit = js.native
  @JSImport("proj4", "defs")
  @js.native
  def defs(name: js.Array[js.Array[String]]): js.Array[js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("proj4", "mgrs")
  @js.native
  def mgrs(coordinates: js.Array[Double], accuracy: Double): String = js.native
  
  @JSImport("proj4", "toPoint")
  @js.native
  def toPoint(array: js.Array[Double]): InterfaceCoordinates = js.native
  
  @JSImport("proj4", "transform")
  @js.native
  def transform(source: InterfaceProjection, dest: InterfaceProjection, point: TemplateCoordinates): js.Any = js.native
  
  @JSImport("proj4", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait Converter extends StObject {
    
    def forward(coordinates: js.Array[Double]): js.Array[Double] = js.native
    def forward(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
    
    def inverse(coordinates: js.Array[Double]): js.Array[Double] = js.native
    def inverse(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  }
  
  @js.native
  trait InterfaceCoordinates extends StObject {
    
    var m: js.UndefOr[Double] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: js.UndefOr[Double] = js.native
  }
  object InterfaceCoordinates {
    
    @scala.inline
    def apply(x: Double, y: Double): InterfaceCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceCoordinates]
    }
    
    @scala.inline
    implicit class InterfaceCoordinatesMutableBuilder[Self <: InterfaceCoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  @js.native
  trait InterfaceDatum extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var datum_type: Double = js.native
    
    var ep2: Double = js.native
    
    var es: Double = js.native
  }
  object InterfaceDatum {
    
    @scala.inline
    def apply(a: Double, b: Double, datum_type: Double, ep2: Double, es: Double): InterfaceDatum = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], datum_type = datum_type.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceDatum]
    }
    
    @scala.inline
    implicit class InterfaceDatumMutableBuilder[Self <: InterfaceDatum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum_type(value: Double): Self = StObject.set(x, "datum_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEp2(value: Double): Self = StObject.set(x, "ep2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEs(value: Double): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InterfaceProjection extends StObject {
    
    var b: Double = js.native
    
    var datum: String = js.native
    
    var e: Double = js.native
    
    var ep2: Double = js.native
    
    var es: Double = js.native
    
    def forward(coordinates: TemplateCoordinates): js.Array[Double] = js.native
    
    def inverse(coordinates: TemplateCoordinates): js.Array[Double] = js.native
    
    var rf: Double = js.native
    
    var sphere: Double = js.native
  }
  object InterfaceProjection {
    
    @scala.inline
    def apply(
      b: Double,
      datum: String,
      e: Double,
      ep2: Double,
      es: Double,
      forward: TemplateCoordinates => js.Array[Double],
      inverse: TemplateCoordinates => js.Array[Double],
      rf: Double,
      sphere: Double
    ): InterfaceProjection = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), rf = rf.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceProjection]
    }
    
    @scala.inline
    implicit class InterfaceProjectionMutableBuilder[Self <: InterfaceProjection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: String): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEp2(value: Double): Self = StObject.set(x, "ep2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEs(value: Double): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForward(value: TemplateCoordinates => js.Array[Double]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInverse(value: TemplateCoordinates => js.Array[Double]): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRf(value: Double): Self = StObject.set(x, "rf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphere(value: Double): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectionDefinition extends StObject {
    
    var R_A: js.UndefOr[`true`] = js.native
    
    var a: js.UndefOr[Double] = js.native
    
    var alpha: js.UndefOr[Double] = js.native
    
    var axis: js.UndefOr[String] = js.native
    
    var b: js.UndefOr[Double] = js.native
    
    var datum: js.UndefOr[String] = js.native
    
    var datumCode: js.UndefOr[String] = js.native
    
    var datumName: js.UndefOr[String] = js.native
    
    var datum_params: js.UndefOr[String | js.Array[Double]] = js.native
    
    var ellps: js.UndefOr[String] = js.native
    
    var from_greenwich: js.UndefOr[Double] = js.native
    
    var k0: js.UndefOr[Double] = js.native
    
    var lat0: js.UndefOr[Double] = js.native
    
    var lat1: js.UndefOr[Double] = js.native
    
    var lat2: js.UndefOr[Double] = js.native
    
    var lat_ts: js.UndefOr[Double] = js.native
    
    var long0: js.UndefOr[Double] = js.native
    
    var long1: js.UndefOr[Double] = js.native
    
    var long2: js.UndefOr[Double] = js.native
    
    var longc: js.UndefOr[Double] = js.native
    
    var natGrids: js.UndefOr[String] = js.native
    
    var projName: js.UndefOr[String] = js.native
    
    var rf: js.UndefOr[Double] = js.native
    
    var title: String = js.native
    
    var to_meter: js.UndefOr[Double] = js.native
    
    var units: js.UndefOr[String] = js.native
    
    var utmSouth: js.UndefOr[`true`] = js.native
    
    var x0: js.UndefOr[Double] = js.native
    
    var y0: js.UndefOr[Double] = js.native
    
    var zone: js.UndefOr[Double] = js.native
  }
  object ProjectionDefinition {
    
    @scala.inline
    def apply(title: String): ProjectionDefinition = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectionDefinition]
    }
    
    @scala.inline
    implicit class ProjectionDefinitionMutableBuilder[Self <: ProjectionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setDatum(value: String): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumCode(value: String): Self = StObject.set(x, "datumCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumCodeUndefined: Self = StObject.set(x, "datumCode", js.undefined)
      
      @scala.inline
      def setDatumName(value: String): Self = StObject.set(x, "datumName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumNameUndefined: Self = StObject.set(x, "datumName", js.undefined)
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setDatum_params(value: String | js.Array[Double]): Self = StObject.set(x, "datum_params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum_paramsUndefined: Self = StObject.set(x, "datum_params", js.undefined)
      
      @scala.inline
      def setDatum_paramsVarargs(value: Double*): Self = StObject.set(x, "datum_params", js.Array(value :_*))
      
      @scala.inline
      def setEllps(value: String): Self = StObject.set(x, "ellps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllpsUndefined: Self = StObject.set(x, "ellps", js.undefined)
      
      @scala.inline
      def setFrom_greenwich(value: Double): Self = StObject.set(x, "from_greenwich", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_greenwichUndefined: Self = StObject.set(x, "from_greenwich", js.undefined)
      
      @scala.inline
      def setK0(value: Double): Self = StObject.set(x, "k0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK0Undefined: Self = StObject.set(x, "k0", js.undefined)
      
      @scala.inline
      def setLat0(value: Double): Self = StObject.set(x, "lat0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat0Undefined: Self = StObject.set(x, "lat0", js.undefined)
      
      @scala.inline
      def setLat1(value: Double): Self = StObject.set(x, "lat1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat1Undefined: Self = StObject.set(x, "lat1", js.undefined)
      
      @scala.inline
      def setLat2(value: Double): Self = StObject.set(x, "lat2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat2Undefined: Self = StObject.set(x, "lat2", js.undefined)
      
      @scala.inline
      def setLat_ts(value: Double): Self = StObject.set(x, "lat_ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat_tsUndefined: Self = StObject.set(x, "lat_ts", js.undefined)
      
      @scala.inline
      def setLong0(value: Double): Self = StObject.set(x, "long0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong0Undefined: Self = StObject.set(x, "long0", js.undefined)
      
      @scala.inline
      def setLong1(value: Double): Self = StObject.set(x, "long1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong1Undefined: Self = StObject.set(x, "long1", js.undefined)
      
      @scala.inline
      def setLong2(value: Double): Self = StObject.set(x, "long2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong2Undefined: Self = StObject.set(x, "long2", js.undefined)
      
      @scala.inline
      def setLongc(value: Double): Self = StObject.set(x, "longc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongcUndefined: Self = StObject.set(x, "longc", js.undefined)
      
      @scala.inline
      def setNatGrids(value: String): Self = StObject.set(x, "natGrids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNatGridsUndefined: Self = StObject.set(x, "natGrids", js.undefined)
      
      @scala.inline
      def setProjName(value: String): Self = StObject.set(x, "projName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjNameUndefined: Self = StObject.set(x, "projName", js.undefined)
      
      @scala.inline
      def setR_A(value: `true`): Self = StObject.set(x, "R_A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR_AUndefined: Self = StObject.set(x, "R_A", js.undefined)
      
      @scala.inline
      def setRf(value: Double): Self = StObject.set(x, "rf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRfUndefined: Self = StObject.set(x, "rf", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_meter(value: Double): Self = StObject.set(x, "to_meter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_meterUndefined: Self = StObject.set(x, "to_meter", js.undefined)
      
      @scala.inline
      def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setUtmSouth(value: `true`): Self = StObject.set(x, "utmSouth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtmSouthUndefined: Self = StObject.set(x, "utmSouth", js.undefined)
      
      @scala.inline
      def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      @scala.inline
      def setZone(value: Double): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  type TemplateCoordinates = js.Array[Double] | InterfaceCoordinates
}
