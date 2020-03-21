package typingsSlinky.jupyterlabStatusbar.groupMod.GroupItem

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for the GroupItem.
  */
trait IProps extends js.Object {
  /**
    * The items to arrange in a group.
    */
  var children: js.Array[ReactElement]
  /**
    * The spacing, in px, between the items in the goup.
    */
  var spacing: Double
}

object IProps {
  @scala.inline
  def apply(children: js.Array[ReactElement], spacing: Double): IProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IProps]
  }
}

