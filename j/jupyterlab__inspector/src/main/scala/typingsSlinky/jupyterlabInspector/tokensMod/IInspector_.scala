package typingsSlinky.jupyterlabInspector.tokensMod

import typingsSlinky.jupyterlabInspector.tokensMod.IInspector.IInspectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInspector_ extends js.Object {
  /**
    * The source of events the inspector listens for.
    */
  var source: IInspectable | Null = js.native
}

object IInspector_ {
  @scala.inline
  def apply(): IInspector_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspector_]
  }
  @scala.inline
  implicit class IInspector_Ops[Self <: IInspector_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: IInspectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
  }
  
}

