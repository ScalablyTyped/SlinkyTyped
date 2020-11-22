package typingsSlinky.csvParse.es5Mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("csv-parse/lib/es5", "CsvError")
@js.native
class CsvError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(code: CsvErrorCode, message: String, options: js.UndefOr[scala.Nothing], contexts: js.Any*) = this()
  def this(code: CsvErrorCode, message: String, options: Options, contexts: js.Any*) = this()
  def this(
    code: CsvErrorCode,
    message: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    contexts: js.Any*
  ) = this()
  def this(code: CsvErrorCode, message: js.Array[String], options: Options, contexts: js.Any*) = this()
  
  val code: CsvErrorCode = js.native
}
