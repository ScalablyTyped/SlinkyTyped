package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Typeofts
import typingsSlinky.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod.TypeScriptConfigurationOverwrite
import typingsSlinky.typescript.mod.ParseConfigFileHost
import typingsSlinky.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptConfigurationParserMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptConfigurationParser", "getDependenciesFromTypeScriptConfiguration")
  @js.native
  def getDependenciesFromTypeScriptConfiguration(
    typescript: Typeofts,
    parsedConfiguration: ParsedCommandLine,
    configFileContext: String,
    parseConfigFileHost: ParseConfigFileHost
  ): Dependencies = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptConfigurationParser", "getDependenciesFromTypeScriptConfiguration")
  @js.native
  def getDependenciesFromTypeScriptConfiguration(
    typescript: Typeofts,
    parsedConfiguration: ParsedCommandLine,
    configFileContext: String,
    parseConfigFileHost: ParseConfigFileHost,
    processedConfigFiles: js.Array[String]
  ): Dependencies = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptConfigurationParser", "parseTypeScriptConfiguration")
  @js.native
  def parseTypeScriptConfiguration(
    typescript: Typeofts,
    configFileName: String,
    configFileContext: String,
    configOverwriteJSON: TypeScriptConfigurationOverwrite,
    parseConfigFileHost: ParseConfigFileHost
  ): ParsedCommandLine = js.native
}
