package typingsSlinky.hapiCrumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[typingsSlinky.hapiHapi.mod.Request], 
    /* h */ js.UndefOr[typingsSlinky.hapiHapi.mod.ResponseToolkit], 
    scala.Boolean
  ]
}
