package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lokijs {
  type LokiQuery[E] = typingsSlinky.lokijs.PartialModel[E with typingsSlinky.lokijs.AnonAnd, typingsSlinky.lokijs.YinkeyofLokiOpsany]
  type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? T | E[P]}
    */ typingsSlinky.lokijs.lokijsStrings.PartialModel with org.scalablytyped.runtime.TopLevel[E]
}
