package typingsSlinky.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFindOneAndUpdateOptions extends QueryFindOneAndRemoveOptions {
  /**
    * Only update elements that match the arrayFilters conditions in the document or documents that match the query conditions.
    */
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * if set to 'query' and runValidators is on, this will refer to the query in custom validator
    * functions that update validation runs. Does nothing if runValidators is false.
    */
  var context: js.UndefOr[String] = js.native
  /** Field selection. Equivalent to .select(fields).findOneAndUpdate() */
  var fields: js.UndefOr[js.Any | String] = js.native
  /**
    * if truthy, mongoose will return the document as a plain JavaScript object rather than a mongoose document. See Query.lean() and the Mongoose lean tutorial.
    */
  var lean: js.UndefOr[js.Any] = js.native
  /**
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[Boolean] = js.native
  /** if true, return the modified document rather than the original. defaults to false (changed in 4.0) */
  var `new`: js.UndefOr[Boolean] = js.native
  /** If true, delete any properties whose value is undefined when casting an update. In other words,
    if this is set, Mongoose will delete baz from the update in Model.updateOne({}, { foo: 'bar', baz: undefined })
    before sending the update to the server.**/
  var omitUndefined: js.UndefOr[Boolean] = js.native
  /** if true, runs update validators on this command. Update validators validate the update operation against the model's schema. */
  var runValidators: js.UndefOr[Boolean] = js.native
  /**
    * if this and upsert are true, mongoose will apply the defaults specified in the model's schema if a new document
    * is created. This option only works on MongoDB >= 2.4 because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.native
  /**
    * If set to false and schema-level timestamps are enabled, skip timestamps for this update. Note that this allows you to overwrite timestamps.
    * Does nothing if schema-level timestamps are not set.
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  /** creates the object if it doesn't exist. defaults to false. */
  var upsert: js.UndefOr[Boolean] = js.native
}

object QueryFindOneAndUpdateOptions {
  @scala.inline
  def apply(): QueryFindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFindOneAndUpdateOptions]
  }
  @scala.inline
  implicit class QueryFindOneAndUpdateOptionsOps[Self <: QueryFindOneAndUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFilters(value: js.Array[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Any | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withLean(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lean")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleCastError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleCastError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleCastError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleCastError")(js.undefined)
        ret
    }
    @scala.inline
    def withNew(value: Boolean): Self = {
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
    def withOmitUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withRunValidators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runValidators")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultsOnInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultsOnInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDefaultsOnInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultsOnInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

