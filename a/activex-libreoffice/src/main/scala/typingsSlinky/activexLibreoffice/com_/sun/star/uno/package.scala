package typingsSlinky.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object uno {
  
  /**
    * {@link Exception} signalling a deployment error.
    * @since OOo 1.1.2
    */
  type DeploymentException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.RuntimeException
  
  /** a simple named object container. */
  type NamingService = typingsSlinky.activexLibreoffice.com_.sun.star.uno.XNamingService
  
  /**
    * This exception or a subclass can occur at every interface method.
    *
    * It shall signal an error, which was not covered by the interface method specification. This exception (or a derived one) is thrown, when for instance
    * an interprocess bridge to the object broke down, some explicitly forbidden invalid parameters were passed ( e.g. null references ) or the called
    * object has been disposed before.
    */
  type RuntimeException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** Base exception for all security related exceptions. */
  type SecurityException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.RuntimeException
}
