package typingsSlinky.objtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Mask = typingsSlinky.objtools.mod.MaskObj | js.Array[typingsSlinky.objtools.mod.MaskObj] | scala.Boolean
  
  type MaskedOutHook = js.Function1[/* path */ java.lang.String, scala.Unit]
  
  type MergeCustomizer = js.Function4[
    /* objectValue */ js.Any, 
    /* sourceValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    js.Any
  ]
  
  type OnFieldHook = js.Function4[
    /* field */ java.lang.String, 
    /* toVal */ js.Any, 
    /* fromVal */ js.Any, 
    /* parentObj */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    js.Any
  ]
}
