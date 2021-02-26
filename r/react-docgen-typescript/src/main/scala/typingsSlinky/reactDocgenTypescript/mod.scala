package typingsSlinky.reactDocgenTypescript

import typingsSlinky.reactDocgenTypescript.parserMod.ComponentDoc
import typingsSlinky.reactDocgenTypescript.parserMod.FileParser
import typingsSlinky.reactDocgenTypescript.parserMod.ParserOptions
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-docgen-typescript", "Parser")
  @js.native
  class Parser protected ()
    extends typingsSlinky.reactDocgenTypescript.parserMod.Parser {
    def this(program: Program, opts: ParserOptions) = this()
  }
  
  @JSImport("react-docgen-typescript", "getDefaultExportForFile")
  @js.native
  def getDefaultExportForFile(source: SourceFile): String = js.native
  
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: String, parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript", "parse")
  @js.native
  def parse(filePathOrPaths: js.Array[String], parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  
  @JSImport("react-docgen-typescript", "withCompilerOptions")
  @js.native
  def withCompilerOptions(compilerOptions: CompilerOptions): FileParser = js.native
  @JSImport("react-docgen-typescript", "withCompilerOptions")
  @js.native
  def withCompilerOptions(compilerOptions: CompilerOptions, parserOpts: ParserOptions): FileParser = js.native
  
  @JSImport("react-docgen-typescript", "withCustomConfig")
  @js.native
  def withCustomConfig(tsconfigPath: String, parserOpts: ParserOptions): FileParser = js.native
  
  @JSImport("react-docgen-typescript", "withDefaultConfig")
  @js.native
  def withDefaultConfig(): FileParser = js.native
  @JSImport("react-docgen-typescript", "withDefaultConfig")
  @js.native
  def withDefaultConfig(parserOpts: ParserOptions): FileParser = js.native
}
