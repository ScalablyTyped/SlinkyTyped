package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantSet extends js.Object {
  /** The dataset to which this variant set belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** A textual description of this variant set. */
  var description: js.UndefOr[String] = js.native
  /** The server-generated variant set ID, unique across all variant sets. */
  var id: js.UndefOr[String] = js.native
  /** The metadata associated with this variant set. */
  var metadata: js.UndefOr[js.Array[VariantSetMetadata]] = js.native
  /** User-specified, mutable name. */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of all references used by the variants in a variant set
    * with associated coordinate upper bounds for each one.
    */
  var referenceBounds: js.UndefOr[js.Array[ReferenceBound]] = js.native
  /**
    * The reference set to which the variant set is mapped. The reference set
    * describes the alignment provenance of the variant set, while the
    * `referenceBounds` describe the shape of the actual variant data. The
    * reference set's reference names are a superset of those found in the
    * `referenceBounds`.
    *
    * For example, given a variant set that is mapped to the GRCh38 reference set
    * and contains a single variant on reference 'X', `referenceBounds` would
    * contain only an entry for 'X', while the associated reference set
    * enumerates all possible references: '1', '2', 'X', 'Y', 'MT', etc.
    */
  var referenceSetId: js.UndefOr[String] = js.native
}

object VariantSet {
  @scala.inline
  def apply(): VariantSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantSet]
  }
  @scala.inline
  implicit class VariantSetOps[Self <: VariantSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withMetadata(value: js.Array[VariantSetMetadata]): Self = {
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
    def withReferenceBounds(value: js.Array[ReferenceBound]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSetId")(js.undefined)
        ret
    }
  }
  
}

