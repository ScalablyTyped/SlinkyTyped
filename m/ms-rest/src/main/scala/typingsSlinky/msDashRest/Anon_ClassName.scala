package typingsSlinky.msDashRest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.msDashRest.msDashRestMod.Mapper
import typingsSlinky.msDashRest.msDashRestMod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.undefined
  var name: MapperType
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, name: MapperType, modelProperties: StringDictionary[Mapper] = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (modelProperties != null) __obj.updateDynamic("modelProperties")(modelProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

