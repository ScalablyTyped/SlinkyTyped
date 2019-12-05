package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlebars {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.handlebars.Handlebars.TemplateDelegate

  type CompilerInfo = js.Tuple2[Double, String]
  type CustomHelperName = String
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = TemplateDelegate[T]
  type HandlebarsTemplates = StringDictionary[HandlebarsTemplateDelegate[js.Any]]
  type KnownHelpers = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in handlebars.BuiltinHelperName | handlebars.CustomHelperName ]: boolean}
    */ typingsSlinky.handlebars.handlebarsStrings.KnownHelpers with js.Any
  // for backward compatibility of this typing
  type RuntimeOptions = typingsSlinky.handlebars.Handlebars.RuntimeOptions
}
