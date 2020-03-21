package typingsSlinky.hapiShot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type Listener = js.Function2[
    /* req */ typingsSlinky.hapiShot.mod.SimulatedRequestObject, 
    /* res */ typingsSlinky.hapiShot.mod.SimulatedResponseObject, 
    scala.Unit
  ]
  type SimulatedRequestObject = typingsSlinky.node.streamMod.Readable
  type SimulatedResponseObject = typingsSlinky.node.httpMod.ServerResponse
}
