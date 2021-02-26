package typingsSlinky.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinMod {
  
  object add {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pin", "add.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options2 {
      
      object validate1 {
        
        object options3 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "add.options_2.validate_1.options_3.allowUnknown_1")
          @js.native
          val allowUnknown1: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "add.options_2.validate_1.options_3.stripUnknown_1")
          @js.native
          val stripUnknown1: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pin", "add.options_2.validate_1.query_1")
        @js.native
        val query1: js.Any = js.native
      }
    }
  }
  
  object ls {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pin", "ls.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "ls.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "ls.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pin", "ls.options.validate.query")
        @js.native
        val query: js.Any = js.native
      }
    }
  }
  
  object rm {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rm.handler")
    @js.native
    def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
    
    object options4 {
      
      object validate2 {
        
        object options5 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rm.options_4.validate_2.options_5.allowUnknown_2")
          @js.native
          val allowUnknown2: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rm.options_4.validate_2.options_5.stripUnknown_2")
          @js.native
          val stripUnknown2: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/pin", "rm.options_4.validate_2.query_2")
        @js.native
        val query2: js.Any = js.native
      }
    }
  }
}
