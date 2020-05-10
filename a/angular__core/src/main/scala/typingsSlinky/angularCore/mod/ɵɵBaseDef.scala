package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵɵBaseDef[T] extends js.Object {
  /**
    * Function to create and refresh content queries associated with a given directive.
    */
  var contentQueries: ContentQueriesFunction[T] | Null = js.native
  /**
    * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
    * public or minified name.
    */
  val declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any] = js.native
  /**
    * Refreshes host bindings on the associated directive.
    */
  var hostBindings: HostBindingsFunction[T] | Null = js.native
  /**
    * A dictionary mapping the inputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Input('alias') propertyName: any;`).
    */
  val inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any] = js.native
  /**
    * A dictionary mapping the outputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Output('alias') propertyName: any;`).
    */
  val outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any] = js.native
  /**
    * Query-related instructions for a directive. Note that while directives don't have a
    * view and as such view queries won't necessarily do anything, there might be
    * components that extend the directive.
    */
  var viewQuery: ViewQueriesFunction[T] | Null = js.native
}

object ɵɵBaseDef {
  @scala.inline
  def apply[T](
    declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any],
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any],
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
  ): ɵɵBaseDef[T] = {
    val __obj = js.Dynamic.literal(declaredInputs = declaredInputs.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵɵBaseDef[T]]
  }
  @scala.inline
  implicit class ɵɵBaseDefOps[Self[t] <: ɵɵBaseDef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeclaredInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaredInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentQueries")(js.Any.fromFunction3(value))
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
    def withHostBindingsNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostBindings")(null)
        ret
    }
    @scala.inline
    def withViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQuery")(js.Any.fromFunction2(value))
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

