package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /**
    * While splitting, sources may specify the produced bundles
    * as differences against another source, in order to save backend-side
    * memory and allow bigger jobs. For details, see SourceSplitRequest.
    * To support this use case, the full set of parameters of the source
    * is logically obtained by taking the latest explicitly specified value
    * of each parameter in the order:
    * base_specs (later items win), spec (overrides anything in base_specs).
    */
  var baseSpecs: js.UndefOr[js.Array[Record[String, _]]] = js.native
  /** The codec to use to decode data read from the source. */
  var codec: js.UndefOr[Record[String, _]] = js.native
  /**
    * Setting this value to true hints to the framework that the source
    * doesn't need splitting, and using SourceSplitRequest on it would
    * yield SOURCE_SPLIT_OUTCOME_USE_CURRENT.
    *
    * E.g. a file splitter may set this to true when splitting a single file
    * into a set of byte ranges of appropriate size, and set this
    * to false when splitting a filepattern into individual files.
    * However, for efficiency, a file splitter may decide to produce
    * file subranges directly from the filepattern to avoid a splitting
    * round-trip.
    *
    * See SourceSplitRequest for an overview of the splitting process.
    *
    * This field is meaningful only in the Source objects populated
    * by the user (e.g. when filling in a DerivedSource).
    * Source objects supplied by the framework to the user don't have
    * this field populated.
    */
  var doesNotNeedSplitting: js.UndefOr[Boolean] = js.native
  /**
    * Optionally, metadata for this source can be supplied right away,
    * avoiding a SourceGetMetadataOperation roundtrip
    * (see SourceOperationRequest).
    *
    * This field is meaningful only in the Source objects populated
    * by the user (e.g. when filling in a DerivedSource).
    * Source objects supplied by the framework to the user don't have
    * this field populated.
    */
  var metadata: js.UndefOr[SourceMetadata] = js.native
  /** The source to read from, plus its parameters. */
  var spec: js.UndefOr[Record[String, _]] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseSpecs(value: js.Array[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseSpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseSpecs")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withDoesNotNeedSplitting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesNotNeedSplitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoesNotNeedSplitting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesNotNeedSplitting")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SourceMetadata): Self = {
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
    def withSpec(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
  }
  
}

