package typingsSlinky.reactMove.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_INodeGroupProps1345005892[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def enter(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): this.type = set("enter", js.Any.fromFunction2(value))
  
  @scala.inline
  def interpolation(
    value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
  ): this.type = set("interpolation", js.Any.fromFunction4(value))
  
  @scala.inline
  def leave(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): this.type = set("leave", js.Any.fromFunction2(value))
  
  @scala.inline
  def update(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): this.type = set("update", js.Any.fromFunction2(value))
}
