package typingsSlinky.hostValidation

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.hostValidation.hostValidationStrings.both
import typingsSlinky.hostValidation.hostValidationStrings.either
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("host-validation", JSImport.Namespace)
  @js.native
  def apply(opts: config): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @js.native
  trait config extends StObject {
    
    var fail: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* res */ Response_[_], 
          /* next */ NextFunction, 
          Unit
        ]
      ] = js.native
    
    var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.native
    
    var mode: js.UndefOr[both | either] = js.native
    
    var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  }
  object config {
    
    @scala.inline
    def apply(): config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[config]
    }
    
    @scala.inline
    implicit class configMutableBuilder[Self <: config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFail(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit
      ): Self = StObject.set(x, "fail", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      @scala.inline
      def setHosts(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHostsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: both | either): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setReferers(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferersUndefined: Self = StObject.set(x, "referers", js.undefined)
      
      @scala.inline
      def setReferersVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "referers", js.Array(value :_*))
    }
  }
}
