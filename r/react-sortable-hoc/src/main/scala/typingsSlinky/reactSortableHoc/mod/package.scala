package typingsSlinky.reactSortableHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContainerGetter = js.Function1[
    /* element */ slinky.core.facade.ReactElement, 
    org.scalajs.dom.raw.HTMLElement | js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  
  type HelperContainerGetter = js.Function0[org.scalajs.dom.raw.HTMLElement]
  
  type Offset = scala.Double | java.lang.String
  
  type SortEndHandler = js.Function2[
    /* sort */ typingsSlinky.reactSortableHoc.mod.SortEnd, 
    /* event */ typingsSlinky.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  
  type SortEvent = slinky.web.SyntheticMouseEvent[js.Any] | slinky.web.SyntheticTouchEvent[js.Any]
  
  type SortEventWithTag = typingsSlinky.reactSortableHoc.mod.SortEvent with typingsSlinky.reactSortableHoc.anon.Target
  
  type SortMoveHandler = js.Function1[/* event */ typingsSlinky.reactSortableHoc.mod.SortEvent, scala.Unit]
  
  type SortOverHandler = js.Function2[
    /* sort */ typingsSlinky.reactSortableHoc.mod.SortOver, 
    /* event */ typingsSlinky.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  
  type SortStartHandler = js.Function2[
    /* sort */ typingsSlinky.reactSortableHoc.mod.SortStart, 
    /* event */ typingsSlinky.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  
  type WrappedComponent[P] = slinky.core.ReactComponentClass[P] | typingsSlinky.reactSortableHoc.mod.WrappedComponentFactory[P]
  
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, slinky.core.facade.ReactElement]
}
