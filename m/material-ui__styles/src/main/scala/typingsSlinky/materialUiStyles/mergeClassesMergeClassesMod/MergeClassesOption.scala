package typingsSlinky.materialUiStyles.mergeClassesMergeClassesMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeClassesOption extends js.Object {
  var Component: ReactElement
  var baseClasses: Classes
  var newClasses: Classes
}

object MergeClassesOption {
  @scala.inline
  def apply(Component: ReactElement, baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeClassesOption]
  }
}

