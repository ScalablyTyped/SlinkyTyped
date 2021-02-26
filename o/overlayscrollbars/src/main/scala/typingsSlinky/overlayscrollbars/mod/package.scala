package typingsSlinky.overlayscrollbars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicEventCallback = js.ThisFunction0[/* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.overlayscrollbars.anon.X
    - typingsSlinky.overlayscrollbars.anon.L
    - typingsSlinky.overlayscrollbars.anon.Left
    - js.Tuple2[
  typingsSlinky.overlayscrollbars.mod.Position, 
  typingsSlinky.overlayscrollbars.mod.Position]
    - typingsSlinky.overlayscrollbars.mod.Position
    - typingsSlinky.std.HTMLElement
    - typingsSlinky.overlayscrollbars.mod.JQuery
    - typingsSlinky.overlayscrollbars.anon.Block
  */
  type Coordinates = typingsSlinky.overlayscrollbars.mod._Coordinates | (js.Tuple2[
    typingsSlinky.overlayscrollbars.mod.Position, 
    typingsSlinky.overlayscrollbars.mod.Position
  ]) | typingsSlinky.overlayscrollbars.mod.Position | org.scalajs.dom.raw.HTMLElement
  
  type DirectionChangedCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsSlinky.overlayscrollbars.mod.DirectionChangedArgs], 
    scala.Unit
  ]
  
  type Easing = js.UndefOr[java.lang.String | scala.Null]
  
  type Extensions = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[js.Object]
  
  type Margin = scala.Double | scala.Boolean
  
  type OverflowAmountChangedCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsSlinky.overlayscrollbars.mod.OverflowAmountChangedArgs], 
    scala.Unit
  ]
  
  type OverflowChangedCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsSlinky.overlayscrollbars.mod.OverflowChangedArgs], 
    scala.Unit
  ]
  
  type Position = scala.Double | java.lang.String
  
  type ScrollEventCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[org.scalajs.dom.raw.UIEvent], 
    scala.Unit
  ]
  
  type SizeChangedCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsSlinky.overlayscrollbars.mod.SizeChangedArgs], 
    scala.Unit
  ]
  
  type UpdatedCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsSlinky.overlayscrollbars.mod.UpdatedArgs], 
    scala.Unit
  ]
}
