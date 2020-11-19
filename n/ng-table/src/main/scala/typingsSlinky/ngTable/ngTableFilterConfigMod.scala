package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IServiceProvider
import typingsSlinky.angular.mod.auto.IInjectorService
import typingsSlinky.ngTable.publicInterfacesMod.IFilterConfigValues
import typingsSlinky.ngTable.publicInterfacesMod.IFilterTemplateDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/browser/ngTableFilterConfig", JSImport.Namespace)
@js.native
object ngTableFilterConfigMod extends js.Object {
  
  @js.native
  class NgTableFilterConfig protected () extends js.Object {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
    
    /**
      * Readonly copy of the final values used to configure the service.
      */
    val config: IFilterConfigValues = js.native
    
    /**
      * Return the url of the html filter template for the supplied definition and key.
      * For more information see the documentation for {@link IFilterTemplateMap}
      */
    def getTemplateUrl(filterDef: String): String = js.native
    def getTemplateUrl(filterDef: String, filterKey: String): String = js.native
    def getTemplateUrl(filterDef: IFilterTemplateDef): String = js.native
    def getTemplateUrl(filterDef: IFilterTemplateDef, filterKey: String): String = js.native
    
    /**
      * Return the url of the html filter template registered with the alias supplied
      */
    def getUrlForAlias(aliasName: String): String = js.native
    def getUrlForAlias(aliasName: String, filterKey: String): String = js.native
  }
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableFilterConfigProvider protected () extends IServiceProvider {
    def this($injector: IInjectorService) = this()
    
    @JSName("$get")
    def $get_MNgTableFilterConfigProvider(): NgTableFilterConfig = js.native
    
    var config: js.Any = js.native
    
    var defaultConfig: js.Any = js.native
    
    /**
      * Reset back to factory defaults the config values that `NgTableFilterConfig` service will use
      */
    def resetConfigs(): Unit = js.native
    
    /**
      * Set the config values used by `NgTableFilterConfig` service
      */
    def setConfig(customConfig: IFilterConfigValues): Unit = js.native
  }
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
}
