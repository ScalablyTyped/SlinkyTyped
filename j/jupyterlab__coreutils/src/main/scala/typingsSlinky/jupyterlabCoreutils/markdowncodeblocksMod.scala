package typingsSlinky.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdowncodeblocksMod {
  
  object MarkdownCodeBlocks {
    
    @JSImport("@jupyterlab/coreutils/lib/markdowncodeblocks", "MarkdownCodeBlocks.CODE_BLOCK_MARKER")
    @js.native
    val CODE_BLOCK_MARKER: /* "```" */ String = js.native
    
    @JSImport("@jupyterlab/coreutils/lib/markdowncodeblocks", "MarkdownCodeBlocks.MarkdownCodeBlock")
    @js.native
    class MarkdownCodeBlock protected () extends StObject {
      def this(startLine: Double) = this()
      
      var code: String = js.native
      
      var endLine: Double = js.native
      
      var startLine: Double = js.native
    }
    
    /**
      * Construct all code snippets from current text
      * (this could be potentially optimized if we can cache and detect differences)
      * @param text - A string to parse codeblocks from
      *
      * @returns An array of MarkdownCodeBlocks.
      */
    @JSImport("@jupyterlab/coreutils/lib/markdowncodeblocks", "MarkdownCodeBlocks.findMarkdownCodeBlocks")
    @js.native
    def findMarkdownCodeBlocks(text: String): js.Array[MarkdownCodeBlock] = js.native
    
    /**
      * Check whether the given file extension is a markdown extension
      * @param extension - A file extension
      *
      * @returns true/false depending on whether this is a supported markdown extension
      */
    @JSImport("@jupyterlab/coreutils/lib/markdowncodeblocks", "MarkdownCodeBlocks.isMarkdown")
    @js.native
    def isMarkdown(extension: String): Boolean = js.native
  }
}
