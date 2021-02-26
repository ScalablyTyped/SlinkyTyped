package typingsSlinky.dockerFileParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docker-file-parser", "parse")
  @js.native
  def parse(contents: String): js.Array[CommandEntry] = js.native
  @JSImport("docker-file-parser", "parse")
  @js.native
  def parse(contents: String, options: ParseOptions): js.Array[CommandEntry] = js.native
  
  @js.native
  trait CommandEntry extends StObject {
    
    var args: String | js.Array[String] | StringDictionary[String] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var lineno: Double = js.native
    
    var name: String = js.native
    
    var raw: String = js.native
  }
  object CommandEntry {
    
    @scala.inline
    def apply(
      args: String | js.Array[String] | StringDictionary[String],
      lineno: Double,
      name: String,
      raw: String
    ): CommandEntry = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandEntry]
    }
    
    @scala.inline
    implicit class CommandEntryMutableBuilder[Self <: CommandEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    var includeComments: Boolean = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(includeComments: Boolean): ParseOptions = {
      val __obj = js.Dynamic.literal(includeComments = includeComments.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeComments(value: Boolean): Self = StObject.set(x, "includeComments", value.asInstanceOf[js.Any])
    }
  }
}
