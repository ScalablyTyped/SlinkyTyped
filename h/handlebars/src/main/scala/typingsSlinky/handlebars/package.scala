package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object handlebars {
  
  type CompilerInfo = js.Tuple2[scala.Double, java.lang.String]
  
  type CustomHelperName = java.lang.String
  
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = typingsSlinky.handlebars.Handlebars.TemplateDelegate[T]
  
  type HandlebarsTemplates = org.scalablytyped.runtime.StringDictionary[typingsSlinky.handlebars.HandlebarsTemplateDelegate[js.Any]]
  
  type KnownHelpers = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in handlebars.BuiltinHelperName | handlebars.CustomHelperName ]: boolean}
    */ typingsSlinky.handlebars.handlebarsStrings.KnownHelpers with org.scalablytyped.runtime.TopLevel[js.Any]
  
  // for backward compatibility of this typing
  type RuntimeOptions = typingsSlinky.handlebars.Handlebars.RuntimeOptions
}
