package typingsSlinky.markdownMagic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* output */ js.Array[typingsSlinky.markdownMagic.mod.ProcessedConfig], 
    scala.Unit
  ]
  
  /**
    *  transform function
    */
  type TransformFunction = js.Function2[/* content */ java.lang.String, /* options */ js.Any, java.lang.String]
}
