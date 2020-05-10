package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceSet extends js.Object {
  /** Public id of this reference set, such as `GRCh37`. */
  var assemblyId: js.UndefOr[String] = js.native
  /** Free text description of this reference set. */
  var description: js.UndefOr[String] = js.native
  /** The server-generated reference set ID, unique across all reference sets. */
  var id: js.UndefOr[String] = js.native
  /**
    * Order-independent MD5 checksum which identifies this reference set. The
    * checksum is computed by sorting all lower case hexidecimal string
    * `reference.md5checksum` (for all reference in this set) in
    * ascending lexicographic order, concatenating, and taking the MD5 of that
    * value. The resulting value is represented in lower case hexadecimal format.
    */
  var md5checksum: js.UndefOr[String] = js.native
  /**
    * ID from http://www.ncbi.nlm.nih.gov/taxonomy (for example, 9606 for human)
    * indicating the species which this reference set is intended to model. Note
    * that contained references may specify a different `ncbiTaxonId`, as
    * assemblies may contain reference sequences which do not belong to the
    * modeled species, for example EBV in a human reference genome.
    */
  var ncbiTaxonId: js.UndefOr[Double] = js.native
  /**
    * The IDs of the reference objects that are part of this set.
    * `Reference.md5checksum` must be unique within this set.
    */
  var referenceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `NC_000001.11`.
    */
  var sourceAccessions: js.UndefOr[js.Array[String]] = js.native
  /** The URI from which the references were obtained. */
  var sourceUri: js.UndefOr[String] = js.native
}

object ReferenceSet {
  @scala.inline
  def apply(): ReferenceSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceSet]
  }
  @scala.inline
  implicit class ReferenceSetOps[Self <: ReferenceSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssemblyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assemblyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssemblyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assemblyId")(js.undefined)
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
    def withMd5checksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5checksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withNcbiTaxonId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncbiTaxonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNcbiTaxonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncbiTaxonId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAccessions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAccessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAccessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAccessions")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(js.undefined)
        ret
    }
  }
  
}

