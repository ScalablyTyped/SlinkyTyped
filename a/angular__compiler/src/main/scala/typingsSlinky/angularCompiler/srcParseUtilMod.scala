package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.angularCompiler.anon.After
import typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/parse_util", JSImport.Namespace)
@js.native
object srcParseUtilMod extends js.Object {
  
  def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  
  def typeSourceSpan(kind: String, `type`: CompileIdentifierMetadata): ParseSourceSpan = js.native
  
  @js.native
  class ParseError protected () extends js.Object {
    def this(span: ParseSourceSpan, msg: String) = this()
    def this(span: ParseSourceSpan, msg: String, level: ParseErrorLevel) = this()
    
    def contextualMessage(): String = js.native
    
    var level: ParseErrorLevel = js.native
    
    var msg: String = js.native
    
    var span: ParseSourceSpan = js.native
  }
  
  @js.native
  sealed trait ParseErrorLevel extends js.Object
  @js.native
  object ParseErrorLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ParseErrorLevel with Double] = js.native
    
    @js.native
    sealed trait ERROR extends ParseErrorLevel
    /* 1 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    @js.native
    sealed trait WARNING extends ParseErrorLevel
    /* 0 */ @js.native
    object WARNING extends TopLevel[WARNING with Double]
  }
  
  @js.native
  class ParseLocation protected () extends js.Object {
    def this(file: ParseSourceFile, offset: Double, line: Double, col: Double) = this()
    
    var col: Double = js.native
    
    var file: ParseSourceFile = js.native
    
    def getContext(maxChars: Double, maxLines: Double): After | Null = js.native
    
    var line: Double = js.native
    
    def moveBy(delta: Double): ParseLocation = js.native
    
    var offset: Double = js.native
  }
  
  @js.native
  class ParseSourceFile protected () extends js.Object {
    def this(content: String, url: String) = this()
    
    var content: String = js.native
    
    var url: String = js.native
  }
  
  @js.native
  class ParseSourceSpan protected () extends js.Object {
    def this(start: ParseLocation, end: ParseLocation) = this()
    def this(start: ParseLocation, end: ParseLocation, details: String) = this()
    
    var details: String | Null = js.native
    
    var end: ParseLocation = js.native
    
    var start: ParseLocation = js.native
  }
}
