package typingsSlinky.jointjs.mod.linkTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Button {
  type ActionCallback = js.Function2[
    /* evt */ typingsSlinky.jointjs.mod.dia.Event, 
    /* view */ typingsSlinky.jointjs.mod.dia.LinkView, 
    scala.Unit
  ]
}
