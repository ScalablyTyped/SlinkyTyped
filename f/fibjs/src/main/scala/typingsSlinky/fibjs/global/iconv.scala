package typingsSlinky.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconv {
  
  @JSGlobal("__iconv.decode")
  @js.native
  def decode(charset: String, data: typingsSlinky.fibjs.ClassBuffer): String = js.native
  
  @JSGlobal("__iconv.encode")
  @js.native
  def encode(charset: String, data: String): typingsSlinky.fibjs.ClassBuffer = js.native
  
  @JSGlobal("__iconv.isEncoding")
  @js.native
  def isEncoding(charset: String): Boolean = js.native
}
