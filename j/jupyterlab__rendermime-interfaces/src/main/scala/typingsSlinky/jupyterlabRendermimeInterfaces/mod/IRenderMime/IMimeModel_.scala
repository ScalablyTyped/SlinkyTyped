package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model for mime data.
  */
@js.native
trait IMimeModel_ extends js.Object {
  /**
    * The data associated with the model.
    */
  val data: ReadonlyJSONObject = js.native
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  val metadata: ReadonlyJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  val trusted: Boolean = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  def setData(options: ISetDataOptions): Unit = js.native
}

object IMimeModel_ {
  @scala.inline
  def apply(
    data: ReadonlyJSONObject,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    trusted: Boolean
  ): IMimeModel_ = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMimeModel_]
  }
  @scala.inline
  implicit class IMimeModel_Ops[Self <: IMimeModel_] (val x: Self) extends AnyVal {
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
    def withMetadata(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetData(value: ISetDataOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

