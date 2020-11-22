package typingsSlinky.reactSwipeable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AttachTouch = js.Function2[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* passive */ scala.Boolean, 
    js.Function0[scala.Unit]
  ]
  
  type HandledEvents = slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.Element] | org.scalajs.dom.raw.TouchEvent | org.scalajs.dom.raw.MouseEvent
  
  type Setter = js.Function1[/* stateSetter */ typingsSlinky.reactSwipeable.typesMod.StateSetter, scala.Unit]
  
  type StateSetter = js.Function2[
    /* state */ typingsSlinky.reactSwipeable.typesMod.SwipeableState, 
    /* props */ typingsSlinky.reactSwipeable.typesMod.SwipeablePropsWithDefaultOptions, 
    typingsSlinky.reactSwipeable.typesMod.SwipeableState
  ]
  
  type SwipeCallback = js.Function1[/* eventData */ typingsSlinky.reactSwipeable.typesMod.SwipeEventData, scala.Unit]
  
  type SwipeDirections = /* "Left" */ java.lang.String
  
  type TapCallback = js.Function1[/* hasEvent */ typingsSlinky.reactSwipeable.anon.Event, scala.Unit]
  
  type Vector2 = js.Tuple2[scala.Double, scala.Double]
}
