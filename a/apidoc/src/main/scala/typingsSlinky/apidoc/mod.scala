package typingsSlinky.apidoc

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apidoc.anon.Data
import typingsSlinky.apidoc.anon.DocBlocksRegExp
import typingsSlinky.apidoc.anon.GetGroup
import typingsSlinky.apidoc.anon.Global
import typingsSlinky.apidoc.anon.PostFilter
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apidoc", "createDoc")
  @js.native
  def createDoc(options: DocOptions): Boolean | Data = js.native
  
  @js.native
  trait DocOptions extends StObject {
    
    var apiprivate: js.UndefOr[Boolean] = js.native
    
    var colorize: js.UndefOr[Boolean] = js.native
    
    var config: js.UndefOr[String] = js.native
    
    var copyDefinitions: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var dest: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var excludeFilters: js.UndefOr[js.Array[String]] = js.native
    
    var filterBy: js.UndefOr[String | js.Array[String]] = js.native
    
    var filters: js.UndefOr[(Record[String, String]) | StringDictionary[PostFilter]] = js.native
    
    var includeFilters: js.UndefOr[js.Array[String]] = js.native
    
    var languages: js.UndefOr[(Record[String, String]) | StringDictionary[DocBlocksRegExp]] = js.native
    
    var lineEnding: js.UndefOr[String] = js.native
    
    var markdown: js.UndefOr[Boolean] = js.native
    
    var parse: js.UndefOr[Boolean] = js.native
    
    var parsers: js.UndefOr[(Record[String, String]) | GetGroup] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var simulate: js.UndefOr[Boolean] = js.native
    
    var single: js.UndefOr[Boolean] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var templateSingleFile: js.UndefOr[String] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var workers: js.UndefOr[(Record[String, String]) | StringDictionary[js.Any]] = js.native
  }
  object DocOptions {
    
    @scala.inline
    def apply(): DocOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocOptions]
    }
    
    @scala.inline
    implicit class DocOptionsMutableBuilder[Self <: DocOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiprivate(value: Boolean): Self = StObject.set(x, "apiprivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiprivateUndefined: Self = StObject.set(x, "apiprivate", js.undefined)
      
      @scala.inline
      def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setCopyDefinitions(value: Boolean): Self = StObject.set(x, "copyDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyDefinitionsUndefined: Self = StObject.set(x, "copyDefinitions", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExcludeFilters(value: js.Array[String]): Self = StObject.set(x, "excludeFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFiltersUndefined: Self = StObject.set(x, "excludeFilters", js.undefined)
      
      @scala.inline
      def setExcludeFiltersVarargs(value: String*): Self = StObject.set(x, "excludeFilters", js.Array(value :_*))
      
      @scala.inline
      def setFilterBy(value: String | js.Array[String]): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      @scala.inline
      def setFilterByVarargs(value: String*): Self = StObject.set(x, "filterBy", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: (Record[String, String]) | StringDictionary[PostFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setIncludeFilters(value: js.Array[String]): Self = StObject.set(x, "includeFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFiltersUndefined: Self = StObject.set(x, "includeFilters", js.undefined)
      
      @scala.inline
      def setIncludeFiltersVarargs(value: String*): Self = StObject.set(x, "includeFilters", js.Array(value :_*))
      
      @scala.inline
      def setLanguages(value: (Record[String, String]) | StringDictionary[DocBlocksRegExp]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      @scala.inline
      def setLineEnding(value: String): Self = StObject.set(x, "lineEnding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineEndingUndefined: Self = StObject.set(x, "lineEnding", js.undefined)
      
      @scala.inline
      def setMarkdown(value: Boolean): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
      
      @scala.inline
      def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setParsers(value: (Record[String, String]) | GetGroup): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSimulate(value: Boolean): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      @scala.inline
      def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateSingleFile(value: String): Self = StObject.set(x, "templateSingleFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateSingleFileUndefined: Self = StObject.set(x, "templateSingleFile", js.undefined)
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setWorkers(value: (Record[String, String]) | StringDictionary[js.Any]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  @js.native
  trait ParsedFile extends StObject {
    
    var blocks: js.Array[Global] = js.native
    
    var extension: String = js.native
    
    var filename: String = js.native
    
    var src: String = js.native
  }
  object ParsedFile {
    
    @scala.inline
    def apply(blocks: js.Array[Global], extension: String, filename: String, src: String): ParsedFile = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFile]
    }
    
    @scala.inline
    implicit class ParsedFileMutableBuilder[Self <: ParsedFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: js.Array[Global]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksVarargs(value: Global*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
