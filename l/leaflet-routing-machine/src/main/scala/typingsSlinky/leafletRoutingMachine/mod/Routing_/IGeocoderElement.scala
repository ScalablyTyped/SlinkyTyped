package typingsSlinky.leafletRoutingMachine.mod.Routing_

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IGeocoderElement extends js.Object {
  var closeButton: HTMLElement = js.native
  var container: HTMLElement = js.native
  var input: HTMLElement = js.native
}

object IGeocoderElement {
  @scala.inline
  def apply(closeButton: HTMLElement, container: HTMLElement, input: HTMLElement): IGeocoderElement = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocoderElement]
  }
  @scala.inline
  implicit class IGeocoderElementOps[Self <: IGeocoderElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseButton(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

