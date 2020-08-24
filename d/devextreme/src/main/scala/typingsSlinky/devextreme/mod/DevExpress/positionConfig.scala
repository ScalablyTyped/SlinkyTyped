package typingsSlinky.devextreme.mod.DevExpress

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.devextreme.anon.X
import typingsSlinky.devextreme.anon.XY
import typingsSlinky.devextreme.anon.Y
import typingsSlinky.devextreme.devextremeStrings.`fit flip`
import typingsSlinky.devextreme.devextremeStrings.`fit flipfit`
import typingsSlinky.devextreme.devextremeStrings.`fit none`
import typingsSlinky.devextreme.devextremeStrings.`flip fit`
import typingsSlinky.devextreme.devextremeStrings.`flip none`
import typingsSlinky.devextreme.devextremeStrings.`flipfit fit`
import typingsSlinky.devextreme.devextremeStrings.`flipfit none`
import typingsSlinky.devextreme.devextremeStrings.`left bottom`
import typingsSlinky.devextreme.devextremeStrings.`left top`
import typingsSlinky.devextreme.devextremeStrings.`none fit`
import typingsSlinky.devextreme.devextremeStrings.`none flip`
import typingsSlinky.devextreme.devextremeStrings.`none flipfit`
import typingsSlinky.devextreme.devextremeStrings.`right bottom`
import typingsSlinky.devextreme.devextremeStrings.`right top`
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.fit
import typingsSlinky.devextreme.devextremeStrings.flip
import typingsSlinky.devextreme.devextremeStrings.flipfit
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait positionConfig extends js.Object {
  /** @name positionConfig.at */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.native
  /** @name positionConfig.boundary */
  var boundary: js.UndefOr[String | Element | JQuery | Window] = js.native
  /** @name positionConfig.boundaryOffset */
  var boundaryOffset: js.UndefOr[String | Y] = js.native
  /** @name positionConfig.collision */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
  ] = js.native
  /** @name positionConfig.my */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.native
  /** @name positionConfig.of */
  var of: js.UndefOr[String | Element | JQuery | Window] = js.native
  /** @name positionConfig.offset */
  var offset: js.UndefOr[String | Y] = js.native
}

object positionConfig {
  @scala.inline
  def apply(): positionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[positionConfig]
  }
  @scala.inline
  implicit class positionConfigOps[Self <: positionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAt(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    @scala.inline
    def setBoundaryElement(value: Element): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundaryWindow(value: Window): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundary(value: String | Element | JQuery | Window): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setBoundaryOffset(value: String | Y): Self = this.set("boundaryOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryOffset: Self = this.set("boundaryOffset", js.undefined)
    @scala.inline
    def setCollision(
      value: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
    ): Self = this.set("collision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    @scala.inline
    def setMy(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setOfElement(value: Element): Self = this.set("of", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfWindow(value: Window): Self = this.set("of", value.asInstanceOf[js.Any])
    @scala.inline
    def setOf(value: String | Element | JQuery | Window): Self = this.set("of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    @scala.inline
    def setOffset(value: String | Y): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

