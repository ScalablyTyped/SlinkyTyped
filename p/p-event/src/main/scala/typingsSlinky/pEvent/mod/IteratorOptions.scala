package typingsSlinky.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  /**
  		Maximum number of events for the iterator before it ends. When the limit is reached, the iterator will be marked as `done`. This option is useful to paginate events, for example, fetching 10 events per page.
  		@default Infinity
  		*/
  var limit: js.UndefOr[Double] = js.native
  /**
  		Events that will end the iterator.
  		@default []
  		*/
  var resolutionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.native
}

object IteratorOptions {
  @scala.inline
  def apply[EmittedType](): IteratorOptions[EmittedType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IteratorOptions[EmittedType]]
  }
  @scala.inline
  implicit class IteratorOptionsOps[Self[emittedtype] <: IteratorOptions[emittedtype], EmittedType] (val x: Self[EmittedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EmittedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EmittedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EmittedType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EmittedType] with Other]
    @scala.inline
    def withLimit(value: Double): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionEvents(value: js.Array[String | js.Symbol]): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionEvents: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionEvents")(js.undefined)
        ret
    }
  }
  
}

