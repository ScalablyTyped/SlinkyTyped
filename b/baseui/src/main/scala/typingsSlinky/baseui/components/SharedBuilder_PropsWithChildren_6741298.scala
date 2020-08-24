package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.progressStepsMod.StyleProps
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_PropsWithChildren_6741298 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def $asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
  @scala.inline
  def $asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
  @scala.inline
  def $as(value: StyletronBase): this.type = set("$as", value.asInstanceOf[js.Any])
  @scala.inline
  def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def $isActive(value: Boolean): this.type = set("$isActive", value.asInstanceOf[js.Any])
  @scala.inline
  def $isCompleted(value: Boolean): this.type = set("$isCompleted", value.asInstanceOf[js.Any])
  @scala.inline
  def $styleFunction1(value: StyleProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  @scala.inline
  def $style(value: StyleProp[StyleProps]): this.type = set("$style", value.asInstanceOf[js.Any])
}

