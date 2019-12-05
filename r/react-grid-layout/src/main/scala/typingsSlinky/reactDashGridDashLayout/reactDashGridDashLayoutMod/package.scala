package typingsSlinky.reactDashGridDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashGridDashLayoutMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.MouseEvent
  import slinky.core.ReactComponentClass

  type ItemCallback = js.Function6[
    /* layout */ js.Array[Layout], 
    /* oldItem */ Layout, 
    /* newItem */ Layout, 
    /* placeholder */ Layout, 
    /* event */ MouseEvent, 
    /* element */ HTMLElement, 
    Unit
  ]
  type Layouts = StringDictionary[js.Array[Layout]]
  type ReactGridLayout = ReactComponentClass[ReactGridLayoutProps]
}
