package typingsSlinky.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.angularCompiler.srcParseUtilMod.ParseError because Already inherited
- typingsSlinky.angularCompiler.mlParserParserMod.TreeError because Already inherited
- typingsSlinky.angularCompiler.xmlParserMod.TreeError because Inheritance from two classes. Inlined  */ @JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typingsSlinky.angularCompiler.htmlParserMod.TreeError {
  def this(
    elementName: String,
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
  def this(
    elementName: Null,
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
}
/* static members */
object TreeError {
  
  @JSImport("@angular/compiler/src/compiler", "TreeError.create")
  @js.native
  def create(
    elementName: String,
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
  @JSImport("@angular/compiler/src/compiler", "TreeError.create")
  @js.native
  def create(
    elementName: Null,
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
}
