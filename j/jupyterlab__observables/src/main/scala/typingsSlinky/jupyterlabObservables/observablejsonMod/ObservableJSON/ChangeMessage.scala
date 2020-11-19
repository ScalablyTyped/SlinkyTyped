package typingsSlinky.jupyterlabObservables.observablejsonMod.ObservableJSON

import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON.IChangedArgs
import typingsSlinky.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An observable JSON change message.
  */
@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON.ChangeMessage")
@js.native
class ChangeMessage protected () extends Message {
  /**
    * Create a new metadata changed message.
    */
  def this(`type`: String, args: IChangedArgs) = this()
  
  /**
    * The arguments of the change.
    */
  val args: IChangedArgs = js.native
}
