package typingsSlinky.dndCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type ActionCreator[Payload] = js.Function1[/* args */ js.Array[js.Any], typingsSlinky.dndCore.interfacesMod.Action[Payload]]
  
  type BackendFactory = js.Function3[
    /* manager */ typingsSlinky.dndCore.interfacesMod.DragDropManager, 
    /* globalContext */ js.UndefOr[js.Any], 
    /* configuration */ js.UndefOr[js.Any], 
    typingsSlinky.dndCore.interfacesMod.Backend
  ]
  
  type Identifier = java.lang.String | js.Symbol
  
  type Listener = js.Function0[scala.Unit]
  
  type SourceType = typingsSlinky.dndCore.interfacesMod.Identifier
  
  type TargetType = typingsSlinky.dndCore.interfacesMod.Identifier | js.Array[typingsSlinky.dndCore.interfacesMod.Identifier]
  
  type Unsubscribe = js.Function0[scala.Unit]
}
