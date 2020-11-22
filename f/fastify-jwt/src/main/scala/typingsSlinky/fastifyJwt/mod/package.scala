package typingsSlinky.fastifyJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Secret = typingsSlinky.jsonwebtoken.mod.Secret | (js.Function3[
    /* request */ typingsSlinky.fastifyJwt.mod.fastifyAugmentingMod.FastifyRequest, 
    /* reply */ typingsSlinky.fastifyJwt.mod.fastifyAugmentingMod.FastifyReply, 
    /* cb */ js.Function2[/* e */ js.Error | scala.Null, /* secret */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ])
}
