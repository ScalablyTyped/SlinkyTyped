package typingsSlinky.json2md

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConverterCallback[TInput] = js.Function2[
    /* input */ TInput, 
    /* json2md */ typingsSlinky.json2md.mod.json2md, 
    java.lang.String
  ]
  type json2md = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof json2md */ js.Any
}
