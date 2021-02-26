package typingsSlinky.karmaMaterialReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Visualize karma test results in real time with material designed reporter
      * See {@link https://github.com/ameerthehacker/karma-material-reporter#availble-configurations}
      */
    var materialReporter: js.UndefOr[MaterialReporterOptions] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaterialReporter(value: MaterialReporterOptions): Self = StObject.set(x, "materialReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterialReporterUndefined: Self = StObject.set(x, "materialReporter", js.undefined)
    }
  }
  
  @js.native
  trait MaterialReporterOptions extends StObject {
    
    /**
      * whether to open the reporter UI automatically in the default browser
      * @default true
      */
    var autoOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * expand all the expandable suite menus
      * @default true
      */
    var expandSuites: js.UndefOr[Boolean] = js.native
    
    /**
      * port in which the reporter startes a express server
      * @default 3000
      */
    var serverPort: js.UndefOr[Double] = js.native
  }
  object MaterialReporterOptions {
    
    @scala.inline
    def apply(): MaterialReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialReporterOptions]
    }
    
    @scala.inline
    implicit class MaterialReporterOptionsMutableBuilder[Self <: MaterialReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      @scala.inline
      def setExpandSuites(value: Boolean): Self = StObject.set(x, "expandSuites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandSuitesUndefined: Self = StObject.set(x, "expandSuites", js.undefined)
      
      @scala.inline
      def setServerPort(value: Double): Self = StObject.set(x, "serverPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerPortUndefined: Self = StObject.set(x, "serverPort", js.undefined)
    }
  }
}
