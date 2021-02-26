package typingsSlinky.gatsbyCli

import typingsSlinky.gatsbyCli.errorMapMod.ErrorId
import typingsSlinky.gatsbyCli.errorMapMod.IErrorMapEntry
import typingsSlinky.gatsbyCli.structuredErrorsTypesMod.IConstructError
import typingsSlinky.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructErrorMod {
  
  @JSImport("gatsby-cli/lib/structured-errors/construct-error", JSImport.Default)
  @js.native
  def default(hasDetails: IConstructError, suppliedErrorMap: Record[ErrorId, IErrorMapEntry]): IStructuredError = js.native
}
