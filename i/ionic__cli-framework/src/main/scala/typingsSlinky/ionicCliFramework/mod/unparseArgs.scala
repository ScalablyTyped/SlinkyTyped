package typingsSlinky.ionicCliFramework.mod

import typingsSlinky.ionicCliFramework.optionsMod.UnparseArgsOptions
import typingsSlinky.minimist.mod.Opts
import typingsSlinky.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework", "unparseArgs")
@js.native
object unparseArgs extends js.Object {
  
  def apply(parsedArgs: ParsedArgs): js.Array[String] = js.native
  def apply(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: js.UndefOr[scala.Nothing],
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  def apply(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = js.native
  def apply(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
}
