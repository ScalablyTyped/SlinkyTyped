package typingsSlinky.requireHacker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GlobalResolve = js.Function2[
    /* path */ java.lang.String, 
    /* module */ js.Any, 
    js.UndefOr[typingsSlinky.requireHacker.anon.Path]
  ]
  type Resolve = js.Function2[/* path */ java.lang.String, /* module */ js.Any, js.UndefOr[java.lang.String]]
}
