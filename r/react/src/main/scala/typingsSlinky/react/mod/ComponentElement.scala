package typingsSlinky.react.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElement[P, T /* <: ReactComponentClass[P] */] extends ReactElement {
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}

object ComponentElement {
  @scala.inline
  def apply[P, T](
    props: js.Any,
    `type`: js.Any,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[T]] = js.undefined
  ): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
}

