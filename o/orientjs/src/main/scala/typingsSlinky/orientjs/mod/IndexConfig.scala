package typingsSlinky.orientjs.mod

import typingsSlinky.orientjs.orientjsStrings.COLA
import typingsSlinky.orientjs.orientjsStrings.DICTIONARY
import typingsSlinky.orientjs.orientjsStrings.DICTIONARY_HASH_INDEX
import typingsSlinky.orientjs.orientjsStrings.FULLTEXT
import typingsSlinky.orientjs.orientjsStrings.FULLTEXT_HASH_INDEX
import typingsSlinky.orientjs.orientjsStrings.LUCENE
import typingsSlinky.orientjs.orientjsStrings.NOTUNIQUE
import typingsSlinky.orientjs.orientjsStrings.NOTUNIQUE_HASH_INDEX
import typingsSlinky.orientjs.orientjsStrings.SPATIAL
import typingsSlinky.orientjs.orientjsStrings.UNIQUE
import typingsSlinky.orientjs.orientjsStrings.UNIQUE_HASH_INDEX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexConfig extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var engine: js.UndefOr[LUCENE | COLA | String] = js.native
  var ifnotexist: js.UndefOr[Boolean] = js.native
  var keyType: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var name: String = js.native
  var properties: js.UndefOr[js.Array[String]] = js.native
  var `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL = js.native
}

object IndexConfig {
  @scala.inline
  def apply(
    name: String,
    `type`: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
  ): IndexConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfig]
  }
  @scala.inline
  implicit class IndexConfigOps[Self <: IndexConfig] (val x: Self) extends AnyVal {
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
    def withType(
      value: UNIQUE | NOTUNIQUE | FULLTEXT | DICTIONARY | UNIQUE_HASH_INDEX | NOTUNIQUE_HASH_INDEX | FULLTEXT_HASH_INDEX | DICTIONARY_HASH_INDEX | SPATIAL
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: LUCENE | COLA | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withIfnotexist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifnotexist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfnotexist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifnotexist")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
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
    @scala.inline
    def withProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

