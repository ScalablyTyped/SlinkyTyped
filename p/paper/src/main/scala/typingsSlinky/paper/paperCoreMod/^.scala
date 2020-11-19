package typingsSlinky.paper.paperCoreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.paper.anon.TypeofColor
import typingsSlinky.paper.anon.TypeofKey
import typingsSlinky.paper.anon.TypeofPaperScope
import typingsSlinky.paper.anon.TypeofPath
import typingsSlinky.paper.anon.TypeofPathItem
import typingsSlinky.paper.anon.TypeofPoint
import typingsSlinky.paper.anon.TypeofShape
import typingsSlinky.paper.anon.TypeofSize
import typingsSlinky.paper.paper.Color
import typingsSlinky.paper.paper.Point
import typingsSlinky.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paper/dist/paper-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var Color: TypeofColor = js.native
  
  var CompoundPath: Instantiable1[/* pathData */ String, typingsSlinky.paper.paper.CompoundPath] = js.native
  
  var Curve: Instantiable2[
    /* segment1 */ typingsSlinky.paper.paper.Segment, 
    /* segment2 */ typingsSlinky.paper.paper.Segment, 
    typingsSlinky.paper.paper.Curve
  ] = js.native
  
  var CurveLocation: Instantiable3[
    /* curve */ typingsSlinky.paper.paper.Curve, 
    /* time */ Double, 
    /* point */ js.UndefOr[Point], 
    typingsSlinky.paper.paper.CurveLocation
  ] = js.native
  
  var Event: Instantiable0[typingsSlinky.paper.paper.Event] = js.native
  
  var Gradient: Instantiable0[typingsSlinky.paper.paper.Gradient] = js.native
  
  var GradientStop: Instantiable2[
    /* color */ js.UndefOr[Color], 
    /* offset */ js.UndefOr[Double], 
    typingsSlinky.paper.paper.GradientStop
  ] = js.native
  
  var Group: Instantiable1[
    /* children */ js.UndefOr[js.Array[typingsSlinky.paper.paper.Item]], 
    typingsSlinky.paper.paper.Group
  ] = js.native
  
  var HitResult: Instantiable0[typingsSlinky.paper.paper.HitResult] = js.native
  
  var Item: Instantiable0[typingsSlinky.paper.paper.Item] = js.native
  
  var Key: TypeofKey = js.native
  
  var KeyEvent: Instantiable0[typingsSlinky.paper.paper.KeyEvent] = js.native
  
  var Layer: Instantiable1[
    /* children */ js.UndefOr[js.Array[typingsSlinky.paper.paper.Item]], 
    typingsSlinky.paper.paper.Layer
  ] = js.native
  
  var Matrix: Instantiable0[typingsSlinky.paper.paper.Matrix] = js.native
  
  var MouseEvent: Instantiable0[typingsSlinky.paper.paper.MouseEvent] = js.native
  
  var PaperScope: TypeofPaperScope = js.native
  
  var Path: TypeofPath with (Instantiable1[
    /* segments */ js.UndefOr[js.Array[typingsSlinky.paper.paper.Segment]], 
    typingsSlinky.paper.paper.Path
  ]) = js.native
  
  var PathItem: TypeofPathItem = js.native
  
  var Point: TypeofPoint = js.native
  
  var PointText: Instantiable1[/* point */ Point, typingsSlinky.paper.paper.PointText] = js.native
  
  var Project: Instantiable1[/* element */ HTMLCanvasElement | String | Size, typingsSlinky.paper.paper.Project] = js.native
  
  var Raster: Instantiable2[
    /* source */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
    /* position */ js.UndefOr[Point], 
    typingsSlinky.paper.paper.Raster
  ] = js.native
  
  var Rectangle: Instantiable2[/* point */ Point, /* size */ Size, typingsSlinky.paper.paper.Rectangle] = js.native
  
  var Segment: Instantiable3[
    /* point */ js.UndefOr[Point], 
    /* handleIn */ js.UndefOr[Point], 
    /* handleOut */ js.UndefOr[Point], 
    typingsSlinky.paper.paper.Segment
  ] = js.native
  
  var Shape: TypeofShape with Instantiable0[typingsSlinky.paper.paper.Shape] = js.native
  
  var Size: TypeofSize = js.native
  
  var Style: Instantiable1[/* style */ js.Object, typingsSlinky.paper.paper.Style] = js.native
  
  var SymbolDefinition: Instantiable2[
    /* item */ typingsSlinky.paper.paper.Item, 
    /* dontCenter */ js.UndefOr[Boolean], 
    typingsSlinky.paper.paper.SymbolDefinition
  ] = js.native
  
  var SymbolItem: Instantiable2[
    /* definition */ typingsSlinky.paper.paper.SymbolDefinition | typingsSlinky.paper.paper.Item, 
    /* point */ js.UndefOr[Point], 
    typingsSlinky.paper.paper.SymbolItem
  ] = js.native
  
  var TextItem: Instantiable0[typingsSlinky.paper.paper.TextItem] = js.native
  
  var Tool: Instantiable0[typingsSlinky.paper.paper.Tool] = js.native
  
  var ToolEvent: Instantiable0[typingsSlinky.paper.paper.ToolEvent] = js.native
  
  var Tween: Instantiable6[
    /* object */ js.Object, 
    /* from */ js.Object, 
    /* to */ js.Object, 
    /* duration */ Double, 
    /* easing */ js.UndefOr[String | js.Function], 
    /* start */ js.UndefOr[Boolean], 
    typingsSlinky.paper.paper.Tween
  ] = js.native
  
  var View: Instantiable0[typingsSlinky.paper.paper.View] = js.native
  
  def activate(): Unit = js.native
  @JSName("activate")
  var activate_Original: js.Function0[Unit] = js.native
  
  def execute(code: String): Unit = js.native
  def execute(code: String, options: js.Object): Unit = js.native
  @JSName("execute")
  var execute_Original: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit] = js.native
  
  def install(scope: js.Any): Unit = js.native
  @JSName("install")
  var install_Original: js.Function1[/* scope */ js.Any, Unit] = js.native
  
  var project: typingsSlinky.paper.paper.Project = js.native
  
  var projects: js.Array[typingsSlinky.paper.paper.Project] = js.native
  
  var settings: js.Any = js.native
  
  def setup(element: String): Unit = js.native
  def setup(element: Size): Unit = js.native
  def setup(element: HTMLCanvasElement): Unit = js.native
  @JSName("setup")
  var setup_Original: js.Function1[/* element */ HTMLCanvasElement | String | Size, Unit] = js.native
  
  var tool: typingsSlinky.paper.paper.Tool = js.native
  
  var tools: js.Array[typingsSlinky.paper.paper.Tool] = js.native
  
  var version: String = js.native
  
  var view: typingsSlinky.paper.paper.View = js.native
}
