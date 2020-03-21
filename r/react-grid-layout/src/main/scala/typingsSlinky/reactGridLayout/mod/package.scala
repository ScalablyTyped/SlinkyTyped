package typingsSlinky.reactGridLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ItemCallback = js.Function6[
    /* layout */ js.Array[typingsSlinky.reactGridLayout.mod.Layout], 
    /* oldItem */ typingsSlinky.reactGridLayout.mod.Layout, 
    /* newItem */ typingsSlinky.reactGridLayout.mod.Layout, 
    /* placeholder */ typingsSlinky.reactGridLayout.mod.Layout, 
    /* event */ org.scalajs.dom.raw.MouseEvent, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    scala.Unit
  ]
  type Layouts = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.reactGridLayout.mod.Layout]]
  type ReactGridLayout = slinky.core.ReactComponentClass[typingsSlinky.reactGridLayout.mod.ReactGridLayoutProps]
}
