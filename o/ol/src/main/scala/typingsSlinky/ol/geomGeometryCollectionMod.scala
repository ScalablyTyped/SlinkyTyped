package typingsSlinky.ol

import typingsSlinky.ol.geomGeometryCollectionMod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/GeometryCollection", JSImport.Namespace)
@js.native
object geomGeometryCollectionMod extends js.Object {
  @js.native
  trait GeometryCollection
    extends typingsSlinky.ol.geomGeometryMod.default {
    def getGeometries(): js.Array[typingsSlinky.ol.geomGeometryMod.default] = js.native
    def getGeometriesArray(): js.Array[typingsSlinky.ol.geomGeometryMod.default] = js.native
    def isEmpty(): Boolean = js.native
    def setGeometries(geometries: js.Array[typingsSlinky.ol.geomGeometryMod.default]): Unit = js.native
    def setGeometriesArray(geometries: js.Array[typingsSlinky.ol.geomGeometryMod.default]): Unit = js.native
  }
  
  @js.native
  class default () extends GeometryCollection {
    def this(opt_geometries: js.Array[typingsSlinky.ol.geomGeometryMod.default]) = this()
  }
  
}

