package typingsSlinky.pino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LevelChangeEventListener = js.Function4[
    /* lvl */ typingsSlinky.pino.mod.LevelWithSilent | java.lang.String, 
    /* val */ scala.Double, 
    /* prevLvl */ typingsSlinky.pino.mod.LevelWithSilent | java.lang.String, 
    /* prevVal */ scala.Double, 
    scala.Unit
  ]
  
  type MixinFn = js.Function0[js.Object]
  
  type SerializedError = typingsSlinky.pinoStdSerializers.mod.SerializedError
  
  type SerializedRequest = typingsSlinky.pinoStdSerializers.mod.SerializedRequest
  
  type SerializedResponse = typingsSlinky.pinoStdSerializers.mod.SerializedResponse
  
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  
  type TimeFn = js.Function0[java.lang.String]
  
  type WriteFn = js.Function1[/* o */ js.Object, scala.Unit]
}
