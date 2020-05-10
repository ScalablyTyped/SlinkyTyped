package typingsSlinky.nedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataStoreOptions extends js.Object {
  // (optional): hook you can use to transform data after it was serialized and before it is written to disk.
  // Can be used for example to encrypt data before writing database to disk.
  // This function takes a string as parameter (one line of an NeDB data file) and outputs the transformed string, which must absolutely not contain a \n character (or data will be lost)
  var afterSerialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.native
   // Optional, specify the name of your NW app if you want options.filename to be relative to the directory where
  var autoload: js.UndefOr[Boolean] = js.native
  // (optional): reverse of afterSerialization.
  // Make sure to include both and not just one or you risk data loss.
  // For the same reason, make sure both functions are inverses of one another.
  // Some failsafe mechanisms are in place to prevent data loss if you misuse the serialization hooks:
  // NeDB checks that never one is declared without the other, and checks that they are reverse of one another by testing on random strings of various lengths.
  // In addition, if too much data is detected as corrupt,
  // NeDB will refuse to start as it could mean you're not using the deserialization hook corresponding to the serialization hook used before (see below)
  var beforeDeserialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.native
  // (optional): between 0 and 1, defaults to 10%. NeDB will refuse to start if more than this percentage of the datafile is corrupt.
  // 0 means you don't tolerate any corruption, 1 means you don't care
  var corruptAlertThreshold: js.UndefOr[Double] = js.native
  var filename: js.UndefOr[String] = js.native
   // Optional, datastore will be in-memory only if not provided
  var inMemoryOnly: js.UndefOr[Boolean] = js.native
   // Optional, default to false
  var nodeWebkitAppName: js.UndefOr[Boolean] = js.native
   // Optional, defaults to false
  // Optional, if autoload is used this will be called after the load database with the error object as parameter. If you don't pass it the error will be thrown
  var onload: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.native
  // (optional, defaults to false)
  // timestamp the insertion and last update of all documents, with the fields createdAt and updatedAt. User-specified values override automatic generation, usually useful for testing.
  var timestampData: js.UndefOr[Boolean] = js.native
}

object DataStoreOptions {
  @scala.inline
  def apply(): DataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataStoreOptions]
  }
  @scala.inline
  implicit class DataStoreOptionsOps[Self <: DataStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSerialization(value: /* line */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSerialization")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSerialization")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDeserialization(value: /* line */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDeserialization")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDeserialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDeserialization")(js.undefined)
        ret
    }
    @scala.inline
    def withCorruptAlertThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corruptAlertThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorruptAlertThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corruptAlertThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withInMemoryOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMemoryOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInMemoryOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMemoryOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeWebkitAppName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWebkitAppName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeWebkitAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWebkitAppName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: /* error */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampData")(js.undefined)
        ret
    }
  }
  
}

