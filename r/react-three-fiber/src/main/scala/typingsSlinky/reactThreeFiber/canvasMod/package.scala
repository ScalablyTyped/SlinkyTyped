package typingsSlinky.reactThreeFiber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object canvasMod {
  
  type Camera = typingsSlinky.three.mod.OrthographicCamera | typingsSlinky.three.mod.PerspectiveCamera
  
  type ComputeOffsetsFunction = js.Function1[
    /* event */ typingsSlinky.reactThreeFiber.canvasMod.DomEvent, 
    typingsSlinky.reactThreeFiber.anon.OffsetX
  ]
  
  type FilterFunction = js.Function2[
    /* items */ js.Array[typingsSlinky.three.raycasterMod.Intersection], 
    /* state */ typingsSlinky.reactThreeFiber.canvasMod.SharedCanvasContext, 
    js.Array[typingsSlinky.three.raycasterMod.Intersection]
  ]
  
  type RenderCallback = js.Function2[
    /* state */ typingsSlinky.reactThreeFiber.canvasMod.CanvasContext, 
    /* delta */ scala.Double, 
    scala.Unit
  ]
  
  type ThreeEvent[T] = T with typingsSlinky.reactThreeFiber.canvasMod.Intersection with typingsSlinky.reactThreeFiber.anon.Camera[T]
  
  type ViewportData = typingsSlinky.reactThreeFiber.canvasMod.Viewport with (js.Function2[
    /* camera */ typingsSlinky.reactThreeFiber.canvasMod.Camera, 
    /* target */ typingsSlinky.three.mod.Vector3, 
    typingsSlinky.reactThreeFiber.canvasMod.Viewport
  ])
}
