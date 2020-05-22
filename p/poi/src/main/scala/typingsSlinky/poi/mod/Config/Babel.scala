package typingsSlinky.poi.mod.Config

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.poi.mod.Config.Babel.NamedImportsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Babel extends js.Object {
  var jsx: js.UndefOr[String] = js.undefined
  var namedImports: js.UndefOr[String | NamedImportsOptions] = js.undefined
  var transpileModules: js.UndefOr[String | js.Array[String]] = js.undefined
}

@JSImport("poi", "Config.Babel")
@js.native
object Babel extends js.Object {
  type NamedImportsOptions = StringDictionary[StringDictionary[String]]
}

