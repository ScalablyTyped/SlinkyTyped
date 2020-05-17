package typingsSlinky.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicEventCallback = js.ThisFunction0[/* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, scala.Unit]
  type DirectionChangedCallback = js.ThisFunction1[
    /* this */ typingsSlinky.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsSlinky.overlayscrollbars.mod.DirectionChangedArgs], 
    scala.Unit
  ]
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
