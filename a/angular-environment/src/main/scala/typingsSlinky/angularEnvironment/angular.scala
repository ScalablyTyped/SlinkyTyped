package typingsSlinky.angularEnvironment

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object environment {
    
    @js.native
    trait Config extends StObject {
      
      /**
        * Map of domains to their environments
        */
      var domains: StringDictionary[js.Array[String]] = js.native
      
      /**
        * List of variables split by environment
        */
      var vars: StringDictionary[StringDictionary[js.Any]] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(domains: StringDictionary[js.Array[String]], vars: StringDictionary[StringDictionary[js.Any]]): Config = {
        val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomains(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVars(value: StringDictionary[StringDictionary[js.Any]]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Service extends StObject {
      
      /**
        * Retrieve the current environment
        */
      def get(): String = js.native
      
      /**
        * Evaluates current environment against
        * environment parameter.
        */
      def is(environment: String): Boolean = js.native
      
      /**
        * Retrieves the correct version of a
        * variable for the current environment.
        */
      def read(key: String): js.Any = js.native
      
      /**
        * Force sets the current environment
        */
      def set(environment: String): Unit = js.native
    }
    object Service {
      
      @scala.inline
      def apply(get: () => String, is: String => Boolean, read: String => js.Any, set: String => Unit): Service = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), is = js.Any.fromFunction1(is), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[Service]
      }
      
      @scala.inline
      implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIs(value: String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRead(value: String => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait ServiceProvider extends StObject {
      
      /**
        * Evaluates the current domain and
        * loads the correct environment variables.
        */
      def check(): Unit = js.native
      
      /**
        * Sets the configuration object
        */
      def config(config: Config): Unit = js.native
      
      /**
        * Retrieves the correct version of a
        * variable for the current environment.
        */
      def read(key: String): js.Any = js.native
    }
    object ServiceProvider {
      
      @scala.inline
      def apply(check: () => Unit, config: Config => Unit, read: String => js.Any): ServiceProvider = {
        val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), config = js.Any.fromFunction1(config), read = js.Any.fromFunction1(read))
        __obj.asInstanceOf[ServiceProvider]
      }
      
      @scala.inline
      implicit class ServiceProviderMutableBuilder[Self <: ServiceProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCheck(value: () => Unit): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
        
        @scala.inline
        def setConfig(value: Config => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRead(value: String => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      }
    }
  }
}
