package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  /** The server-generated reference ID, unique across all references. */
  var id: js.UndefOr[String] = js.native
  /** The length of this reference's sequence. */
  var length: js.UndefOr[String] = js.native
  /**
    * MD5 of the upper-case sequence excluding all whitespace characters (this
    * is equivalent to SQ:M5 in SAM). This value is represented in lower case
    * hexadecimal format.
    */
  var md5checksum: js.UndefOr[String] = js.native
  /** The name of this reference, for example `22`. */
  var name: js.UndefOr[String] = js.native
  /** ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human. */
  var ncbiTaxonId: js.UndefOr[Double] = js.native
  /**
    * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally
    * with a version number, for example `GCF_000001405.26`.
    */
  var sourceAccessions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI from which the sequence was obtained. Typically specifies a FASTA
    * format file.
    */
  var sourceUri: js.UndefOr[String] = js.native
}

object Reference {
  @scala.inline
  def apply(): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
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

