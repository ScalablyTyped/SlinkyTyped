package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件路径处理模块
  * @detail 引用方法：,```JavaScript,var path = require('path').win32;,```
  */
@JSImport("path_win32", JSImport.Namespace)
@js.native
object pathWin32Mod extends js.Object {
  
  def basename(path: String): String = js.native
  def basename(path: String, ext: String): String = js.native
  
  val delimiter: String = js.native
  
  def dirname(path: String): String = js.native
  
  def extname(path: String): String = js.native
  
  def fullpath(path: String): String = js.native
  
  def isAbsolute(path: String): Boolean = js.native
  
  def join(ps: js.Any*): String = js.native
  
  def normalize(path: String): String = js.native
  
  val posix: js.Object = js.native
  
  def relative(_from: String, to: String): String = js.native
  
  def resolve(ps: js.Any*): String = js.native
  
  val sep: String = js.native
  
  def toNamespacedPath(): js.Any = js.native
  def toNamespacedPath(path: js.Any): js.Any = js.native
  
  val win32: js.Object = js.native
}
