package typingsSlinky.csso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AfterCompressFn = js.Function2[
    /* compressResult */ java.lang.String, 
    /* options */ typingsSlinky.csso.mod.CompressOptions, 
    scala.Unit
  ]
  
  type BeforeCompressFn = js.Function2[
    /* ast */ js.Object, 
    /* options */ typingsSlinky.csso.mod.CompressOptions, 
    scala.Unit
  ]
}
