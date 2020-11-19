package typingsSlinky.neatCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** The CSV data to parse. */
  type Input = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.node.streamMod.Readable
  
  /** A representation of one row of the input CSV. */
  type Row = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
