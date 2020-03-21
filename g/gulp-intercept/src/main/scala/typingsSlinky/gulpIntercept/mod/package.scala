package typingsSlinky.gulpIntercept

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Intercept = js.Function1[
    /* interceptFunction */ typingsSlinky.gulpIntercept.mod.InterceptFunction, 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
  type InterceptFunction = js.Function1[/* file */ typingsSlinky.vinyl.mod.File, typingsSlinky.vinyl.mod.File]
}
