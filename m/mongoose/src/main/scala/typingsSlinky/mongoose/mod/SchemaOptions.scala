package typingsSlinky.mongoose.mod

import typingsSlinky.mongoose.AnonAutoIndexId
import typingsSlinky.mongoose.AnonJ
import typingsSlinky.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOptions extends js.Object {
  /** defaults to true */
  var _id: js.UndefOr[Boolean] = js.native
  /** defaults to false (which means use the connection's autoIndex option) */
  var autoIndex: js.UndefOr[Boolean] = js.native
  /** defaults to true */
  var bufferCommands: js.UndefOr[Boolean] = js.native
  /** defaults to false */
  var capped: js.UndefOr[Boolean | Double | AnonAutoIndexId] = js.native
  /** Sets a default collation for every query and aggregation. */
  var collation: js.UndefOr[CollationOptions] = js.native
  /** no default */
  var collection: js.UndefOr[String] = js.native
  /** defaults to "__t" */
  var discriminatorKey: js.UndefOr[String] = js.native
  /** defaults to false. */
  var emitIndexErrors: js.UndefOr[Boolean] = js.native
  var excludeIndexes: js.UndefOr[js.Any] = js.native
  /** defaults to true */
  var id: js.UndefOr[Boolean] = js.native
  /** controls document#toObject behavior when called manually - defaults to true */
  var minimize: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[String] = js.native
  /** defaults to true. */
  var safe: js.UndefOr[Boolean | AnonJ] = js.native
  /**
    * By default, Mongoose will automatically
    * select() any populated paths.
    * To opt out, set selectPopulatedPaths to false.
    */
  var selectPopulatedPaths: js.UndefOr[Boolean] = js.native
  /** defaults to null */
  var shardKey: js.UndefOr[js.Object] = js.native
  /**
    * skipVersioning allows excluding paths from
    * versioning (the internal revision will not be
    * incremented even if these paths are updated).
    */
  var skipVersioning: js.UndefOr[js.Any] = js.native
  /**
    * Validation errors in a single nested schema are reported
    * both on the child and on the parent schema.
    * Set storeSubdocValidationError to false on the child schema
    * to make Mongoose only report the parent error.
    */
  var storeSubdocValidationError: js.UndefOr[Boolean] = js.native
  /** defaults to true */
  var strict: js.UndefOr[Boolean | `throw`] = js.native
  /**
    * If set timestamps, mongoose assigns createdAt
    * and updatedAt fields to your schema, the type
    * assigned is Date.
    */
  var timestamps: js.UndefOr[Boolean | SchemaTimestampsConfig] = js.native
  /** no default */
  var toJSON: js.UndefOr[DocumentToObjectOptions] = js.native
  /** no default */
  var toObject: js.UndefOr[DocumentToObjectOptions] = js.native
  /** defaults to 'type' */
  var typeKey: js.UndefOr[String] = js.native
  /**
    * Determines whether a type set to a POJO becomes
    * a Mixed path or a Subdocument (defaults to true).
    */
  var typePojoToMixed: js.UndefOr[Boolean] = js.native
  /** defaults to false */
  var useNestedStrict: js.UndefOr[Boolean] = js.native
  /** defaults to false */
  var usePushEach: js.UndefOr[Boolean] = js.native
  /** defaults to true */
  var validateBeforeSave: js.UndefOr[Boolean] = js.native
  /** defaults to "__v" */
  var versionKey: js.UndefOr[String | Boolean] = js.native
  var writeConcern: js.UndefOr[WriteConcern] = js.native
}

object SchemaOptions {
  @scala.inline
  def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  @scala.inline
  implicit class SchemaOptionsOps[Self <: SchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferCommands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withCapped(value: Boolean | Double | AnonAutoIndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped")(js.undefined)
        ret
    }
    @scala.inline
    def withCollation(value: CollationOptions): Self = {
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
    def withCollection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscriminatorKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminatorKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscriminatorKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminatorKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitIndexErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitIndexErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitIndexErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitIndexErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeIndexes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: Boolean | AnonJ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectPopulatedPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPopulatedPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectPopulatedPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPopulatedPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withShardKey(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipVersioning(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipVersioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipVersioning")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreSubdocValidationError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeSubdocValidationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreSubdocValidationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeSubdocValidationError")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean | `throw`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Boolean | SchemaTimestampsConfig): Self = {
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
    def withToJSON(value: DocumentToObjectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withToObject(value: DocumentToObjectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObject")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTypePojoToMixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typePojoToMixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypePojoToMixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typePojoToMixed")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNestedStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNestedStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNestedStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNestedStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePushEach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePushEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePushEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePushEach")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateBeforeSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBeforeSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateBeforeSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBeforeSave")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionKey(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteConcern(value: WriteConcern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeConcern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteConcern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeConcern")(js.undefined)
        ret
    }
  }
  
}

