package typingsSlinky.intlMessageformatParser.typesMod

import typingsSlinky.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typingsSlinky.intlMessageformatParser.intlMessageformatParserNumbers.`1`
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformatParser.typesMod.NumberSkeleton
  - typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
*/
trait Skeleton extends js.Object
object Skeleton {
  
  @scala.inline
  def NumberSkeleton(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: `0`): Skeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
  
  @scala.inline
  def DateTimeSkeleton(parsedOptions: DateTimeFormatOptions, pattern: String, `type`: `1`): Skeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
}
