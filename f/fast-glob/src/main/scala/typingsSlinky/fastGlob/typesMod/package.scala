package typingsSlinky.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DeepFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.DeepFilterFunction
  type Entry = typingsSlinky.nodelibFsWalk.typesMod.Entry
  type EntryFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.EntryFilterFunction
  type EntryItem = java.lang.String | typingsSlinky.fastGlob.typesMod.Entry
  type EntryTransformerFunction = js.Function1[
    /* entry */ typingsSlinky.fastGlob.typesMod.Entry, 
    typingsSlinky.fastGlob.typesMod.EntryItem
  ]
  type ErrnoException = typingsSlinky.node.NodeJS.ErrnoException
  type ErrorFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.ErrorFilterFunction
  type FileSystemAdapter = typingsSlinky.nodelibFsScandir.fsMod.FileSystemAdapter
  type Pattern = java.lang.String
  type PatternRe = js.RegExp
  type PatternsGroup = typingsSlinky.std.Record[java.lang.String, js.Array[typingsSlinky.fastGlob.typesMod.Pattern]]
}
