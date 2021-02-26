package typingsSlinky.reduxLittleRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxLittleRouter.mod.Location
import typingsSlinky.reduxLittleRouter.mod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FragmentProps514414898[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def forNoMatch(value: Boolean): this.type = set("forNoMatch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def forRoute(value: String): this.type = set("forRoute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def location(value: Location): this.type = set("location", value.asInstanceOf[js.Any])
  
  @scala.inline
  def matchRoute(value: js.Function): this.type = set("matchRoute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def matchWildcardRoute(value: js.Function): this.type = set("matchWildcardRoute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def parentId(value: String): this.type = set("parentId", value.asInstanceOf[js.Any])
  
  @scala.inline
  def parentRoute(value: String): this.type = set("parentRoute", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: ObjectLiteral[_]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def withConditions(value: /* location */ Location => Boolean): this.type = set("withConditions", js.Any.fromFunction1(value))
}
