package typingsSlinky.cathoQuantum.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ThemeSpacingObject
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ComponentType467443597 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def Instantiable1(
    Instantiable1: org.scalablytyped.runtime.Instantiable1[ThemeSpacingObject, ReactComponentClass[ThemeSpacingObject]] = null
  ): this.type = {
    if (Instantiable1 != null) js.Dynamic.global.Object.assign(args(1), Instantiable1)
    this
  }
  @scala.inline
  def Instantiable2(
    Instantiable2: org.scalablytyped.runtime.Instantiable2[ThemeSpacingObject, /* context */ js.Any, ReactComponentClass[ThemeSpacingObject]] = null
  ): this.type = {
    if (Instantiable2 != null) js.Dynamic.global.Object.assign(args(1), Instantiable2)
    this
  }
  @scala.inline
  def childContextTypes(value: ValidationMap[_]): this.type = set("childContextTypes", value.asInstanceOf[js.Any])
  @scala.inline
  def contextType(value: Context[_]): this.type = set("contextType", value.asInstanceOf[js.Any])
  @scala.inline
  def contextTypes(value: ValidationMap[_]): this.type = set("contextTypes", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultProps(value: Partial[ThemeSpacingObject]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
  @scala.inline
  def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
  @scala.inline
  def getDerivedStateFromError(value: /* error */ js.Any => Partial[js.Object] | Null): this.type = set("getDerivedStateFromError", js.Any.fromFunction1(value))
  @scala.inline
  def getDerivedStateFromProps(value: (ThemeSpacingObject, js.Object) => Partial[js.Object] | Null): this.type = set("getDerivedStateFromProps", js.Any.fromFunction2(value))
  @scala.inline
  def propTypes(value: WeakValidationMap[ThemeSpacingObject]): this.type = set("propTypes", value.asInstanceOf[js.Any])
}

