package typingsSlinky.reactBootstrap.rowMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends AllHTMLAttributes[Row]
     with ClassAttributes[Row] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Row] = null,
    ClassAttributes: ClassAttributes[Row] = null,
    componentClass: ReactComponentClass[_] = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

