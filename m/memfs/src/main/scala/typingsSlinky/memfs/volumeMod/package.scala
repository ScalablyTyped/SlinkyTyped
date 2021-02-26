package typingsSlinky.memfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def bufferToEncoding(buffer: typingsSlinky.node.Buffer): typingsSlinky.memfs.encodingMod.TDataOut = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("bufferToEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.memfs.encodingMod.TDataOut]
  @scala.inline
  def bufferToEncoding(buffer: typingsSlinky.node.Buffer, encoding: typingsSlinky.memfs.encodingMod.TEncodingExtended): typingsSlinky.memfs.encodingMod.TDataOut = (typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("bufferToEncoding")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.memfs.encodingMod.TDataOut]
  
  @scala.inline
  def dataToBuffer(data: typingsSlinky.memfs.volumeMod.TData): typingsSlinky.node.Buffer = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def dataToBuffer(data: typingsSlinky.memfs.volumeMod.TData, encoding: java.lang.String): typingsSlinky.node.Buffer = (typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToBuffer")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def dataToStr(data: typingsSlinky.memfs.volumeMod.TData): java.lang.String = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToStr")(data.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def dataToStr(data: typingsSlinky.memfs.volumeMod.TData, encoding: java.lang.String): java.lang.String = (typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToStr")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def filenameToSteps(filename: java.lang.String): js.Array[java.lang.String] = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("filenameToSteps")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def filenameToSteps(filename: java.lang.String, base: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("filenameToSteps")(filename.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def flagsToNumber(): scala.Double = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("flagsToNumber")().asInstanceOf[scala.Double]
  @scala.inline
  def flagsToNumber(flags: typingsSlinky.memfs.volumeMod.TFlags): scala.Double = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("flagsToNumber")(flags.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def pathToFilename(path: typingsSlinky.node.fsMod.PathLike): java.lang.String = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToFilename")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def pathToSteps(path: typingsSlinky.node.fsMod.PathLike): js.Array[java.lang.String] = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToSteps")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def toUnixTimestamp(time: js.Any): js.Any = typingsSlinky.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("toUnixTimestamp")(time.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
