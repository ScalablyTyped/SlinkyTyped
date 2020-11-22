package typingsSlinky.csvStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object es5Mod {
  
  type Callback = js.Function2[/* err */ js.UndefOr[js.Error], /* output */ java.lang.String, scala.Unit]
  
  type Cast[T] = js.Function2[
    /* value */ T, 
    /* context */ typingsSlinky.csvStringify.es5Mod.CastingContext, 
    java.lang.String
  ]
  
  type Input = js.Array[js.Any]
  
  type PlainObject[T] = typingsSlinky.std.Record[java.lang.String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.csvStringify.csvStringifyStrings.auto
    - typingsSlinky.csvStringify.csvStringifyStrings.unix
    - typingsSlinky.csvStringify.csvStringifyStrings.mac
    - typingsSlinky.csvStringify.csvStringifyStrings.windows
    - typingsSlinky.csvStringify.csvStringifyStrings.ascii
    - typingsSlinky.csvStringify.csvStringifyStrings.unicode
  */
  type RecordDelimiter = typingsSlinky.csvStringify.es5Mod._RecordDelimiter | java.lang.String | typingsSlinky.node.Buffer
}
