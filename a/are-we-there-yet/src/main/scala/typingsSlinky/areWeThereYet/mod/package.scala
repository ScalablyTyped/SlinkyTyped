package typingsSlinky.areWeThereYet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenericEventListener = js.Function1[/* repeated */ js.Any, scala.Unit]
  type TrackerEventListener = js.Function3[
    /* name */ java.lang.String, 
    /* completed */ scala.Double, 
    /* tracker */ typingsSlinky.areWeThereYet.mod.TrackerObject, 
    scala.Unit
  ]
}
