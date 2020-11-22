package typingsSlinky.reactDocgenTypescript

import typingsSlinky.reactDocgenTypescript.parserMod.ComponentDoc
import typingsSlinky.reactDocgenTypescript.parserMod.FileParser
import typingsSlinky.reactDocgenTypescript.parserMod.ParserOptions
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-docgen-typescript", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getDefaultExportForFile(source: SourceFile): String = js.native
  
  def parse(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
  def parse(filePathOrPaths: String, parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
  def parse(filePathOrPaths: js.Array[String], parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  
  def withCompilerOptions(compilerOptions: CompilerOptions): FileParser = js.native
  def withCompilerOptions(compilerOptions: CompilerOptions, parserOpts: ParserOptions): FileParser = js.native
  
  def withCustomConfig(tsconfigPath: String, parserOpts: ParserOptions): FileParser = js.native
  
  def withDefaultConfig(): FileParser = js.native
  def withDefaultConfig(parserOpts: ParserOptions): FileParser = js.native
  
  @js.native
  class Parser protected ()
    extends typingsSlinky.reactDocgenTypescript.parserMod.Parser {
    def this(program: Program, opts: ParserOptions) = this()
  }
}
