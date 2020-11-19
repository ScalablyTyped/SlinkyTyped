package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object queuesMod {
  
  type JobCallback = js.Function3[
    /* result */ js.Any, 
    /* jobData */ js.Any, 
    /* job */ typingsSlinky.arangodb.anon.DocumentJob, 
    scala.Unit
  ]
}
