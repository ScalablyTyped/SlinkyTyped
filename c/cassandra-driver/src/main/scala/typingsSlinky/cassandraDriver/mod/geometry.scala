package typingsSlinky.cassandraDriver.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSImport("cassandra-driver", "geometry.LineString")
  @js.native
  class LineString protected ()
    extends typingsSlinky.cassandraDriver.geometryMod.geometry.LineString {
    def this(args: typingsSlinky.cassandraDriver.geometryMod.geometry.Point*) = this()
  }
  object LineString {
    
    /* static member */
    @JSImport("cassandra-driver", "geometry.LineString.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.geometryMod.geometry.LineString = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "geometry.LineString.fromString")
    @js.native
    def fromString(textValue: String): typingsSlinky.cassandraDriver.geometryMod.geometry.LineString = js.native
  }
  
  @JSImport("cassandra-driver", "geometry.Point")
  @js.native
  class Point protected ()
    extends typingsSlinky.cassandraDriver.geometryMod.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    /* static member */
    @JSImport("cassandra-driver", "geometry.Point.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.geometryMod.geometry.Point = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "geometry.Point.fromString")
    @js.native
    def fromString(textValue: String): typingsSlinky.cassandraDriver.geometryMod.geometry.Point = js.native
  }
  
  @JSImport("cassandra-driver", "geometry.Polygon")
  @js.native
  class Polygon protected ()
    extends typingsSlinky.cassandraDriver.geometryMod.geometry.Polygon {
    def this(args: typingsSlinky.cassandraDriver.geometryMod.geometry.Point*) = this()
  }
  object Polygon {
    
    /* static member */
    @JSImport("cassandra-driver", "geometry.Polygon.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.geometryMod.geometry.Polygon = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "geometry.Polygon.fromString")
    @js.native
    def fromString(textValue: String): typingsSlinky.cassandraDriver.geometryMod.geometry.Polygon = js.native
  }
}
