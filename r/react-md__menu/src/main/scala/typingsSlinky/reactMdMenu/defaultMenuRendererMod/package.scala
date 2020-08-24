package typingsSlinky.reactMdMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object defaultMenuRendererMod {
  type InjectedMenuProps = typingsSlinky.reactMdUtils.typesTypesMod.LabelRequiredForA11y[typingsSlinky.reactMdMenu.defaultMenuRendererMod.AllInjectedMenuProps]
  type MenuRenderer = js.Function2[
    /* props */ typingsSlinky.reactMdMenu.defaultMenuRendererMod.InjectedMenuProps, 
    /* items */ js.Array[typingsSlinky.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem], 
    slinky.core.facade.ReactElement
  ]
}
