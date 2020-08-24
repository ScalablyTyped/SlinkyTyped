package typingsSlinky.phoenixLiveView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BindCallback = js.Function7[
    /* e */ org.scalajs.dom.raw.Event, 
    /* event */ java.lang.String, 
    /* view */ typingsSlinky.phoenixLiveView.mod.View, 
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* targetCtx */ js.Object, 
    /* phxEvent */ java.lang.String, 
    /* windowOwner */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type ViewLogger = js.Function4[
    /* view */ typingsSlinky.phoenixLiveView.mod.View, 
    /* kind */ java.lang.String, 
    /* msg */ js.Any, 
    /* obj */ js.Any, 
    scala.Unit
  ]
}
