package typingsSlinky.queryString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParsedQuery[T] = org.scalablytyped.runtime.StringDictionary[T | js.Array[T] | scala.Null]
  
  type Stringifiable = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
  
  type StringifiableRecord = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.queryString.mod.Stringifiable | js.Array[typingsSlinky.queryString.mod.Stringifiable]
  ]
}
