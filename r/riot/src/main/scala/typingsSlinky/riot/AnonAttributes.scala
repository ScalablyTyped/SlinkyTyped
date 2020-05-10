package typingsSlinky.riot

import typingsSlinky.riotjsDomBindings.mod.AttributeExpressionData
import typingsSlinky.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributes[InitialProps] extends js.Object {
  var attributes: js.UndefOr[js.Array[AttributeExpressionData]] = js.native
  var props: js.UndefOr[InitialProps] = js.native
  var slots: js.UndefOr[js.Array[SlotBindingData]] = js.native
}

object AnonAttributes {
  @scala.inline
  def apply[InitialProps](): AnonAttributes[InitialProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAttributes[InitialProps]]
  }
  @scala.inline
  implicit class AnonAttributesOps[Self[initialprops] <: AnonAttributes[initialprops], InitialProps] (val x: Self[InitialProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InitialProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InitialProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[InitialProps] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[InitialProps] with Other]
    @scala.inline
    def withAttributes(value: js.Array[AttributeExpressionData]): Self[InitialProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[InitialProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: InitialProps): Self[InitialProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[InitialProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: js.Array[SlotBindingData]): Self[InitialProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self[InitialProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.undefined)
        ret
    }
  }
  
}

