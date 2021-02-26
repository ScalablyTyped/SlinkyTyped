package typingsSlinky.emberController

import typingsSlinky.emberObject.actionHandlerMod.ActionHandler
import typingsSlinky.emberObject.computedMod.ComputedProperty
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(ControllerMixin) * / any */ @JSImport("@ember/controller", JSImport.Default)
  @js.native
  class default () extends StObject
  
  @js.native
  trait ControllerMixin extends ActionHandler {
    
    var model: js.Any = js.native
    
    var queryParams: js.Array[String | (Record[String, js.UndefOr[QueryParamConfig | String]])] = js.native
    
    def replaceRoute(name: String, args: js.Any*): Unit = js.native
    
    var target: js.Object = js.native
    
    def transitionToRoute(args: js.Any*): Unit = js.native
    def transitionToRoute(name: String, args: js.Any*): Unit = js.native
  }
  @JSImport("@ember/controller", "ControllerMixin")
  @js.native
  val ControllerMixin: typingsSlinky.emberObject.mixinMod.default[
    typingsSlinky.emberController.mod.ControllerMixin, 
    typingsSlinky.emberObject.mod.default
  ] = js.native
  
  @JSImport("@ember/controller", "inject")
  @js.native
  def inject(): ComputedProperty[Controller, Controller] = js.native
  @JSImport("@ember/controller", "inject")
  @js.native
  def inject(target: js.Object, propertyKey: String): Unit = js.native
  @JSImport("@ember/controller", "inject")
  @js.native
  def inject(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  @JSImport("@ember/controller", "inject")
  @js.native
  def inject[K /* <: /* keyof @ember/controller.@ember/controller.Registry */ String */](name: K): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
  
  type Controller = /* import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(ControllerMixin) */ js.Any
  
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  trait QueryParamConfig extends StObject {
    
    var as: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[QueryParamScopeTypes] = js.native
    
    var `type`: js.UndefOr[QueryParamTypes] = js.native
  }
  object QueryParamConfig {
    
    @scala.inline
    def apply(): QueryParamConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParamConfig]
    }
    
    @scala.inline
    implicit class QueryParamConfigMutableBuilder[Self <: QueryParamConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setScope(value: QueryParamScopeTypes): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setType(value: QueryParamTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emberController.emberControllerStrings.controller
    - typingsSlinky.emberController.emberControllerStrings.model
  */
  trait QueryParamScopeTypes extends StObject
  object QueryParamScopeTypes {
    
    @scala.inline
    def controller: typingsSlinky.emberController.emberControllerStrings.controller = "controller".asInstanceOf[typingsSlinky.emberController.emberControllerStrings.controller]
    
    @scala.inline
    def model: typingsSlinky.emberController.emberControllerStrings.model = "model".asInstanceOf[typingsSlinky.emberController.emberControllerStrings.model]
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emberController.emberControllerStrings.boolean
    - typingsSlinky.emberController.emberControllerStrings.number
    - typingsSlinky.emberController.emberControllerStrings.array
    - typingsSlinky.emberController.emberControllerStrings.string
  */
  trait QueryParamTypes extends StObject
  object QueryParamTypes {
    
    @scala.inline
    def array: typingsSlinky.emberController.emberControllerStrings.array = "array".asInstanceOf[typingsSlinky.emberController.emberControllerStrings.array]
    
    @scala.inline
    def boolean: typingsSlinky.emberController.emberControllerStrings.boolean = "boolean".asInstanceOf[typingsSlinky.emberController.emberControllerStrings.boolean]
    
    @scala.inline
    def number: typingsSlinky.emberController.emberControllerStrings.number = "number".asInstanceOf[typingsSlinky.emberController.emberControllerStrings.number]
    
    @scala.inline
    def string: typingsSlinky.emberController.emberControllerStrings.string = "string".asInstanceOf[typingsSlinky.emberController.emberControllerStrings.string]
  }
  
  @js.native
  trait Registry extends StObject
}
