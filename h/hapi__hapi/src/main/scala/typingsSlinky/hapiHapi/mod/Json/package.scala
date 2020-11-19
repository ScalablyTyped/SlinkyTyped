package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Json {
  
  /**
    * @see {@link https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter}
    */
  type StringifyReplacer = js.UndefOr[
    (js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]) | (js.Array[java.lang.String | scala.Double])
  ]
  
  /**
    * Any value greater than 10 is truncated.
    */
  type StringifySpace = scala.Double | java.lang.String
}
