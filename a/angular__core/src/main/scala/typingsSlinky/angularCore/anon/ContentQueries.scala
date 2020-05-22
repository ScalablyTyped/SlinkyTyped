package typingsSlinky.angularCore.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.angularCore.mod.ContentQueriesFunction
import typingsSlinky.angularCore.mod.HostBindingsFunction
import typingsSlinky.angularCore.mod.ViewQueriesFunction
import typingsSlinky.angularCore.mod.ɵRenderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentQueries[T] extends js.Object {
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T] | Null] = js.undefined
  /**
    * Function executed by the parent template to allow children to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.undefined
}

object ContentQueries {
  @scala.inline
  def apply[T](
    contentQueries: js.UndefOr[Null | ((/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit)] = js.undefined,
    hostBindings: (/* rf */ ɵRenderFlags, T, /* elementIndex */ Double) => Unit = null,
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any] = null,
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any] = null,
    viewQuery: js.UndefOr[Null | ((/* rf */ ɵRenderFlags, T) => Unit)] = js.undefined
  ): ContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentQueries)) __obj.updateDynamic("contentQueries")(if (contentQueries != null) js.Any.fromFunction3(contentQueries.asInstanceOf[(/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit]) else null)
    if (hostBindings != null) __obj.updateDynamic("hostBindings")(js.Any.fromFunction3(hostBindings))
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(viewQuery)) __obj.updateDynamic("viewQuery")(if (viewQuery != null) js.Any.fromFunction2(viewQuery.asInstanceOf[(/* rf */ ɵRenderFlags, T) => Unit]) else null)
    __obj.asInstanceOf[ContentQueries[T]]
  }
}

