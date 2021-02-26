package typingsSlinky.kendoUi.global.kendo.dataviz

import typingsSlinky.kendoUi.kendo.dataviz.geometry.ArcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSGlobal("kendo.dataviz.geometry.Arc")
  @js.native
  class Arc protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Arc {
    def this(center: js.Any) = this()
    def this(center: typingsSlinky.kendoUi.kendo.geometry.Point) = this()
    def this(center: js.Any, options: ArcOptions) = this()
    def this(center: typingsSlinky.kendoUi.kendo.geometry.Point, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.geometry.Circle")
  @js.native
  class Circle protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Circle {
    def this(center: js.Any, radius: Double) = this()
    def this(center: typingsSlinky.kendoUi.kendo.geometry.Point, radius: Double) = this()
  }
  
  @JSGlobal("kendo.dataviz.geometry.Matrix")
  @js.native
  class Matrix ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Matrix
  object Matrix {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.rotate")
    @js.native
    def rotate(angle: Double, x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.scale")
    @js.native
    def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.translate")
    @js.native
    def translate(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.unit")
    @js.native
    def unit(): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Point")
  @js.native
  class Point protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.create")
    @js.native
    def create(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.create")
    @js.native
    def create(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.create")
    @js.native
    def create(x: typingsSlinky.kendoUi.kendo.geometry.Point, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.max")
    @js.native
    def max(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.maxPoint")
    @js.native
    def maxPoint(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.min")
    @js.native
    def min(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.minPoint")
    @js.native
    def minPoint(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Rect")
  @js.native
  class Rect protected ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Rect {
    def this(origin: js.Any, size: js.Any) = this()
    def this(origin: js.Any, size: typingsSlinky.kendoUi.kendo.geometry.Size) = this()
    def this(origin: typingsSlinky.kendoUi.kendo.geometry.Point, size: js.Any) = this()
    def this(
      origin: typingsSlinky.kendoUi.kendo.geometry.Point,
      size: typingsSlinky.kendoUi.kendo.geometry.Size
    ) = this()
  }
  object Rect {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Rect.fromPoints")
    @js.native
    def fromPoints(
      pointA: typingsSlinky.kendoUi.kendo.geometry.Point,
      pointB: typingsSlinky.kendoUi.kendo.geometry.Point
    ): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Rect.union")
    @js.native
    def union(rectA: typingsSlinky.kendoUi.kendo.geometry.Rect, rectB: typingsSlinky.kendoUi.kendo.geometry.Rect): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Size")
  @js.native
  class Size ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Size
  object Size {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Size.create")
    @js.native
    def create(width: js.Any, height: Double): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Size.create")
    @js.native
    def create(width: Double, height: Double): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Size.create")
    @js.native
    def create(width: typingsSlinky.kendoUi.kendo.geometry.Size, height: Double): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Transformation")
  @js.native
  class Transformation ()
    extends typingsSlinky.kendoUi.kendo.dataviz.geometry.Transformation
}
