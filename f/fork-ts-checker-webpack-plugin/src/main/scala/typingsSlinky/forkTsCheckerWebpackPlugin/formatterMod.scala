package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterFactoryMod.ConfigurableFormatterType
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterFactoryMod.NotConfigurableFormatterType
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  
  def createBasicFormatter(): Formatter = js.native
  
  def createCodeFrameFormatter(): Formatter = js.native
  def createCodeFrameFormatter(options: BabelCodeFrameOptions): Formatter = js.native
  
  def createFormatter[T /* <: NotConfigurableFormatterType */](): Formatter = js.native
  def createFormatter[T /* <: NotConfigurableFormatterType */](`type`: T): Formatter = js.native
  def createFormatter[T /* <: ConfigurableFormatterType */](
    `type`: T,
    options: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  ): Formatter = js.native
  def createFormatter[T /* <: FormatterType */](`type`: T, options: js.Object): Formatter = js.native
  
  def createFormatterConfiguration(): Formatter = js.native
  def createFormatterConfiguration(options: FormatterOptions): Formatter = js.native
  
  @JSName("createFormatter")
  def createFormatter_T_ConfigurableFormatterType[T /* <: ConfigurableFormatterType */](`type`: T): Formatter = js.native
  @JSName("createFormatter")
  def createFormatter_T_FormatterType[T /* <: FormatterType */](`type`: T): Formatter = js.native
  
  def createWebpackFormatter(formatter: Formatter, context: String): Formatter = js.native
}
