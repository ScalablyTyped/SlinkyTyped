package typingsSlinky.expressActuator

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-actuator", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-actuator", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  type CustomControllerMethod = js.Function2[/* req */ js.UndefOr[js.Any], /* res */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait CustomEndpoint extends StObject {
    
    /**
      * @summary Controller to be called when accessing this endpoint
      */
    def controller(): Unit = js.native
    def controller(req: js.UndefOr[scala.Nothing], res: js.Any): Unit = js.native
    def controller(req: js.Any): Unit = js.native
    def controller(req: js.Any, res: js.Any): Unit = js.native
    /**
      * @summary Controller to be called when accessing this endpoint
      */
    @JSName("controller")
    var controller_Original: CustomControllerMethod = js.native
    
    /**
      * @summary Used as endpoint `/id` or `${basePath}/id`
      */
    var id: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressActuator.expressActuatorStrings.simple
    - typingsSlinky.expressActuator.expressActuatorStrings.full
  */
  trait InfoGitMode extends StObject
  object InfoGitMode {
    
    @scala.inline
    def full: typingsSlinky.expressActuator.expressActuatorStrings.full = "full".asInstanceOf[typingsSlinky.expressActuator.expressActuatorStrings.full]
    
    @scala.inline
    def simple: typingsSlinky.expressActuator.expressActuatorStrings.simple = "simple".asInstanceOf[typingsSlinky.expressActuator.expressActuatorStrings.simple]
  }
  
  /**
    * @summary Options for {@link Actuator} function.
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * @summary BasePath of Actuator.
      */
    var basePath: js.UndefOr[String] = js.native
    
    /**
      * @summary Custom endpoints
      */
    var customEndpoints: js.UndefOr[js.Array[CustomEndpoint]] = js.native
    
    /**
      * @summary Extra Options to pass to info build output.
      */
    var infoBuildOptions: js.UndefOr[Record[String, _]] = js.native
    
    /**
      * @summary DateFormat for info git.time output.
      */
    var infoDateFormat: js.UndefOr[String] = js.native
    
    /**
      * @summary infoGitMode.
      */
    var infoGitMode: js.UndefOr[InfoGitMode] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setCustomEndpoints(value: js.Array[CustomEndpoint]): Self = StObject.set(x, "customEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomEndpointsUndefined: Self = StObject.set(x, "customEndpoints", js.undefined)
      
      @scala.inline
      def setCustomEndpointsVarargs(value: CustomEndpoint*): Self = StObject.set(x, "customEndpoints", js.Array(value :_*))
      
      @scala.inline
      def setInfoBuildOptions(value: Record[String, _]): Self = StObject.set(x, "infoBuildOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoBuildOptionsUndefined: Self = StObject.set(x, "infoBuildOptions", js.undefined)
      
      @scala.inline
      def setInfoDateFormat(value: String): Self = StObject.set(x, "infoDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoDateFormatUndefined: Self = StObject.set(x, "infoDateFormat", js.undefined)
      
      @scala.inline
      def setInfoGitMode(value: InfoGitMode): Self = StObject.set(x, "infoGitMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoGitModeUndefined: Self = StObject.set(x, "infoGitMode", js.undefined)
    }
  }
}
