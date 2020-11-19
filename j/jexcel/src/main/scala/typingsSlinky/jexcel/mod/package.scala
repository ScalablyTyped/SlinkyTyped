package typingsSlinky.jexcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  //
  // Cell values
  // ----------------------------------------------------------------------
  type CellValue = java.lang.String | scala.Double | scala.Boolean
  
  /**
    * @see https://bossanova.uk/jexcel/v4/docs/quick-reference
    */
  type Options = typingsSlinky.jexcel.mod.MethodsOptions with typingsSlinky.jexcel.mod.EventsOptions with typingsSlinky.jexcel.mod.InitializationOptions with typingsSlinky.jexcel.mod.TranslationsOptions with typingsSlinky.jexcel.mod.UnDocumentOptions
  
  type SourceValue = typingsSlinky.jexcel.mod.CellValue | typingsSlinky.jexcel.anon.Id
}
