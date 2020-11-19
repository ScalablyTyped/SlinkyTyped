package typingsSlinky.mirrorx.mod

import slinky.core.ReactComponentClass
import typingsSlinky.mirrorx.mirrorxStrings.`match`
import typingsSlinky.mirrorx.mirrorxStrings.history
import typingsSlinky.mirrorx.mirrorxStrings.location
import typingsSlinky.mirrorx.mirrorxStrings.staticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirrorx", "withRouter")
@js.native
object withRouter extends js.Object {
  
  def apply[P /* <: RouteComponentProps[_] */](component: ReactComponentClass[P]): ReactComponentClass[
    Omit[
      P, 
      /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ `match` | location | history | staticContext
    ]
  ] = js.native
  def apply[TFunction /* <: ReactComponentClass[_] */](target: TFunction): TFunction = js.native
}
