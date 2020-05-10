package typingsSlinky.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AltConfig extends js.Object {
  var batchingFunction: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.native
  var deserialize: js.UndefOr[
    js.Function1[/* deserializeFn */ js.Function1[/* serialData */ String, js.Object], Unit]
  ] = js.native
  var dispatcher: js.UndefOr[js.Any] = js.native
  var serialize: js.UndefOr[js.Function1[/* serializeFn */ js.Function1[/* data */ js.Object, String], Unit]] = js.native
  var storeTransforms: js.UndefOr[js.Array[StateTransform]] = js.native
}

object AltConfig {
  @scala.inline
  def apply(): AltConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltConfig]
  }
  @scala.inline
  implicit class AltConfigOps[Self <: AltConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchingFunction(value: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBatchingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserialize(value: /* deserializeFn */ js.Function1[/* serialData */ String, js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeserialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatcher(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* serializeFn */ js.Function1[/* data */ js.Object, String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreTransforms(value: js.Array[StateTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeTransforms")(js.undefined)
        ret
    }
  }
  
}

