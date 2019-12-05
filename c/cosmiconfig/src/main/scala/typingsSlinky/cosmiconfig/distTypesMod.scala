package typingsSlinky.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cosmiconfig.cosmiconfigMod.Loader
import typingsSlinky.cosmiconfig.cosmiconfigMod.LoaderSync
import typingsSlinky.cosmiconfig.cosmiconfigMod.Options
import typingsSlinky.cosmiconfig.cosmiconfigMod.OptionsSync
import typingsSlinky.cosmiconfig.distTypesMod.Config
import typingsSlinky.cosmiconfig.distTypesMod.CosmiconfigResult
import typingsSlinky.std.Map
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  type Cache = Map[String, CosmiconfigResult]
  type Config = js.Any
  type CosmiconfigResult = Anon_Config | Null
  type ExplorerOptions = Required[Options]
  type ExplorerOptionsSync = Required[OptionsSync]
  type LoadedFileContent = js.UndefOr[Config | Null]
  type Loaders = StringDictionary[Loader]
  type LoadersSync = StringDictionary[LoaderSync]
}

