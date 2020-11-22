package typingsSlinky.intlMessageformat.formattersMod

import typingsSlinky.intlMessageformat.intlMessageformatNumbers.`0`
import typingsSlinky.intlMessageformat.intlMessageformatNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformat.formattersMod.LiteralPart
  - typingsSlinky.intlMessageformat.formattersMod.ObjectPart[T]
*/
trait MessageFormatPart[T] extends js.Object
object MessageFormatPart {
  
  @scala.inline
  def LiteralPart[T](`type`: `0`, value: String): MessageFormatPart[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFormatPart[T]]
  }
  
  @scala.inline
  def ObjectPart[T](`type`: `1`, value: T): MessageFormatPart[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFormatPart[T]]
  }
}
