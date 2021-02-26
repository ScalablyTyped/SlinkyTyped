package typingsSlinky.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief zip 格式文件压缩解压模块
  * @detail 使用方法：,```JavaScript,var zip = require('zip');,```
  */
object zipMod {
  
  @JSImport("zip", "ZIP_DEFLATED")
  @js.native
  val ZIP_DEFLATED: /* 1 */ Double = js.native
  
  @JSImport("zip", "ZIP_STORED")
  @js.native
  val ZIP_STORED: /* 0 */ Double = js.native
  
  @JSImport("zip", "isZipFile")
  @js.native
  def isZipFile(filename: String): Boolean = js.native
  
  @JSImport("zip", "open")
  @js.native
  def open(data: ClassBuffer): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(data: ClassBuffer, mod: js.UndefOr[scala.Nothing], compress_type: Double): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(data: ClassBuffer, mod: String): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(data: ClassBuffer, mod: String, compress_type: Double): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(path: String): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(path: String, mod: js.UndefOr[scala.Nothing], compress_type: Double): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(path: String, mod: String): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(path: String, mod: String, compress_type: Double): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(strm: ClassSeekableStream): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(strm: ClassSeekableStream, mod: js.UndefOr[scala.Nothing], compress_type: Double): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(strm: ClassSeekableStream, mod: String): ClassZipFile = js.native
  @JSImport("zip", "open")
  @js.native
  def open(strm: ClassSeekableStream, mod: String, compress_type: Double): ClassZipFile = js.native
}
