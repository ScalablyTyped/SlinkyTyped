package typingsSlinky.reactLatexNext.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLatexNext.typesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_LatexProps_1360194442[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def delimiters(value: js.Array[Delimiter]): this.type = set("delimiters", value.asInstanceOf[js.Any])
  
  @scala.inline
  def delimitersVarargs(value: Delimiter*): this.type = set("delimiters", js.Array(value :_*))
  
  @scala.inline
  def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
}
