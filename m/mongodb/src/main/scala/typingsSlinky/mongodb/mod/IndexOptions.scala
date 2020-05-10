package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexOptions extends CommonOptions {
  /**
    * Creates the index in the background, yielding whenever possible.
    */
  var background: js.UndefOr[Boolean] = js.native
  var collation: js.UndefOr[CollationDocument] = js.native
  var default_language: js.UndefOr[String] = js.native
  /**
    * A unique index cannot be created on a key that has pre-existing duplicate values.
    *
    * If you would like to create the index anyway, keeping the first document the database indexes and
    * deleting all subsequent documents that have duplicate value
    */
  var dropDups: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to expire data on indexes applied to a data (MongoDB 2.2 or higher)
    */
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.native
  /**
    * For geo spatial indexes set the high bound for the co-ordinates.
    */
  var max: js.UndefOr[scala.Double] = js.native
  /**
    * For geo spatial indexes set the lower bound for the co-ordinates.
    */
  var min: js.UndefOr[scala.Double] = js.native
  /**
    * Override the auto generated index name (useful if the resulting name is larger than 128 bytes)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Creates a partial index based on the given filter object (MongoDB 3.2 or higher)
    */
  var partialFilterExpression: js.UndefOr[js.Any] = js.native
  /**
    * Creates a sparse index.
    */
  var sparse: js.UndefOr[Boolean] = js.native
  /**
    * Creates an unique index.
    */
  var unique: js.UndefOr[Boolean] = js.native
  /**
    * Specify the format version of the indexes.
    */
  var v: js.UndefOr[scala.Double] = js.native
}

object IndexOptions {
  @scala.inline
  def apply(): IndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOptions]
  }
  @scala.inline
  implicit class IndexOptionsOps[Self <: IndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCollation(value: CollationDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_language")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDups")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireAfterSeconds(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfterSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireAfterSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfterSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
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
    def withPartialFilterExpression(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialFilterExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialFilterExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withSparse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
    @scala.inline
    def withV(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(js.undefined)
        ret
    }
  }
  
}

