package typingsSlinky.fsPlus.mod

import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-plus", "appendFile")
@js.native
object appendFile extends js.Object {
  
  def apply(file: Double, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: js.typedarray.Uint8Array, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(
    file: PathLike,
    data: js.typedarray.Uint8Array,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = js.native
}
