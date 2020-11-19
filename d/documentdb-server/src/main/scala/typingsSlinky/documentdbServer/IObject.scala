package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The __ object can be used as a shortcut to the Collection and Context objects.
  * It derives from the ICollection object via prototype and defines request and response properties
  * which are shortcuts to getContext().getRequest() and getContext().getResponse().
  */
@js.native
trait IObject extends ICollection {
  
  /** Alias for getContext().getRequest() */
  var request: IRequest = js.native
  
  /** Alias for getContext().getResponse() */
  var response: IResponse = js.native
}
