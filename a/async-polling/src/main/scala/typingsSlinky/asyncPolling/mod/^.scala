package typingsSlinky.asyncPolling.mod

import typingsSlinky.asyncPolling.anon.On
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async-polling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: Double
  ): On = js.native
}
