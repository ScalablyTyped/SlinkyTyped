package typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a general area config.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout.ITabAreaConfig
  - typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout.ISplitAreaConfig
*/
trait AreaConfig extends js.Object

object AreaConfig {
  @scala.inline
  implicit def apply(value: ISplitAreaConfig): AreaConfig = value.asInstanceOf[AreaConfig]
  @scala.inline
  implicit def apply(value: ITabAreaConfig): AreaConfig = value.asInstanceOf[AreaConfig]
}

