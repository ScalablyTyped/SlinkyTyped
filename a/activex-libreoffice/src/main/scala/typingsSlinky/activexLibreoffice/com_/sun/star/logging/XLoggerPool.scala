package typingsSlinky.activexLibreoffice.com_.sun.star.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements a pool for named {@link XLogger} instances
  * @since OOo 2.3
  */
@js.native
trait XLoggerPool extends StObject {
  
  /**
    * retrieves a logger with the default name "org.openoffice.logging.DefaultLogger".
    *
    * Calling this method is equivalent to calling `getNamedLogger( "org.openoffice.logging.DefaultLogger" )` .
    */
  val DefaultLogger: XLogger = js.native
  
  /**
    * retrieves a logger with the default name "org.openoffice.logging.DefaultLogger".
    *
    * Calling this method is equivalent to calling `getNamedLogger( "org.openoffice.logging.DefaultLogger" )` .
    */
  def getDefaultLogger(): XLogger = js.native
  
  /**
    * retrieves a logger with the given name
    *
    * Multiple attempts to retrieve a logger with the same name will return the same instance.
    *
    * Newly created logger instances are initialized via configuration. See the configuration module `/org.openoffice.Office.Logging` for an explanation of
    * the initialization pattern.
    */
  def getNamedLogger(Name: String): XLogger = js.native
}
object XLoggerPool {
  
  @scala.inline
  def apply(DefaultLogger: XLogger, getDefaultLogger: () => XLogger, getNamedLogger: String => XLogger): XLoggerPool = {
    val __obj = js.Dynamic.literal(DefaultLogger = DefaultLogger.asInstanceOf[js.Any], getDefaultLogger = js.Any.fromFunction0(getDefaultLogger), getNamedLogger = js.Any.fromFunction1(getNamedLogger))
    __obj.asInstanceOf[XLoggerPool]
  }
  
  @scala.inline
  implicit class XLoggerPoolMutableBuilder[Self <: XLoggerPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLogger(value: XLogger): Self = StObject.set(x, "DefaultLogger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLogger(value: () => XLogger): Self = StObject.set(x, "getDefaultLogger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNamedLogger(value: String => XLogger): Self = StObject.set(x, "getNamedLogger", js.Any.fromFunction1(value))
  }
}
