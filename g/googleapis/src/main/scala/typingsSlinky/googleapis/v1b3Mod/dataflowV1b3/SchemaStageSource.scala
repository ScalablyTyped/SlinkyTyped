package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of an input or output of an execution stage.
  */
@js.native
trait SchemaStageSource extends js.Object {
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String] = js.native
  /**
    * Size of the source, if measurable.
    */
  var sizeBytes: js.UndefOr[String] = js.native
  /**
    * Human-readable name for this source; may be user or system generated.
    */
  var userName: js.UndefOr[String] = js.native
}

object SchemaStageSource {
  @scala.inline
  def apply(): SchemaStageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStageSource]
  }
  @scala.inline
  implicit class SchemaStageSourceOps[Self <: SchemaStageSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalTransformOrCollection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTransformOrCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalTransformOrCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTransformOrCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

