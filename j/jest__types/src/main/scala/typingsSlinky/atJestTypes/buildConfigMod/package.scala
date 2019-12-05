package typingsSlinky.atJestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildConfigMod {
  import typingsSlinky.atJestTypes.Anon_All
  import typingsSlinky.atJestTypes.Anon_Color
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record
  import typingsSlinky.yargs.yargsMod.Arguments

  type Argv = Arguments[Partial[Anon_All]]
  type ConfigGlobals = Record[String, js.Any]
  type DisplayName = String | Anon_Color
  type Glob = String
  type Path = String
  type ReporterConfig = js.Tuple2[String, Record[String, js.Any]]
  type TransformerConfig = js.Tuple2[String, Record[String, js.Any]]
}
