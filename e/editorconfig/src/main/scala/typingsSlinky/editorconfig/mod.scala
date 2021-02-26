package typingsSlinky.editorconfig

import typingsSlinky.editorconfig.editorconfigBooleans.`false`
import typingsSlinky.editorconfig.editorconfigBooleans.`true`
import typingsSlinky.editorconfig.editorconfigStrings.crlf
import typingsSlinky.editorconfig.editorconfigStrings.lf
import typingsSlinky.editorconfig.editorconfigStrings.space
import typingsSlinky.editorconfig.editorconfigStrings.tab
import typingsSlinky.editorconfig.editorconfigStrings.unset
import typingsSlinky.editorconfig.iniMod.ParseStringResult
import typingsSlinky.editorconfig.iniMod.SectionBody
import typingsSlinky.editorconfig.iniMod.SectionName
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("editorconfig/src", "parse")
  @js.native
  def parse(_filepath: String): js.Promise[KnownProps] = js.native
  @JSImport("editorconfig/src", "parse")
  @js.native
  def parse(_filepath: String, _options: ParseOptions): js.Promise[KnownProps] = js.native
  
  @JSImport("editorconfig/src", "parseFromFiles")
  @js.native
  def parseFromFiles(filepath: String, files: js.Promise[js.Array[ECFile]]): js.Promise[KnownProps] = js.native
  @JSImport("editorconfig/src", "parseFromFiles")
  @js.native
  def parseFromFiles(filepath: String, files: js.Promise[js.Array[ECFile]], options: ParseOptions): js.Promise[KnownProps] = js.native
  
  @JSImport("editorconfig/src", "parseFromFilesSync")
  @js.native
  def parseFromFilesSync(filepath: String, files: js.Array[ECFile]): KnownProps = js.native
  @JSImport("editorconfig/src", "parseFromFilesSync")
  @js.native
  def parseFromFilesSync(filepath: String, files: js.Array[ECFile], options: ParseOptions): KnownProps = js.native
  
  @JSImport("editorconfig/src", "parseString")
  @js.native
  def parseString(data: String): ParseStringResult = js.native
  
  @JSImport("editorconfig/src", "parseSync")
  @js.native
  def parseSync(_filepath: String): KnownProps = js.native
  @JSImport("editorconfig/src", "parseSync")
  @js.native
  def parseSync(_filepath: String, _options: ParseOptions): KnownProps = js.native
  
  @js.native
  trait ECFile extends StObject {
    
    var contents: String | Buffer = js.native
    
    var name: String = js.native
  }
  object ECFile {
    
    @scala.inline
    def apply(contents: String | Buffer, name: String): ECFile = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECFile]
    }
    
    @scala.inline
    implicit class ECFileMutableBuilder[Self <: ECFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: String | Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileConfig extends StObject {
    
    var contents: ParseStringResult = js.native
    
    var name: String = js.native
  }
  object FileConfig {
    
    @scala.inline
    def apply(contents: ParseStringResult, name: String): FileConfig = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileConfig]
    }
    
    @scala.inline
    implicit class FileConfigMutableBuilder[Self <: FileConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: ParseStringResult): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsVarargs(value: (js.Tuple2[SectionName, SectionBody])*): Self = StObject.set(x, "contents", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KnownProps extends StObject {
    
    var charset: js.UndefOr[String | unset] = js.native
    
    var end_of_line: js.UndefOr[lf | crlf | unset] = js.native
    
    var indent_size: js.UndefOr[Double | tab | unset] = js.native
    
    var indent_style: js.UndefOr[tab | space | unset] = js.native
    
    var insert_final_newline: js.UndefOr[`true` | `false` | unset] = js.native
    
    var tab_width: js.UndefOr[Double | unset] = js.native
    
    var trim_trailing_whitespace: js.UndefOr[`true` | `false` | unset] = js.native
  }
  object KnownProps {
    
    @scala.inline
    def apply(): KnownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnownProps]
    }
    
    @scala.inline
    implicit class KnownPropsMutableBuilder[Self <: KnownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String | unset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setEnd_of_line(value: lf | crlf | unset): Self = StObject.set(x, "end_of_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_of_lineUndefined: Self = StObject.set(x, "end_of_line", js.undefined)
      
      @scala.inline
      def setIndent_size(value: Double | tab | unset): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      @scala.inline
      def setIndent_style(value: tab | space | unset): Self = StObject.set(x, "indent_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_styleUndefined: Self = StObject.set(x, "indent_style", js.undefined)
      
      @scala.inline
      def setInsert_final_newline(value: `true` | `false` | unset): Self = StObject.set(x, "insert_final_newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert_final_newlineUndefined: Self = StObject.set(x, "insert_final_newline", js.undefined)
      
      @scala.inline
      def setTab_width(value: Double | unset): Self = StObject.set(x, "tab_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_widthUndefined: Self = StObject.set(x, "tab_width", js.undefined)
      
      @scala.inline
      def setTrim_trailing_whitespace(value: `true` | `false` | unset): Self = StObject.set(x, "trim_trailing_whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrim_trailing_whitespaceUndefined: Self = StObject.set(x, "trim_trailing_whitespace", js.undefined)
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    var config: js.UndefOr[String] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
