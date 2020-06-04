package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵɵBaseDef[T] extends js.Object {
  /**
    * Function to create and refresh content queries associated with a given directive.
    */
  var contentQueries: ContentQueriesFunction[T] | Null
  /**
    * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
    * public or minified name.
    */
  val declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
  /**
    * Refreshes host bindings on the associated directive.
    */
  var hostBindings: HostBindingsFunction[T] | Null
  /**
    * A dictionary mapping the inputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Input('alias') propertyName: any;`).
    */
  val inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
  /**
    * A dictionary mapping the outputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Output('alias') propertyName: any;`).
    */
  val outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
  /**
    * Query-related instructions for a directive. Note that while directives don't have a
    * view and as such view queries won't necessarily do anything, there might be
    * components that extend the directive.
    */
  var viewQuery: ViewQueriesFunction[T] | Null
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
  implicit class ɵɵBaseDefOps[Self <: ɵɵBaseDef[_], T] (val x: Self with ɵɵBaseDef[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclaredInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
    ): Self = this.set("declaredInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
    ): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵɵBaseDef with TopLevel[js.Any]
    ): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self = this.set("contentQueries", js.Any.fromFunction3(value))
    @scala.inline
    def setContentQueriesNull: Self = this.set("contentQueries", null)
    @scala.inline
    def setHostBindings(value: (/* rf */ ɵRenderFlags, T, /* elementIndex */ Double) => Unit): Self = this.set("hostBindings", js.Any.fromFunction3(value))
    @scala.inline
    def setHostBindingsNull: Self = this.set("hostBindings", null)
    @scala.inline
    def setViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = this.set("viewQuery", js.Any.fromFunction2(value))
    @scala.inline
    def setViewQueryNull: Self = this.set("viewQuery", null)
  }
  
}

