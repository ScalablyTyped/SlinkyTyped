package typingsSlinky.fastDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outTypesMod {
  import typingsSlinky.std.Record

  type DeepFilterFunction = typingsSlinky.atNodelibFsDotWalk.outSettingsMod.DeepFilterFunction
  type Entry = typingsSlinky.atNodelibFsDotWalk.outTypesMod.Entry
  type EntryFilterFunction = typingsSlinky.atNodelibFsDotWalk.outSettingsMod.EntryFilterFunction
  type EntryItem = String | Entry
  type EntryTransformerFunction = js.Function1[/* entry */ Entry, EntryItem]
  type ErrnoException = typingsSlinky.node.NodeJS.ErrnoException
  type ErrorFilterFunction = typingsSlinky.atNodelibFsDotWalk.outSettingsMod.ErrorFilterFunction
  type FileSystemAdapter = typingsSlinky.atNodelibFsDotScandir.outAdaptersFsMod.FileSystemAdapter
  type Pattern = String
  type PatternRe = js.RegExp
  type PatternsGroup = Record[String, js.Array[Pattern]]
}
