package typingsSlinky.angularCore.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.angularCore.mod.ContentQueriesFunction
import typingsSlinky.angularCore.mod.HostBindingsFunction
import typingsSlinky.angularCore.mod.ViewQueriesFunction
import typingsSlinky.angularCore.mod.ɵRenderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentQueries[T] extends js.Object {
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T] | Null] = js.native
  /**
    * Function executed by the parent template to allow children to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.native
  /**
    * A map of input names.
    *
    * The format is in: `{[actualPropertyName: string]:(string|[string, string])}`.
    *
    * Given:
    * ```
    * class MyComponent {
    *   @Input()
    *   publicInput1: string;
    *
    *   @Input('publicInput2')
    *   declaredInput2: string;
    * }
    * ```
    *
    * is described as:
    * ```
    * {
    *   publicInput1: 'publicInput1',
    *   declaredInput2: ['declaredInput2', 'publicInput2'],
    * }
    * ```
    *
    * Which the minifier may translate to:
    * ```
    * {
    *   minifiedPublicInput1: 'publicInput1',
    *   minifiedDeclaredInput2: [ 'declaredInput2', 'publicInput2'],
    * }
    * ```
    *
    * This allows the render to re-construct the minified, public, and declared names
    * of properties.
    *
    * NOTE:
    *  - Because declared and public name are usually same we only generate the array
    *    `['declared', 'public']` format when they differ.
    *  - The reason why this API and `outputs` API is not the same is that `NgOnChanges` has
    *    inconsistent behavior in that it uses declared names rather than minified or public. For
    *    this reason `NgOnChanges` will be deprecated and removed in future version and this
    *    API will be simplified to be consistent with `outputs`.
    */
  var inputs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
  ] = js.native
  /**
    * A map of output names.
    *
    * The format is in: `{[actualPropertyName: string]:string}`.
    *
    * Which the minifier may translate to: `{[minifiedPropertyName: string]:string}`.
    *
    * This allows the render to re-construct the minified and non-minified names
    * of properties.
    */
  var outputs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
  ] = js.native
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.native
}

object ContentQueries {
  @scala.inline
  def apply[T](): ContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentQueries[T]]
  }
  @scala.inline
  implicit class ContentQueriesOps[Self[t] <: ContentQueries[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentQueries")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutContentQueries: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withContentQueriesNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentQueries")(null)
        ret
    }
    @scala.inline
    def withHostBindings(value: (/* rf */ ɵRenderFlags, T, /* elementIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostBindings")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHostBindings: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? string | [string, string]}
      */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? string}
      */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutViewQuery: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withViewQueryNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQuery")(null)
        ret
    }
  }
  
}

