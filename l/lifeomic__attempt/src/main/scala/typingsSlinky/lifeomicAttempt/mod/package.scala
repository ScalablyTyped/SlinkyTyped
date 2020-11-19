package typingsSlinky.lifeomicAttempt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttemptFunction[T] = js.Function2[
    /* context */ typingsSlinky.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typingsSlinky.lifeomicAttempt.mod.AttemptOptions[T], 
    js.Promise[T]
  ]
  
  type BeforeAttempt[T] = js.Function2[
    /* context */ typingsSlinky.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typingsSlinky.lifeomicAttempt.mod.AttemptOptions[T], 
    scala.Unit
  ]
  
  type CalculateDelay[T] = js.Function2[
    /* context */ typingsSlinky.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typingsSlinky.lifeomicAttempt.mod.AttemptOptions[T], 
    scala.Double
  ]
  
  type HandleError[T] = js.Function3[
    /* err */ js.Any, 
    /* context */ typingsSlinky.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typingsSlinky.lifeomicAttempt.mod.AttemptOptions[T], 
    scala.Unit
  ]
  
  type HandleTimeout[T] = js.Function2[
    /* context */ typingsSlinky.lifeomicAttempt.mod.AttemptContext, 
    /* options */ typingsSlinky.lifeomicAttempt.mod.AttemptOptions[T], 
    js.Promise[T]
  ]
}
