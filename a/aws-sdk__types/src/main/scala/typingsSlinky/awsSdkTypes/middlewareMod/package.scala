package typingsSlinky.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object middlewareMod {
  
  type BuildHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerArguments[Input], 
    js.Promise[typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOutput[Output]]
  ]
  
  type BuildHandlerArguments[Input /* <: js.Object */] = typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input]
  
  type BuildHandlerOutput[Output /* <: js.Object */] = typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]
  
  type BuildMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler[Input, Output], 
    /* context */ typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler[Input, Output]
  ]
  
  type DeserializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandlerArguments[Input], 
    js.Promise[typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandlerOutput[Output]]
  ]
  
  type DeserializeHandlerArguments[Input /* <: js.Object */] = typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input]
  
  type DeserializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler[Input, Output], 
    /* context */ typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler[Input, Output]
  ]
  
  type FinalizeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input], 
    js.Promise[typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandlerOutput[Output]]
  ]
  
  type FinalizeHandlerOutput[Output /* <: js.Object */] = typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]
  
  type FinalizeRequestMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output], 
    /* context */ typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output]
  ]
  
  type Handler[Input /* <: js.Object */, Output /* <: js.Object */] = typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler[Input, Output]
  
  type InitializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerArguments[Input], 
    js.Promise[typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]]
  ]
  
  type InitializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler[Input, Output], 
    /* context */ typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler[Input, Output]
  ]
  
  type MiddlewareType[Input /* <: js.Object */, Output /* <: js.Object */] = (typingsSlinky.awsSdkTypes.middlewareMod.InitializeMiddleware[Input, Output]) | (typingsSlinky.awsSdkTypes.middlewareMod.SerializeMiddleware[Input, Output]) | (typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware[Input, Output]) | (typingsSlinky.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware[Input, Output]) | (typingsSlinky.awsSdkTypes.middlewareMod.DeserializeMiddleware[Input, Output])
  
  type SerializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandlerArguments[Input], 
    js.Promise[typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandlerOutput[Output]]
  ]
  
  type SerializeHandlerOutput[Output /* <: js.Object */] = typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]
  
  type SerializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output], 
    /* context */ typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsSlinky.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output]
  ]
  
  type Terminalware = js.Function1[
    /* context */ typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsSlinky.awsSdkTypes.middlewareMod.DeserializeHandler[js.Object, js.Object]
  ]
}
