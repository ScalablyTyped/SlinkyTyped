package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to update a mime model.
  */
@js.native
trait ISetDataOptions extends js.Object {
  /**
    * The new data object.
    */
  var data: js.UndefOr[ReadonlyJSONObject] = js.native
  /**
    * The new metadata object.
    */
  var metadata: js.UndefOr[ReadonlyJSONObject] = js.native
}

object ISetDataOptions {
  @scala.inline
  def apply(): ISetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetDataOptions]
  }
  @scala.inline
  implicit class ISetDataOptionsOps[Self <: ISetDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

