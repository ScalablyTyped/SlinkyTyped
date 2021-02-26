package typingsSlinky.kdbush

import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.Float32ArrayConstructor
import typingsSlinky.std.Float64ArrayConstructor
import typingsSlinky.std.Int16ArrayConstructor
import typingsSlinky.std.Int32ArrayConstructor
import typingsSlinky.std.Int8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kdbush", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends KDBush[T] {
    def this(points: Points) = this()
    def this(points: js.Array[T], getX: Get[T], getY: Get[T]) = this()
    def this(points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double) = this()
    def this(
      points: js.Array[T],
      getX: Get[T],
      getY: Get[T],
      nodeSize: js.UndefOr[scala.Nothing],
      ArrayType: typingsSlinky.kdbush.mod.ArrayType
    ) = this()
    def this(
      points: js.Array[T],
      getX: Get[T],
      getY: Get[T],
      nodeSize: Double,
      ArrayType: typingsSlinky.kdbush.mod.ArrayType
    ) = this()
  }
  
  type ArrayType = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor | ArrayConstructor
  
  type Get[T] = js.Function1[/* point */ T, Double]
  
  @js.native
  trait KDBush[T] extends StObject {
    
    var coords: js.Array[Double] = js.native
    
    var ids: js.Array[Double] = js.native
    
    var nodeSize: Double = js.native
    
    var points: js.Array[T] = js.native
    
    def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
    
    def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
  }
  object KDBush {
    
    @scala.inline
    def apply[T](
      coords: js.Array[Double],
      ids: js.Array[Double],
      nodeSize: Double,
      points: js.Array[T],
      range: (Double, Double, Double, Double) => js.Array[Double],
      within: (Double, Double, Double) => js.Array[Double]
    ): KDBush[T] = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
      __obj.asInstanceOf[KDBush[T]]
    }
    
    @scala.inline
    implicit class KDBushMutableBuilder[Self <: KDBush[_], T] (val x: Self with KDBush[T]) extends AnyVal {
      
      @scala.inline
      def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value :_*))
      
      @scala.inline
      def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setNodeSize(value: Double): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: js.Array[T]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: T*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setRange(value: (Double, Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "range", js.Any.fromFunction4(value))
      
      @scala.inline
      def setWithin(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "within", js.Any.fromFunction3(value))
    }
  }
  
  type Points = js.Array[js.Array[Double]]
}
