package typingsSlinky.reactUseMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HTMLOrSVGElement = org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement
  
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[js.Any], 
    /* observer */ typingsSlinky.reactUseMeasure.mod.ResizeObserver, 
    scala.Unit
  ]
  
  type Result = js.Tuple3[
    js.Function1[
      /* element */ typingsSlinky.reactUseMeasure.mod.HTMLOrSVGElement | scala.Null, 
      scala.Unit
    ], 
    typingsSlinky.reactUseMeasure.mod.RectReadOnly, 
    js.Function0[scala.Unit]
  ]
}
