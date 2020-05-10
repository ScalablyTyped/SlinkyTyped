package typingsSlinky.bson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializeOptions extends js.Object {
  /** {default:false}, allows the buffer to be larger than the parsed BSON object. */
  var allowObjectSmallerThanBufferSize: js.UndefOr[Boolean] = js.native
  /** {default:false}, return BSON regular expressions as BSONRegExp instances. */
  var bsonRegExp: js.UndefOr[Boolean] = js.native
  /** {default:false}, cache evaluated functions for reuse. */
  var cacheFunctions: js.UndefOr[Boolean] = js.native
  /** {default:false}, use a crc32 code for caching, otherwise use the string of the function. */
  var cacheFunctionsCrc32: js.UndefOr[Boolean] = js.native
  /** {default:false}, evaluate functions in the BSON document scoped to the object deserialized. */
  var evalFunctions: js.UndefOr[Boolean] = js.native
  /** {default:null}, allow to specify if there what fields we wish to return as unserialized raw buffer. */
  var fieldsAsRaw: js.UndefOr[StringDictionary[Boolean]] = js.native
  /** {default:false}, deserialize Binary data directly into node.js Buffer object. */
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  /** {default:true}, when deserializing a Long will fit it into a Number if it's smaller than 53 bits. */
  var promoteLongs: js.UndefOr[Boolean] = js.native
  /** {default:false}, when deserializing will promote BSON values to their Node.js closest equivalent types. */
  var promoteValues: js.UndefOr[Boolean] = js.native
}

object DeserializeOptions {
  @scala.inline
  def apply(): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  implicit class DeserializeOptionsOps[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowObjectSmallerThanBufferSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowObjectSmallerThanBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowObjectSmallerThanBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowObjectSmallerThanBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBsonRegExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsonRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsonRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsonRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheFunctionsCrc32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFunctionsCrc32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFunctionsCrc32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFunctionsCrc32")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsAsRaw(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsAsRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldsAsRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsAsRaw")(js.undefined)
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
  }
  
}

