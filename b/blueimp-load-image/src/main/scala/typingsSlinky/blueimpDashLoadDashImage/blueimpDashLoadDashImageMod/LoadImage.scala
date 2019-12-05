package typingsSlinky.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import org.scalajs.dom.raw.FileReader
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.blueimpDashLoadDashImage.blueimpDashLoadDashImageNumbers.`false`
import typingsSlinky.std.Blob
import typingsSlinky.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// loadImage is implemented as a callable object.
@js.native
trait LoadImage extends js.Object {
  def apply(file: String, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: Blob, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: File, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def blobSlice(`this`: org.scalajs.dom.raw.Blob): org.scalajs.dom.raw.Blob = js.native
  def blobSlice(`this`: org.scalajs.dom.raw.Blob, start: Double): org.scalajs.dom.raw.Blob = js.native
  def blobSlice(`this`: org.scalajs.dom.raw.Blob, start: Double, end: Double): org.scalajs.dom.raw.Blob = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  // Parses image meta data and calls the callback with the image head
  def parseMetaData(file: File, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
}

