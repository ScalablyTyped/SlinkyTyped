package typingsSlinky.angularEs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsSlinky.std.TypedPropertyDescriptor[js.Any], 
    typingsSlinky.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
}
