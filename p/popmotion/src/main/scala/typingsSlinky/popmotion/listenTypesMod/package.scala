package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listenTypesMod {
  type EventListener = js.Function3[
    /* type */ java.lang.String, 
    /* listener */ js.Function, 
    /* options */ js.UndefOr[typingsSlinky.popmotion.listenTypesMod.EventListenerOptions | scala.Boolean], 
    scala.Unit
  ]
  type ListenFactory = js.Function3[
    /* element */ org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Document | org.scalajs.dom.raw.Window, 
    /* events */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.popmotion.listenTypesMod.EventListenerOptions | scala.Boolean], 
    typingsSlinky.popmotion.actionMod.Action
  ]
}
