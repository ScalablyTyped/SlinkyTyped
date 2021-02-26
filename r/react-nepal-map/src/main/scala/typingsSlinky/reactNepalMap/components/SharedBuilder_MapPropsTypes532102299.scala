package typingsSlinky.reactNepalMap.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNepalMap.mod.itemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_MapPropsTypes532102299 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hoverColor(value: String): this.type = set("hoverColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMapClick(value: /* item */ itemProps => Unit): this.type = set("onMapClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def randomSectorColor(value: Boolean): this.type = set("randomSectorColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def sectorClassName(value: String): this.type = set("sectorClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
}
