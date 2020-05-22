package typingsSlinky.jestHasteMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DuplicatesIndex = typingsSlinky.std.Map[
    java.lang.String, 
    typingsSlinky.std.Map[java.lang.String, typingsSlinky.jestHasteMap.typesMod.DuplicatesSet]
  ]
  type DuplicatesSet = typingsSlinky.std.Map[java.lang.String, /* type */ scala.Double]
  type EventsQueue = js.Array[typingsSlinky.jestHasteMap.anon.FilePath]
  type FileData = typingsSlinky.std.Map[
    typingsSlinky.jestTypes.configMod.Path, 
    typingsSlinky.jestHasteMap.typesMod.FileMetaData
  ]
  type FileMetaData = js.Tuple6[
    java.lang.String, 
    scala.Double, 
    scala.Double, 
    typingsSlinky.jestHasteMap.jestHasteMapNumbers.`0` | typingsSlinky.jestHasteMap.jestHasteMapNumbers.`1`, 
    java.lang.String, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type HasteRegExp = js.RegExp | (js.Function1[/* str */ java.lang.String, scala.Boolean])
  type IgnoreMatcher = js.Function1[/* item */ java.lang.String, scala.Boolean]
  type Mapper = js.Function1[/* item */ java.lang.String, js.Array[java.lang.String] | scala.Null]
  type MockData = typingsSlinky.std.Map[java.lang.String, typingsSlinky.jestTypes.configMod.Path]
  type ModuleMapData = typingsSlinky.std.Map[java.lang.String, typingsSlinky.jestHasteMap.typesMod.ModuleMapItem]
  type ModuleMapItem = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jestHasteMap.typesMod.ModuleMetaData]
  type ModuleMetaData = js.Tuple2[typingsSlinky.jestTypes.configMod.Path, /* type */ scala.Double]
  type WatchmanClocks = typingsSlinky.std.Map[typingsSlinky.jestTypes.configMod.Path, java.lang.String]
}
