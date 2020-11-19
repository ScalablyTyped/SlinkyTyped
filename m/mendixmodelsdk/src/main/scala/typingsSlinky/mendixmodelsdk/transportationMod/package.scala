package typingsSlinky.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transportationMod {
  
  type IResponseCallback[T] = js.Function2[
    /* data */ T, 
    /* response */ typingsSlinky.mendixmodelsdk.transportationMod.IResponse, 
    scala.Unit
  ]
}
