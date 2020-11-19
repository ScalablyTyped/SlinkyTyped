package typingsSlinky.blueimpLoadImage.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.FileReader
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// loadImage is implemented as a callable object.
@js.native
trait LoadImage extends js.Object {
  
  def apply(file: String, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: Blob, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: File, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  
  def blobSlice(): Blob = js.native
  def blobSlice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def blobSlice(start: Double): Blob = js.native
  def blobSlice(start: Double, end: Double): Blob = js.native
  
  def parseMetaData(file: String, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: js.UndefOr[scala.Nothing], data: ImageHead): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: js.UndefOr[scala.Nothing], data: ImageHead): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  // Parses image meta data and calls the callback with the image head
  def parseMetaData(file: File, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: js.UndefOr[scala.Nothing], data: ImageHead): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
}
