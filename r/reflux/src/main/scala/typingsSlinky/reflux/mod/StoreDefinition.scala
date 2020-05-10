package typingsSlinky.reflux.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreDefinition
  extends /* propertyName */ StringDictionary[js.Any] {
  var getInitialState: js.UndefOr[js.Function] = js.native
  var init: js.UndefOr[js.Function] = js.native
  var listenables: js.UndefOr[js.Array[_]] = js.native
}

object StoreDefinition {
  @scala.inline
  def apply(): StoreDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreDefinition]
  }
  @scala.inline
  implicit class StoreDefinitionOps[Self <: StoreDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInitialState(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialState")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withListenables(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenables")(js.undefined)
        ret
    }
  }
  
}

