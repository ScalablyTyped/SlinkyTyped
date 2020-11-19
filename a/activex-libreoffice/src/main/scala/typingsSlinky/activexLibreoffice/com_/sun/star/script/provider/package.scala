package typingsSlinky.activexLibreoffice.com_.sun.star.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object provider {
  
  /** This service provides a means of browsing and invoking scripts in a single language. */
  type LanguageScriptProvider = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProvider
  
  /** This service acts as a wrapper around the various language specific ScriptProviders. */
  type MasterScriptProvider = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProvider
  
  /**
    * This service is used to create MasterScriptProviders. Note: You shouldn't ever instantiate the {@link MasterScriptProvider} service directly, you
    * should always use this service.
    * @deprecated Deprecatedrather use the singleton service theMasterScriptProviderFactory
    */
  type MasterScriptProviderFactory = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.XScriptProviderFactory
  
  /** This service is a Basic-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForBasic = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  
  /** This service is a BeanShell-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForBeanShell = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  
  /** This service is a Java-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForJava = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  
  /** This service is a Java-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForJavaScript = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
  
  /**
    * The one and only {@link MasterScriptProviderFactory}
    *
    * To get the singleton call getValueByName on the component context `; /singletons/com.sun.star.script.provider.theMasterScriptProviderFactory`
    */
  type theMasterScriptProviderFactory = typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.XScriptProviderFactory
}
