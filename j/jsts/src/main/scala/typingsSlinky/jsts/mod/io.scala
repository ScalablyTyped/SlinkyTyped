package typingsSlinky.jsts.mod

import typingsSlinky.jsts.jsts.geom.GeometryFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("jsts", "io.GeoJSONReader")
  @js.native
  class GeoJSONReader ()
    extends typingsSlinky.jsts.jsts.io.GeoJSONReader
  
  @JSImport("jsts", "io.GeoJSONWriter")
  @js.native
  /**
    * Writes the GeoJSON representation of a {@link Geometry}. The
    * The GeoJSON format is defined <A
    * HREF="http://geojson.org/geojson-spec.html">here</A>.
    * <p>
    * The <code>GeoJSONWriter</code> outputs coordinates rounded to the precision
    * model. Only the maximum number of decimal places necessary to represent the
    * ordinates to the required precision will be output.
    * <p>
    *
    * @see WKTReader
    * @constructor
    */
  class GeoJSONWriter ()
    extends typingsSlinky.jsts.jsts.io.GeoJSONWriter
  
  @JSImport("jsts", "io.OL3Parser")
  @js.native
  class OL3Parser ()
    extends typingsSlinky.jsts.jsts.io.OL3Parser {
    def this(geometryFactory: GeometryFactory) = this()
  }
  
  @JSImport("jsts", "io.WKTReader")
  @js.native
  /**
    * @constructor
    */
  class WKTReader ()
    extends typingsSlinky.jsts.jsts.io.WKTReader {
    def this(geometryFactory: GeometryFactory) = this()
  }
  
  @JSImport("jsts", "io.WKTWriter")
  @js.native
  /**
    * @constructor
    */
  class WKTWriter ()
    extends typingsSlinky.jsts.jsts.io.WKTWriter {
    def this(geometryFactory: GeometryFactory) = this()
  }
}
