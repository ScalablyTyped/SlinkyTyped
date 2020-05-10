package typingsSlinky.opentracing.tracerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanOptions extends js.Object {
  /**
    * a parent SpanContext (or Span, for convenience) that the newly-started
    * span will be the child of (per REFERENCE_CHILD_OF). If specified,
    * `references` must be unspecified.
    */
  var childOf: js.UndefOr[
    typingsSlinky.opentracing.spanMod.default | typingsSlinky.opentracing.spanContextMod.default
  ] = js.native
  /**
    * an array of Reference instances, each pointing to a causal parent
    * SpanContext. If specified, `fields.childOf` must be unspecified.
    */
  var references: js.UndefOr[js.Array[typingsSlinky.opentracing.referenceMod.default]] = js.native
  /**
    * a manually specified start time for the created Span object. The time
    * should be specified in milliseconds as Unix timestamp. Decimal value are
    * supported to represent time values with sub-millisecond accuracy.
    */
  var startTime: js.UndefOr[Double] = js.native
  /**
    * set of key-value pairs which will be set as tags on the newly created
    * Span. Ownership of the object is passed to the created span for
    * efficiency reasons (the caller should not modify this object after
    * calling startSpan).
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SpanOptions {
  @scala.inline
  def apply(): SpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanOptions]
  }
  @scala.inline
  implicit class SpanOptionsOps[Self <: SpanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildOf(
      value: typingsSlinky.opentracing.spanMod.default | typingsSlinky.opentracing.spanContextMod.default
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childOf")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: js.Array[typingsSlinky.opentracing.referenceMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

