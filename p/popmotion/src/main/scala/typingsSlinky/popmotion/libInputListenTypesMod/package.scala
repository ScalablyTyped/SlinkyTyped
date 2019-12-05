package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputListenTypesMod {
  import org.scalajs.dom.raw.Document
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Window
  import typingsSlinky.popmotion.libActionMod.Action

  type EventListener = js.Function3[
    /* type */ String, 
    /* listener */ js.Function, 
    /* options */ js.UndefOr[EventListenerOptions | Boolean], 
    Unit
  ]
  type ListenFactory = js.Function3[
    /* element */ Element | Document | Window, 
    /* events */ String, 
    /* options */ js.UndefOr[EventListenerOptions | Boolean], 
    Action
  ]
}
