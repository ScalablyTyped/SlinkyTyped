package typingsSlinky.reduxLittleRouter.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxLittleRouter.anon.Payload
import typingsSlinky.reduxLittleRouter.mod.Href
import typingsSlinky.reduxLittleRouter.mod.Location
import typingsSlinky.reduxLittleRouter.mod.LocationOptions
import typingsSlinky.reduxLittleRouter.mod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_LinkProps_963111816[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def activeProps(value: ObjectLiteral[_]): this.type = set("activeProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def location(value: Location): this.type = set("location", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: /* event */ Event => _): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def persistQuery(value: Boolean): this.type = set("persistQuery", value.asInstanceOf[js.Any])
  
  @scala.inline
  def push(value: (/* href */ Href, /* options */ LocationOptions) => Payload): this.type = set("push", js.Any.fromFunction2(value))
  
  @scala.inline
  def replace(value: (/* href */ Href, /* options */ LocationOptions) => Payload): this.type = set("replace", js.Any.fromFunction2(value))
  
  @scala.inline
  def replaceState(value: Boolean): this.type = set("replaceState", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: ObjectLiteral[_]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
}
