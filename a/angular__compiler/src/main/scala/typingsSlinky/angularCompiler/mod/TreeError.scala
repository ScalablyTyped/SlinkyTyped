package typingsSlinky.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typingsSlinky.angularCompiler.compilerMod.TreeError {
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
  
  @JSImport("@angular/compiler", "TreeError.create")
  @js.native
  def create(
    elementName: String,
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
  @JSImport("@angular/compiler", "TreeError.create")
  @js.native
  def create(
    elementName: Null,
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String
  ): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
}
