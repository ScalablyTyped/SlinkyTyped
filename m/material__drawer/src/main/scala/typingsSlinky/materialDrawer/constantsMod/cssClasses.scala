package typingsSlinky.materialDrawer.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--animate`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--closing`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--dismissible`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--modal`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--open`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--opening`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ANIMATE: `mdc-drawer--animate`
  var CLOSING: `mdc-drawer--closing`
  var DISMISSIBLE: `mdc-drawer--dismissible`
  var MODAL: `mdc-drawer--modal`
  var OPEN: `mdc-drawer--open`
  var OPENING: `mdc-drawer--opening`
  var ROOT: `mdc-drawer`
}

object cssClasses {
  @scala.inline
  def apply(
    ANIMATE: `mdc-drawer--animate`,
    CLOSING: `mdc-drawer--closing`,
    DISMISSIBLE: `mdc-drawer--dismissible`,
    MODAL: `mdc-drawer--modal`,
    OPEN: `mdc-drawer--open`,
    OPENING: `mdc-drawer--opening`,
    ROOT: `mdc-drawer`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ANIMATE = ANIMATE.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], DISMISSIBLE = DISMISSIBLE.asInstanceOf[js.Any], MODAL = MODAL.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

