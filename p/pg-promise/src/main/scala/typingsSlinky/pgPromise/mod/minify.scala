package typingsSlinky.pgPromise.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.pgMinify.mod.IMinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-promise", "minify")
@js.native
object minify extends js.Object {
  
  def apply(sql: String): String = js.native
  def apply(sql: String, options: IMinifyOptions): String = js.native
  
  @js.native
  class SQLParsingError ()
    extends typingsSlinky.pgMinify.mod.SQLParsingError
  @js.native
  object SQLParsingError
    extends TopLevel[Instantiable0[typingsSlinky.pgMinify.mod.SQLParsingError]]
}
