package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDiagramConnector extends dxDiagramItem {
  /** Specifies the connector's start node key. */
  var fromKey: js.UndefOr[js.Any] = js.native
  /** Specifies the connector's text. */
  var texts: js.UndefOr[js.Array[String]] = js.native
  /** Specifies the connector's end node key. */
  var toKey: js.UndefOr[js.Any] = js.native
}

object dxDiagramConnector {
  @scala.inline
  def apply(): dxDiagramConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramConnector]
  }
  @scala.inline
  implicit class dxDiagramConnectorOps[Self <: dxDiagramConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
    @scala.inline
    def withToKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toKey")(js.undefined)
        ret
    }
  }
  
}

