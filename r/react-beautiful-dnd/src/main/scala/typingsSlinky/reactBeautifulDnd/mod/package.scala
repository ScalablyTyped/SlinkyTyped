package typingsSlinky.reactBeautifulDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Announce = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type ContextId = typingsSlinky.reactBeautifulDnd.mod.Id
  
  type DisplacementMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactBeautifulDnd.mod.Displacement]
  
  type DraggableChildrenFn = js.Function3[
    /* provided */ typingsSlinky.reactBeautifulDnd.mod.DraggableProvided, 
    /* snapshot */ typingsSlinky.reactBeautifulDnd.mod.DraggableStateSnapshot, 
    /* rubric */ typingsSlinky.reactBeautifulDnd.mod.DraggableRubric, 
    slinky.core.facade.ReactElement
  ]
  
  type DraggableDimensionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactBeautifulDnd.mod.DraggableDimension]
  
  type DraggableId = typingsSlinky.reactBeautifulDnd.mod.Id
  
  type DraggableIdMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactBeautifulDnd.reactBeautifulDndBooleans.`true`]
  
  type DroppableDimensionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactBeautifulDnd.mod.DroppableDimension]
  
  type DroppableId = typingsSlinky.reactBeautifulDnd.mod.Id
  
  type DroppableIdMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactBeautifulDnd.reactBeautifulDndBooleans.`true`]
  
  type ElementId = typingsSlinky.reactBeautifulDnd.mod.Id
  
  type Id = java.lang.String
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OnBeforeCaptureResponder = js.Function1[/* before */ typingsSlinky.reactBeautifulDnd.mod.BeforeCapture, scala.Unit]
  
  type OnBeforeDragStartResponder = js.Function1[/* start */ typingsSlinky.reactBeautifulDnd.mod.DragStart, scala.Unit]
  
  type OnDragEndResponder = js.Function2[
    /* result */ typingsSlinky.reactBeautifulDnd.mod.DropResult, 
    /* provided */ typingsSlinky.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  
  type OnDragStartResponder = js.Function2[
    /* start */ typingsSlinky.reactBeautifulDnd.mod.DragStart, 
    /* provided */ typingsSlinky.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  
  type OnDragUpdateResponder = js.Function2[
    /* update */ typingsSlinky.reactBeautifulDnd.mod.DragUpdate, 
    /* provided */ typingsSlinky.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  
  type Sensor = js.Function1[/* api */ typingsSlinky.reactBeautifulDnd.mod.SensorAPI, scala.Unit]
  
  type TryGetLock = js.Function3[
    /* draggableId */ typingsSlinky.reactBeautifulDnd.mod.DraggableId, 
    /* forceStop */ js.UndefOr[js.Function0[scala.Unit]], 
    /* options */ js.UndefOr[typingsSlinky.reactBeautifulDnd.mod.TryGetLockOptions], 
    typingsSlinky.reactBeautifulDnd.mod.PreDragActions | scala.Null
  ]
  
  type TypeId = typingsSlinky.reactBeautifulDnd.mod.Id
}
