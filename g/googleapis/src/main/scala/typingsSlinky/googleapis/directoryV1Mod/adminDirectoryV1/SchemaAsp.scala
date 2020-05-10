package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The template that returns individual ASP (Access Code) data.
  */
@js.native
trait SchemaAsp extends js.Object {
  /**
    * The unique ID of the ASP.
    */
  var codeId: js.UndefOr[Double] = js.native
  /**
    * The time when the ASP was created. Expressed in Unix time format.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * ETag of the ASP.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of the API resource. This is always admin#directory#asp.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time when the ASP was last used. Expressed in Unix time format.
    */
  var lastTimeUsed: js.UndefOr[String] = js.native
  /**
    * The name of the application that the user, represented by their userId,
    * entered when the ASP was created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique ID of the user who issued the ASP.
    */
  var userKey: js.UndefOr[String] = js.native
}

object SchemaAsp {
  @scala.inline
  def apply(): SchemaAsp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsp]
  }
  @scala.inline
  implicit class SchemaAspOps[Self <: SchemaAsp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withLastTimeUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTimeUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastTimeUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTimeUsed")(js.undefined)
        ret
    }
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
    def withUserKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userKey")(js.undefined)
        ret
    }
  }
  
}

