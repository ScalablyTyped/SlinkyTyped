package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  /** The annotation set to which this annotation belongs. */
  var annotationSetId: js.UndefOr[String] = js.native
  /** The end position of the range on the reference, 0-based exclusive. */
  var end: js.UndefOr[String] = js.native
  /** The server-generated annotation ID, unique across all annotations. */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The display name of this annotation. */
  var name: js.UndefOr[String] = js.native
  /** The ID of the Google Genomics reference associated with this range. */
  var referenceId: js.UndefOr[String] = js.native
  /**
    * The display name corresponding to the reference specified by
    * `referenceId`, for example `chr1`, `1`, or `chrX`.
    */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * Whether this range refers to the reverse strand, as opposed to the forward
    * strand. Note that regardless of this field, the start/end position of the
    * range always refer to the forward strand.
    */
  var reverseStrand: js.UndefOr[Boolean] = js.native
  /** The start position of the range on the reference, 0-based inclusive. */
  var start: js.UndefOr[String] = js.native
  /**
    * A transcript value represents the assertion that a particular region of
    * the reference genome may be transcribed as RNA. An alternative splicing
    * pattern would be represented as a separate transcript object. This field
    * is only set for annotations of type `TRANSCRIPT`.
    */
  var transcript: js.UndefOr[Transcript] = js.native
  /**
    * The data type for this annotation. Must match the containing annotation
    * set's type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A variant annotation, which describes the effect of a variant on the
    * genome, the coding sequence, and/or higher level consequences at the
    * organism level e.g. pathogenicity. This field is only set for annotations
    * of type `VARIANT`.
    */
  var variant: js.UndefOr[VariantAnnotation] = js.native
}

object Annotation {
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
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
    def withInfo(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
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
    def withReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseStrand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStrand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseStrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseStrand")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscript(value: Transcript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: VariantAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

