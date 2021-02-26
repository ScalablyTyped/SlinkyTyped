package typingsSlinky.next

import typingsSlinky.next.nextStrings.development
import typingsSlinky.next.nextStrings.production
import typingsSlinky.next.nextStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extend the NodeJS namespace with Next.js-defined properties
object NodeJS {
  
  @js.native
  trait Process extends StObject {
    
    val browser: Boolean = js.native
  }
  object Process {
    
    @scala.inline
    def apply(browser: Boolean): Process = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Process]
    }
    
    @scala.inline
    implicit class ProcessMutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessEnv extends StObject {
    
    val NODE_ENV: development | production | test = js.native
  }
  object ProcessEnv {
    
    @scala.inline
    def apply(NODE_ENV: development | production | test): ProcessEnv = {
      val __obj = js.Dynamic.literal(NODE_ENV = NODE_ENV.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessEnv]
    }
    
    @scala.inline
    implicit class ProcessEnvMutableBuilder[Self <: ProcessEnv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNODE_ENV(value: development | production | test): Self = StObject.set(x, "NODE_ENV", value.asInstanceOf[js.Any])
    }
  }
}
