package typingsSlinky.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  /**
    * SecureFiles LOB cache setting.
    *
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * SecureFiles LOB compression setting.
    *
    * @default NONE
    */
  var compress: js.UndefOr[String] = js.native
  /**
    * SecureFiles LOB encryption setting.
    *
    * Before you create a collection that uses SecureFiles LOB encryption you must set up an encryption wallet.
    *
    * @default NONE
    */
  var encrypt: js.UndefOr[String] = js.native
  /**
    * Maximum length of the content column in bytes. This component applies only to content of type VARCHAR2.
    *
    * @default 4000
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Name of the column that stores the database content.
    *
    * @default JSON_DOCUMENT
    */
  var name: js.UndefOr[String] = js.native
  /**
    * SQL data type of the column that stores the document content.
    *
    * @default BLOB
    */
  var sqlType: js.UndefOr[String] = js.native
  /**
    * Syntax to which JavaScript Object Notation (JSON) content must conform—strict or lax.
    *
    * @default STANDARD
    */
  var validation: js.UndefOr[String] = js.native
}

object Cache {
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
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
    def withSqlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlType")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
  }
  
}

