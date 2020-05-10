package typingsSlinky.mongodb.mod

import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbCreateOptions extends CommonOptions {
  /**
    * If the database authentication is dependent on another databaseName.
    */
  var authSource: js.UndefOr[String] = js.native
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a
    * working connection, default is -1 which is unlimited.
    */
  var bufferMaxEntries: js.UndefOr[scala.Double] = js.native
  /**
    * Default: false; Force server to create _id fields instead of client.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.native
  /**
    * Specify if the BSON serializer should ignore undefined fields.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  /**
    * Default: false; Use c++ bson parser.
    */
  var native_parser: js.UndefOr[Boolean] = js.native
  /**
    * Custom primary key factory to generate _id values (see Custom primary keys).
    */
  var pkFactory: js.UndefOr[js.Object] = js.native
  /**
    * ES6 compatible promise constructor
    */
  var promiseLibrary: js.UndefOr[PromiseConstructor] = js.native
  /**
    * Default: false; Promotes Binary BSON values to native Node Buffers
    */
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Promotes Long values to number if they fit inside the 53 bits resolution.
    */
  var promoteLongs: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Promotes BSON values to native types where possible, set to false to only receive wrapper types.
    */
  var promoteValues: js.UndefOr[Boolean] = js.native
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
    */
  var readConcern: js.UndefOr[ReadConcern | String] = js.native
  /**
    * the prefered read preference. use 'ReadPreference' class.
    */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
}

object DbCreateOptions {
  @scala.inline
  def apply(): DbCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCreateOptions]
  }
  @scala.inline
  implicit class DbCreateOptionsOps[Self <: DbCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSource")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferMaxEntries(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withForceServerObjectId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceServerObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceServerObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceServerObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withNative_parser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative_parser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPkFactory(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseLibrary(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteBuffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteBuffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteBuffers")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteLongs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteLongs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteLongs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteLongs")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteValues")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReadConcern(value: ReadConcern | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConcern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadConcern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readConcern")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(js.undefined)
        ret
    }
  }
  
}

