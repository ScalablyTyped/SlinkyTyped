package typingsSlinky.parquetjs

import typingsSlinky.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodec extends js.Object {
  var codec: Double | Null = js.native
  var data_page_offset: ^  | Null = js.native
  var dictionary_page_offset: ^  | Null = js.native
  var encoding_stats: js.Any = js.native
  var encodings: js.Array[Double] | Null = js.native
  var index_page_offset: ^  | Null = js.native
  var key_value_metadata: js.Array[AnonKey] | Null = js.native
  var num_values: ^  | Null = js.native
  var path_in_schema: (js.Array[js.Array[String] | String]) | Null = js.native
  var statistics: js.Any = js.native
  var total_compressed_size: ^  | Null = js.native
  var total_uncompressed_size: ^  | Null = js.native
  var `type`: Double | Null = js.native
}

object AnonCodec {
  @scala.inline
  def apply(encoding_stats: js.Any, statistics: js.Any): AnonCodec = {
    val __obj = js.Dynamic.literal(encoding_stats = encoding_stats.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodec]
  }
  @scala.inline
  implicit class AnonCodecOps[Self <: AnonCodec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding_stats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodecNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(null)
        ret
    }
    @scala.inline
    def withData_page_offset(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_page_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData_page_offsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_page_offset")(null)
        ret
    }
    @scala.inline
    def withDictionary_page_offset(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_page_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionary_page_offsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_page_offset")(null)
        ret
    }
    @scala.inline
    def withEncodings(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodingsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodings")(null)
        ret
    }
    @scala.inline
    def withIndex_page_offset(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_page_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex_page_offsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_page_offset")(null)
        ret
    }
    @scala.inline
    def withKey_value_metadata(value: js.Array[AnonKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_value_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_value_metadataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_value_metadata")(null)
        ret
    }
    @scala.inline
    def withNum_values(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_valuesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_values")(null)
        ret
    }
    @scala.inline
    def withPath_in_schema(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path_in_schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath_in_schemaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path_in_schema")(null)
        ret
    }
    @scala.inline
    def withTotal_compressed_size(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_compressed_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_compressed_sizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_compressed_size")(null)
        ret
    }
    @scala.inline
    def withTotal_uncompressed_size(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_uncompressed_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_uncompressed_sizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_uncompressed_size")(null)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

