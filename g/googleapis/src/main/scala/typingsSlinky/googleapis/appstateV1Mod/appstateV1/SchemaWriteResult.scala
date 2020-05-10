package typingsSlinky.googleapis.appstateV1Mod.appstateV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an app state write result.
  */
@js.native
trait SchemaWriteResult extends js.Object {
  /**
    * The version of the data for this key on the server.
    */
  var currentStateVersion: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#writeResult.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The written key.
    */
  var stateKey: js.UndefOr[Double] = js.native
}

object SchemaWriteResult {
  @scala.inline
  def apply(): SchemaWriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteResult]
  }
  @scala.inline
  implicit class SchemaWriteResultOps[Self <: SchemaWriteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentStateVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStateVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStateVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStateKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateKey")(js.undefined)
        ret
    }
  }
  
}

