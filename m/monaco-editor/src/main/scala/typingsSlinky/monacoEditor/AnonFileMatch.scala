package typingsSlinky.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileMatch extends js.Object {
  /**
    * A list of file names that are associated to the schema. The '*' wildcard can be used. For example '*.schema.json', 'package.json'
    */
  val fileMatch: js.UndefOr[js.Array[String]] = js.native
  /**
    * The schema for the given URI.
    */
  val schema: js.UndefOr[js.Any] = js.native
  /**
    * The URI of the schema, which is also the identifier of the schema.
    */
  val uri: String = js.native
}

object AnonFileMatch {
  @scala.inline
  def apply(uri: String): AnonFileMatch = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileMatch]
  }
  @scala.inline
  implicit class AnonFileMatchOps[Self <: AnonFileMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileMatch(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

