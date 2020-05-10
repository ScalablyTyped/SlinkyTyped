package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a streaming side input.
  */
@js.native
trait SchemaStreamingSideInputLocation extends js.Object {
  /**
    * Identifies the state family where this side input is stored.
    */
  var stateFamily: js.UndefOr[String] = js.native
  /**
    * Identifies the particular side input within the streaming Dataflow job.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaStreamingSideInputLocation {
  @scala.inline
  def apply(): SchemaStreamingSideInputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSideInputLocation]
  }
  @scala.inline
  implicit class SchemaStreamingSideInputLocationOps[Self <: SchemaStreamingSideInputLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

