package typingsSlinky.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/common/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  type ValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.Validator}
    */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.ValidationMap with TopLevel[js.Any]
  
  type Validator = js.Function5[
    /* props */ StringDictionary[js.Any], 
    /* propName */ String, 
    /* componentName */ String, 
    /* location */ String, 
    /* propFullName */ String, 
    js.Error | Null
  ]
}
