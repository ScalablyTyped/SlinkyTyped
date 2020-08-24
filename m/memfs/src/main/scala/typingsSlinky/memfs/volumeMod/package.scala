package typingsSlinky.memfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object volumeMod {
  type DirectoryContent = java.lang.String | scala.Null
  type DirectoryJSON = org.scalablytyped.runtime.StringDictionary[typingsSlinky.memfs.volumeMod.DirectoryContent]
  type IAppendFileOptions = typingsSlinky.memfs.volumeMod.IFileOptions
  type IWriteFileOptions = typingsSlinky.memfs.volumeMod.IFileOptions
  type TCallback[TData] = js.Function2[
    /* error */ js.UndefOr[typingsSlinky.memfs.volumeMod.IError | scala.Null], 
    /* data */ js.UndefOr[TData], 
    scala.Unit
  ]
  type TData = typingsSlinky.memfs.encodingMod.TDataOut | js.typedarray.Uint8Array
  type TFileId = typingsSlinky.node.fsMod.PathLike | scala.Double
  type TFlags = java.lang.String | scala.Double
  type TFlagsCopy = scala.Double
  type TMode = java.lang.String | scala.Double
  type TTime = scala.Double | java.lang.String | js.Date
}
