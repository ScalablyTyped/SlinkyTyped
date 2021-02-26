package typingsSlinky.karmaCoverage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbul.mod.Store
import typingsSlinky.karmaCoverage.anon.KarmaCoverageReporterrepo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * {@link https://github.com/karma-runner/karma-coverage/blob/v1.1.2/docs/configuration.md }
      */
    var coverageReporter: js.UndefOr[KarmaCoverageReporterrepo] = js.native
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
      def setCoverageReporter(value: KarmaCoverageReporterrepo): Self = StObject.set(x, "coverageReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageReporterUndefined: Self = StObject.set(x, "coverageReporter", js.undefined)
    }
  }
  
  @js.native
  trait KarmaCoverageReporter
    extends /* moreSettings */ StringDictionary[js.Any] {
    
    /** This will be used to configure minimum threshold enforcement for coverage results */
    var check: js.UndefOr[js.Any] = js.native
    
    /** This will be used to output coverage reports. When you set a relative path, the directory is resolved against the basePath. */
    var dir: js.UndefOr[String] = js.native
    
    /** If you use one of these reporters, `cobertura`, `lcovonly`, `teamcity`, `text` or `text-summary`, you may set the file option to specify the output file */
    var file: js.UndefOr[String] = js.native
    
    /**
      * You can opt to include all sources files, as indicated by the coverage preprocessor,
      * in your code coverage data, even if there are no tests covering them
      */
    var includeAllSources: js.UndefOr[Boolean] = js.native
    
    /**
      * Karma-coverage can infers the instrumenter regarding of the file extension.
      * It is possible to override this behavior and point out an instrumenter
      * for the files matching a specific pattern.
      */
    var instrumenter: js.UndefOr[js.Any] = js.native
    
    /** You can use multiple reporters, by providing array of options */
    var reporters: js.UndefOr[js.Array[Reporter]] = js.native
    
    /** You can opt to specify a source store allowing for external coverage collectors access to the instrumented code. */
    var sourceStore: js.UndefOr[Store] = js.native
    
    /** This will be used in complement of the coverageReporter.dir option to generate the full output directory path */
    var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.native
    
    /** Specify a reporter type */
    var `type`: js.UndefOr[ReporterType] = js.native
    
    /**
      * If set to true, then CoffeeScript files instrumented with Ibrik will use
      * the .js extension for the transpiled source (without this option,
      * the JavaScript files will keep the original .coffee extension)
      */
    var useJSExtensionForCoffeeScript: js.UndefOr[Boolean] = js.native
    
    /** This will be used to set the coverage threshold colors */
    var watermarks: js.UndefOr[js.Any] = js.native
  }
  object KarmaCoverageReporter {
    
    @scala.inline
    def apply(): KarmaCoverageReporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KarmaCoverageReporter]
    }
    
    @scala.inline
    implicit class KarmaCoverageReporterMutableBuilder[Self <: KarmaCoverageReporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: js.Any): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setIncludeAllSources(value: Boolean): Self = StObject.set(x, "includeAllSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAllSourcesUndefined: Self = StObject.set(x, "includeAllSources", js.undefined)
      
      @scala.inline
      def setInstrumenter(value: js.Any): Self = StObject.set(x, "instrumenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumenterUndefined: Self = StObject.set(x, "instrumenter", js.undefined)
      
      @scala.inline
      def setReporters(value: js.Array[Reporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      @scala.inline
      def setReportersVarargs(value: Reporter*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      @scala.inline
      def setSourceStore(value: Store): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStoreUndefined: Self = StObject.set(x, "sourceStore", js.undefined)
      
      @scala.inline
      def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirFunction1(value: /* browser */ String => String): Self = StObject.set(x, "subdir", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      @scala.inline
      def setType(value: ReporterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseJSExtensionForCoffeeScript(value: Boolean): Self = StObject.set(x, "useJSExtensionForCoffeeScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseJSExtensionForCoffeeScriptUndefined: Self = StObject.set(x, "useJSExtensionForCoffeeScript", js.undefined)
      
      @scala.inline
      def setWatermarks(value: js.Any): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarksUndefined: Self = StObject.set(x, "watermarks", js.undefined)
    }
  }
  
  @js.native
  trait Reporter extends StObject {
    
    var dir: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.native
    
    var `type`: ReporterType = js.native
  }
  object Reporter {
    
    @scala.inline
    def apply(`type`: ReporterType): Reporter = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reporter]
    }
    
    @scala.inline
    implicit class ReporterMutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setSubdir(value: String | (js.Function1[/* browser */ String, String])): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdirFunction1(value: /* browser */ String => String): Self = StObject.set(x, "subdir", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubdirUndefined: Self = StObject.set(x, "subdir", js.undefined)
      
      @scala.inline
      def setType(value: ReporterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.html
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.lcov
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.lcovonly
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.text
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.`text-summary`
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.cobertura
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.teamcity
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.json
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.`json-summary`
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.`in-memory`
    - typingsSlinky.karmaCoverage.karmaCoverageStrings.none
  */
  trait ReporterType extends StObject
  object ReporterType {
    
    @scala.inline
    def cobertura: typingsSlinky.karmaCoverage.karmaCoverageStrings.cobertura = "cobertura".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.cobertura]
    
    @scala.inline
    def html: typingsSlinky.karmaCoverage.karmaCoverageStrings.html = "html".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.html]
    
    @scala.inline
    def `in-memory`: typingsSlinky.karmaCoverage.karmaCoverageStrings.`in-memory` = "in-memory".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.`in-memory`]
    
    @scala.inline
    def json: typingsSlinky.karmaCoverage.karmaCoverageStrings.json = "json".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.json]
    
    @scala.inline
    def `json-summary`: typingsSlinky.karmaCoverage.karmaCoverageStrings.`json-summary` = "json-summary".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.`json-summary`]
    
    @scala.inline
    def lcov: typingsSlinky.karmaCoverage.karmaCoverageStrings.lcov = "lcov".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.lcov]
    
    @scala.inline
    def lcovonly: typingsSlinky.karmaCoverage.karmaCoverageStrings.lcovonly = "lcovonly".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.lcovonly]
    
    @scala.inline
    def none: typingsSlinky.karmaCoverage.karmaCoverageStrings.none = "none".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.none]
    
    @scala.inline
    def teamcity: typingsSlinky.karmaCoverage.karmaCoverageStrings.teamcity = "teamcity".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.teamcity]
    
    @scala.inline
    def text: typingsSlinky.karmaCoverage.karmaCoverageStrings.text = "text".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.text]
    
    @scala.inline
    def `text-summary`: typingsSlinky.karmaCoverage.karmaCoverageStrings.`text-summary` = "text-summary".asInstanceOf[typingsSlinky.karmaCoverage.karmaCoverageStrings.`text-summary`]
  }
}
