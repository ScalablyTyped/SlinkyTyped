package typingsSlinky.jsonFormData.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Formatting options for modifying the final generated FormData object.
  *
  * ## Defaults
  *
  *     const defaultOpts = {
  *       initialFormData: new FormData(),
  *       showLeafArrayIndexes: true,
  *       includeNullValues: false,
  *       mapping: value => {
  *         if (typeof value === 'boolean') {
  *           return +value ? '1' : '0';
  *         }
  *
  *         return value;
  *       }
  *     }
  */
@js.native
trait FormatOptions extends js.Object {
  /**
    * Include null values in output (default: `false`).
    *
    * ## Examples
    *
    *     const json = { foo: 1, bar: null };
    *     const withoutNullValues = asFormData(json, { includeNullValues: false });
    *     // => FormData {
    *     //   foo: '1'
    *     // }
    *     const withNullValues = asFormData(json, { includeNullValues: true });
    *     // => FormData {
    *     //   foo: '1'
    *     //   bar: 'null'
    *     // }
    *
    */
  var includeNullValues: js.UndefOr[Boolean] = js.native
  /**
    * Existing form data which values will be appended to  (default: `new FormData()`).
    * This can be used to support environments that do not have a global FormData object.
    */
  var initialFormData: js.UndefOr[InitialFormData] = js.native
  /**
    * Modify outmost leaf values before calling formData.append. Default behaviour
    * is to output boolean values as '1'/'0' (true/false) and all other values
    * without modification.
    *
    * ## Examples
    *
    *     const json = { foo: true, bar: false };
    *     const data = asFormData(json);
    *     // => FormData {
    *     //   foo: '1',
    *     //   bar: '0',
    *     // }
    *     const mapping = value => `foo_${value}`;
    *     const custom = asFormData(json, { mapping });
    *     // => FormData {
    *     //   foo: 'foo_true',
    *     //   bar: 'foo_false'
    *     // }
    *
    */
  var mapping: js.UndefOr[js.Function1[/* value */ ValidJSONValue, String | Blob]] = js.native
  /**
    * Include index values in arrays (default: `true`).
    *
    * ## Examples
    *
    *     const json = { ids: [1, 2, 3] };
    *     const withArrayIndices = asFormData(json, { showLeafArrayIndex: true });
    *     // => FormData {
    *     //   ids[0]: '1',
    *     //   ids[1]: '2',
    *     //   ids[2]: '3',
    *     // }
    *     const withoutArrayIndices = asFormData(json, { showLeafArrayIndex: false });
    *     // => FormData {
    *     //   ids[]: '1',
    *     //   ids[]: '2',
    *     //   ids[]: '3',
    *     // }
    *
    */
  var showLeafArrayIndexes: js.UndefOr[Boolean] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeNullValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNullValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNullValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNullValues")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFormData(value: InitialFormData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFormData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFormData")(js.undefined)
        ret
    }
    @scala.inline
    def withMapping(value: /* value */ ValidJSONValue => String | Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLeafArrayIndexes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeafArrayIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLeafArrayIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeafArrayIndexes")(js.undefined)
        ret
    }
  }
  
}

