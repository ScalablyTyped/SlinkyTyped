package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was created.
  */
@js.native
trait SchemaCreate extends js.Object {
  /**
    * If present, indicates the object was created by copying an existing Drive
    * object.
    */
  var copy: js.UndefOr[SchemaCopy] = js.native
  /**
    * If present, indicates the object was newly created (e.g. as a blank
    * document), not derived from a Drive object or external object.
    */
  var `new`: js.UndefOr[SchemaNew] = js.native
  /**
    * If present, indicates the object originated externally and was uploaded
    * to Drive.
    */
  var upload: js.UndefOr[SchemaUpload] = js.native
}

object SchemaCreate {
  @scala.inline
  def apply(): SchemaCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreate]
  }
  @scala.inline
  implicit class SchemaCreateOps[Self <: SchemaCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: SchemaCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withNew(value: SchemaNew): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: SchemaUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
  }
  
}

