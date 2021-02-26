package typingsSlinky.jestValidate

import typingsSlinky.jestValidate.typesMod.DeprecatedOptions
import typingsSlinky.jestValidate.typesMod.ValidationOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("jest-validate/build/deprecated", "deprecationWarning")
  @js.native
  def deprecationWarning(
    config: Record[String, _],
    option: String,
    deprecatedOptions: DeprecatedOptions,
    options: ValidationOptions
  ): Boolean = js.native
}
