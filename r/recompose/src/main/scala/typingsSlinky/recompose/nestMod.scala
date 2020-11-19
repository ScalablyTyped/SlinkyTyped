package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#nest
@JSImport("recompose/nest", JSImport.Namespace)
@js.native
object nestMod extends js.Object {
  
  def default(Components: (String | ReactComponentClass[_])*): ReactComponentClass[_] = js.native
}
