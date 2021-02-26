package typingsSlinky.jsonFormData

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.FileList
import org.scalajs.dom.raw.FormData
import typingsSlinky.jsonFormData.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("json-form-data", JSImport.Namespace)
  @js.native
  val ^ : FormDataFormatter = js.native
  
  type FormDataFormatter = js.Function2[/* json */ ValidJSON, /* opts */ js.UndefOr[FormatOptions], FormData]
  
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
  trait FormatOptions extends StObject {
    
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
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeNullValues(value: Boolean): Self = StObject.set(x, "includeNullValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNullValuesUndefined: Self = StObject.set(x, "includeNullValues", js.undefined)
      
      @scala.inline
      def setInitialFormData(value: InitialFormData): Self = StObject.set(x, "initialFormData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFormDataUndefined: Self = StObject.set(x, "initialFormData", js.undefined)
      
      @scala.inline
      def setMapping(value: /* value */ ValidJSONValue => String | Blob): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      @scala.inline
      def setShowLeafArrayIndexes(value: Boolean): Self = StObject.set(x, "showLeafArrayIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLeafArrayIndexesUndefined: Self = StObject.set(x, "showLeafArrayIndexes", js.undefined)
    }
  }
  
  @js.native
  trait InitialFormData extends StObject {
    
    def append(name: String, value: String): Unit = js.native
    def append(name: String, value: String, fileName: String): Unit = js.native
    def append(name: String, value: Blob): Unit = js.native
    def append(name: String, value: Blob, fileName: String): Unit = js.native
    @JSName("append")
    var append_Original: FnCall = js.native
  }
  
  @js.native
  trait ValidJSON
    extends /* key */ StringDictionary[ValidJSON | ValidJSONValue | js.Array[ValidJSONValue] | FileList]
  object ValidJSON {
    
    @scala.inline
    def apply(): ValidJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidJSON]
    }
  }
  
  type ValidJSONValue = js.UndefOr[String | Double | Boolean | File | Blob | js.Date | Null]
  
  type _To = FormDataFormatter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FormDataFormatter = ^
}
