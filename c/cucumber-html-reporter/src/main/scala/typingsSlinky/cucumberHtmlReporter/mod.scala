package typingsSlinky.cucumberHtmlReporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cucumber-html-reporter", "generate")
  @js.native
  def generate(options: Options): Unit = js.native
  @JSImport("cucumber-html-reporter", "generate")
  @js.native
  def generate(options: Options, callback: js.Function0[Unit]): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var columnLayout: js.UndefOr[Double] = js.native
    
    var ignoreBadJsonFile: js.UndefOr[Boolean] = js.native
    
    var jsonDir: js.UndefOr[String] = js.native
    
    var jsonFile: String = js.native
    
    var launchReport: Boolean = js.native
    
    var metadata: js.UndefOr[StringDictionary[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var noInlineScreenshots: js.UndefOr[Boolean] = js.native
    
    var output: String = js.native
    
    var reportSuiteAsScenarios: Boolean = js.native
    
    var screenshotsDirectory: js.UndefOr[String] = js.native
    
    var storeScreenshots: js.UndefOr[Boolean] = js.native
    
    var theme: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      jsonFile: String,
      launchReport: Boolean,
      output: String,
      reportSuiteAsScenarios: Boolean,
      theme: String
    ): Options = {
      val __obj = js.Dynamic.literal(jsonFile = jsonFile.asInstanceOf[js.Any], launchReport = launchReport.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reportSuiteAsScenarios = reportSuiteAsScenarios.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnLayout(value: Double): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnLayoutUndefined: Self = StObject.set(x, "columnLayout", js.undefined)
      
      @scala.inline
      def setIgnoreBadJsonFile(value: Boolean): Self = StObject.set(x, "ignoreBadJsonFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBadJsonFileUndefined: Self = StObject.set(x, "ignoreBadJsonFile", js.undefined)
      
      @scala.inline
      def setJsonDir(value: String): Self = StObject.set(x, "jsonDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonDirUndefined: Self = StObject.set(x, "jsonDir", js.undefined)
      
      @scala.inline
      def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchReport(value: Boolean): Self = StObject.set(x, "launchReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoInlineScreenshots(value: Boolean): Self = StObject.set(x, "noInlineScreenshots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInlineScreenshotsUndefined: Self = StObject.set(x, "noInlineScreenshots", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportSuiteAsScenarios(value: Boolean): Self = StObject.set(x, "reportSuiteAsScenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotsDirectory(value: String): Self = StObject.set(x, "screenshotsDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotsDirectoryUndefined: Self = StObject.set(x, "screenshotsDirectory", js.undefined)
      
      @scala.inline
      def setStoreScreenshots(value: Boolean): Self = StObject.set(x, "storeScreenshots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreScreenshotsUndefined: Self = StObject.set(x, "storeScreenshots", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
