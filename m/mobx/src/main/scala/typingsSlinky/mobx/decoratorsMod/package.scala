package typingsSlinky.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object decoratorsMod {
  
  type PropertyCreator = js.Function5[
    /* instance */ js.Any, 
    /* propertyName */ typingsSlinky.std.PropertyKey, 
    /* descriptor */ js.UndefOr[typingsSlinky.mobx.decoratorsMod.BabelDescriptor], 
    /* decoratorTarget */ js.Any, 
    /* decoratorArgs */ js.Array[js.Any], 
    scala.Unit
  ]
}
