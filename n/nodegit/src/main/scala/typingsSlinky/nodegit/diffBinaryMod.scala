package typingsSlinky.nodegit

import typingsSlinky.nodegit.diffBinaryFileMod.DiffBinaryFile
import typingsSlinky.nodegit.diffBinaryMod.DiffBinary.DIFF_BINARY
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffBinaryMod {
  
  @JSImport("nodegit/diff-binary", "DiffBinary")
  @js.native
  class DiffBinary () extends StObject {
    
    var containsData: DIFF_BINARY = js.native
    
    var newFile: DiffBinaryFile = js.native
    
    var oldFile: DiffBinaryFile = js.native
  }
  object DiffBinary {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
    */
    trait DIFF_BINARY extends StObject
    object DIFF_BINARY {
      
      @scala.inline
      def DELTA: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def LITERAL: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
