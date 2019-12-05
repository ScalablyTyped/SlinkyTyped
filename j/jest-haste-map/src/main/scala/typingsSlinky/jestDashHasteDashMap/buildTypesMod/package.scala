package typingsSlinky.jestDashHasteDashMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atJestTypes.buildConfigMod.Path
  import typingsSlinky.jestDashHasteDashMap.Anon_FilePath
  import typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapNumbers.`0`
  import typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapNumbers.`1`
  import typingsSlinky.std.Map

  type DuplicatesIndex = Map[String, Map[String, DuplicatesSet]]
  type DuplicatesSet = Map[String, /* type */ Double]
  type EventsQueue = js.Array[Anon_FilePath]
  type FileData = Map[Path, FileMetaData]
  type FileMetaData = js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
  type HasteRegExp = js.RegExp | (js.Function1[/* str */ String, Boolean])
  type IgnoreMatcher = js.Function1[/* item */ String, Boolean]
  type Mapper = js.Function1[/* item */ String, js.Array[String] | Null]
  type MockData = Map[String, Path]
  type ModuleMapData = Map[String, ModuleMapItem]
  type ModuleMapItem = StringDictionary[ModuleMetaData]
  type ModuleMetaData = js.Tuple2[Path, /* type */ Double]
  type WatchmanClocks = Map[Path, String]
}
