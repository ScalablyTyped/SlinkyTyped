package typingsSlinky.linkifyIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SchemaRules = org.scalablytyped.runtime.StringDictionary[typingsSlinky.linkifyIt.mod.Rule]
  type Validate = js.Function3[
    /* text */ java.lang.String, 
    /* pos */ scala.Double, 
    /* self */ typingsSlinky.linkifyIt.mod.LinkifyIt, 
    scala.Double | scala.Boolean
  ]
}
