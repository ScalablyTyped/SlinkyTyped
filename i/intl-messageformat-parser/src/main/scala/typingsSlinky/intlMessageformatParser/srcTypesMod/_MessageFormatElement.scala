package typingsSlinky.intlMessageformatParser.srcTypesMod

import typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.plural
import typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.pound
import typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.select
import typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.tag
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MessageFormatElement extends StObject
object _MessageFormatElement {
  
  @scala.inline
  def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): typingsSlinky.intlMessageformatParser.srcTypesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.PluralElement]
  }
  
  @scala.inline
  def PoundElement(`type`: pound): typingsSlinky.intlMessageformatParser.srcTypesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.PoundElement]
  }
  
  @scala.inline
  def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typingsSlinky.intlMessageformatParser.srcTypesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.SelectElement]
  }
  
  @scala.inline
  def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typingsSlinky.intlMessageformatParser.srcTypesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.TagElement]
  }
}
