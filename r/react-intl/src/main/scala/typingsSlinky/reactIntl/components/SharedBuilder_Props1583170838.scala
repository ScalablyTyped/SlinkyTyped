package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import typingsSlinky.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_Props1583170838[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def children(value: /* value */ String => ReactChild): this.type = set("children", js.Any.fromFunction1(value))
  
  @scala.inline
  def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
  
  @scala.inline
  def unit(value: RelativeTimeUnit): this.type = set("unit", value.asInstanceOf[js.Any])
  
  @scala.inline
  def updateIntervalInSeconds(value: Double): this.type = set("updateIntervalInSeconds", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
}
