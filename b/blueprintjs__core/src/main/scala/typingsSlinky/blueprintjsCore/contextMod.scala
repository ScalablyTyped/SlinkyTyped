package typingsSlinky.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  type ValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.Validator<K>}
    */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.ValidationMap with TopLevel[js.Any]
  
  type Validator[K] = js.Function5[
    /* props */ StringDictionary[js.Any], 
    /* propName */ K, 
    /* componentName */ String, 
    /* location */ String, 
    /* propFullName */ String, 
    js.UndefOr[js.Error]
  ]
}
