package typingsSlinky.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Cache = typingsSlinky.std.Map[java.lang.String, typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult]
  type Config = js.Any
  type CosmiconfigResult = typingsSlinky.cosmiconfig.AnonConfig | scala.Null
  type LoadedFileContent = js.UndefOr[typingsSlinky.cosmiconfig.typesMod.Config | scala.Null]
  type Loaders = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cosmiconfig.mod.Loader]
  type LoadersSync = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cosmiconfig.mod.LoaderSync]
}
