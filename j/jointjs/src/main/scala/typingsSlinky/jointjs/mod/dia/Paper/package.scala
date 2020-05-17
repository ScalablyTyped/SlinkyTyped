package typingsSlinky.jointjs.mod.dia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Paper {
  type ProgressCallback = js.Function5[
    /* done */ scala.Boolean, 
    /* processed */ scala.Double, 
    /* total */ scala.Double, 
    /* stats */ typingsSlinky.jointjs.mod.dia.Paper.UpdateStats, 
    /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  type ViewportCallback = js.Function3[
    /* view */ typingsSlinky.jointjs.mod.mvc.View[js.Any], 
    /* isDetached */ scala.Boolean, 
    /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
    scala.Boolean
  ]
}
