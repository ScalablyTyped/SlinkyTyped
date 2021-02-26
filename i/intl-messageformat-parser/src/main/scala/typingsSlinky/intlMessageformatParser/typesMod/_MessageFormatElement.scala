package typingsSlinky.intlMessageformatParser.typesMod

import typingsSlinky.intlMessageformatParser.typesMod.TYPE.plural
import typingsSlinky.intlMessageformatParser.typesMod.TYPE.pound
import typingsSlinky.intlMessageformatParser.typesMod.TYPE.select
import typingsSlinky.intlMessageformatParser.typesMod.TYPE.tag
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
  ): typingsSlinky.intlMessageformatParser.typesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.PluralElement]
  }
  
  @scala.inline
  def PoundElement(`type`: pound): typingsSlinky.intlMessageformatParser.typesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.PoundElement]
  }
  
  @scala.inline
  def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typingsSlinky.intlMessageformatParser.typesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.SelectElement]
  }
  
  @scala.inline
  def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typingsSlinky.intlMessageformatParser.typesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.TagElement]
  }
}
