package typingsSlinky.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter[T] extends StObject {
  
  def formatEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T = js.native
  
  def formatUnknownEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T = js.native
}
object Formatter {
  
  @scala.inline
  def apply[T](
    formatEntry: (Double, Double, String, js.Array[String]) => T,
    formatUnknownEntry: (Double, Double, String, js.Array[String]) => T
  ): Formatter[T] = {
    val __obj = js.Dynamic.literal(formatEntry = js.Any.fromFunction4(formatEntry), formatUnknownEntry = js.Any.fromFunction4(formatUnknownEntry))
    __obj.asInstanceOf[Formatter[T]]
  }
  
  @scala.inline
  implicit class FormatterMutableBuilder[Self <: Formatter[_], T] (val x: Self with Formatter[T]) extends AnyVal {
    
    @scala.inline
    def setFormatEntry(value: (Double, Double, String, js.Array[String]) => T): Self = StObject.set(x, "formatEntry", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFormatUnknownEntry(value: (Double, Double, String, js.Array[String]) => T): Self = StObject.set(x, "formatUnknownEntry", js.Any.fromFunction4(value))
  }
}
