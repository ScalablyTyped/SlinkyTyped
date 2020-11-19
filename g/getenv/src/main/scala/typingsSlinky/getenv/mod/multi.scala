package typingsSlinky.getenv.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("getenv", "multi")
@js.native
object multi extends js.Object {
  
  /**
    * Return a list of environment variables based on a spec:
    * ```
    *  var config = getenv.multi({
    *    foo: "FOO", // throws if FOO doesn't exist
    *    bar: ["BAR", "defaultval"], // set a default value
    *    baz: ["BAZ", "defaultval", "string"], // parse into type
    *    quux: ["QUUX", undefined, "int"] // parse & throw
    *  });
    * ```
    */
  def apply[S /* <: StringDictionary[String | ParseWithFallback | ParseWithEachType] */](spec: S): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof S ]: S[P][2] extends getenv.getenv.ParseTypes? getenv.getenv.ParseMappings[S[P][2]] : string}
    */ typingsSlinky.getenv.getenvStrings.multi with TopLevel[js.Any] = js.native
}
