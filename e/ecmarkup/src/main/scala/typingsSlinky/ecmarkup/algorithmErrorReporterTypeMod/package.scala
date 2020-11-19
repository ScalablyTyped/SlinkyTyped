package typingsSlinky.ecmarkup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object algorithmErrorReporterTypeMod {
  
  type Reporter = js.Function2[
    /* lintingError */ js.Array[typingsSlinky.ecmarkup.algorithmErrorReporterTypeMod.LintingError], 
    /* sourceText */ java.lang.String, 
    scala.Unit
  ]
}
