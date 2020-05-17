package typingsSlinky.reactMosaicComponent.anon

import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-mosaic-component.react-mosaic-component/lib/Mosaic.MosaicState<react-mosaic-component.react-mosaic-component/lib/types.MosaicKey>> */
@js.native
trait PartialMosaicStateMosaicK extends js.Object {
  var currentNode: js.UndefOr[MosaicNode[MosaicKey]] = js.native
  var lastInitialValue: js.UndefOr[MosaicNode[MosaicKey]] = js.native
  var mosaicId: js.UndefOr[String] = js.native
}

object PartialMosaicStateMosaicK {
  @scala.inline
  def apply(): PartialMosaicStateMosaicK = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMosaicStateMosaicK]
  }
  @scala.inline
  implicit class PartialMosaicStateMosaicKOps[Self <: PartialMosaicStateMosaicK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentNode(value: MosaicNode[MosaicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastInitialValue(value: MosaicNode[MosaicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInitialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInitialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMosaicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mosaicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMosaicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mosaicId")(js.undefined)
        ret
    }
  }
  
}

