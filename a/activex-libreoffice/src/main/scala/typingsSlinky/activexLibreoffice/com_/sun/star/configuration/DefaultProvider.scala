package typingsSlinky.activexLibreoffice.com_.sun.star.configuration

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XLocalizable
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XFlushable
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a {@link ConfigurationProvider} , that is the default {@link ConfigurationProvider} for its {@link com.sun.star.uno.XComponentContext} .
  *
  * This object is accessible as singleton {@link theDefaultProvider}
  *
  * .
  * @since OOo 1.1.2
  */
@js.native
trait DefaultProvider
  extends ConfigurationProvider
     with XRefreshable
     with XFlushable
     with XLocalizable {
  
  /**
    * Property to enable/disable asynchronous write-back from in-memory cache to backend(s)
    * @since OOo 2.0
    */
  var EnableAsync: Boolean = js.native
}
