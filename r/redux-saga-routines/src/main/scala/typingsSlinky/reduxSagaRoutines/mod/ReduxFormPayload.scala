package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxFormPayload[TFormData, TProps] extends js.Object {
  var props: TProps = js.native
  var values: TFormData = js.native
}

object ReduxFormPayload {
  @scala.inline
  def apply[TFormData, TProps](props: TProps, values: TFormData): ReduxFormPayload[TFormData, TProps] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxFormPayload[TFormData, TProps]]
  }
  @scala.inline
  implicit class ReduxFormPayloadOps[Self[tformdata, tprops] <: ReduxFormPayload[tformdata, tprops], TFormData, TProps] (val x: Self[TFormData, TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TFormData, TProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TFormData, TProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TFormData, TProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TFormData, TProps]) with Other]
    @scala.inline
    def withProps(value: TProps): Self[TFormData, TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: TFormData): Self[TFormData, TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

