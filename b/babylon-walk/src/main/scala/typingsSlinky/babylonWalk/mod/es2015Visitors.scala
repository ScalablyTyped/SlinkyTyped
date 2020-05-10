package typingsSlinky.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait es2015Visitors[V] extends js.Object {
  var ArrayPattern: js.UndefOr[V] = js.native
  var ArrowFunctionExpression: js.UndefOr[V] = js.native
  var AssignmentPattern: js.UndefOr[V] = js.native
  var AwaitExpression: js.UndefOr[V] = js.native
  var BindExpression: js.UndefOr[V] = js.native
  var ClassBody: js.UndefOr[V] = js.native
  var ClassDeclaration: js.UndefOr[V] = js.native
  var ClassExpression: js.UndefOr[V] = js.native
  var ClassMethod: js.UndefOr[V] = js.native
  var ClassProperty: js.UndefOr[V] = js.native
  var Decorator: js.UndefOr[V] = js.native
  var DoExpression: js.UndefOr[V] = js.native
  var ExportAllDeclaration: js.UndefOr[V] = js.native
  var ExportDefaultDeclaration: js.UndefOr[V] = js.native
  var ExportDefaultSpecifier: js.UndefOr[V] = js.native
  var ExportNamedDeclaration: js.UndefOr[V] = js.native
  var ExportNamespaceSpecifier: js.UndefOr[V] = js.native
  var ExportSpecifier: js.UndefOr[V] = js.native
  var ForOfStatement: js.UndefOr[V] = js.native
  var ImportDeclaration: js.UndefOr[V] = js.native
  var ImportDefaultSpecifier: js.UndefOr[V] = js.native
  var ImportNamespaceSpecifier: js.UndefOr[V] = js.native
  var ImportSpecifier: js.UndefOr[V] = js.native
  var MetaProperty: js.UndefOr[V] = js.native
  var ObjectPattern: js.UndefOr[V] = js.native
  var SpreadElement: js.UndefOr[V] = js.native
  var Super: js.UndefOr[V] = js.native
  var TaggedTemplateExpression: js.UndefOr[V] = js.native
  var TemplateElement: js.UndefOr[V] = js.native
  var TemplateLiteral: js.UndefOr[V] = js.native
  var YieldExpression: js.UndefOr[V] = js.native
}

object es2015Visitors {
  @scala.inline
  def apply[V](): es2015Visitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[es2015Visitors[V]]
  }
  @scala.inline
  implicit class es2015VisitorsOps[Self[v] <: es2015Visitors[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withArrayPattern(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayPattern: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowFunctionExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowFunctionExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentPattern(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentPattern: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withAwaitExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withBindExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withClassBody(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassBody: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(js.undefined)
        ret
    }
    @scala.inline
    def withClassDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withClassExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withClassMethod(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassMethod: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withClassProperty(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassProperty: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorator(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorator: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(js.undefined)
        ret
    }
    @scala.inline
    def withDoExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAllDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAllDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDefaultDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportDefaultDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDefaultSpecifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportDefaultSpecifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExportNamedDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportNamedDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withExportNamespaceSpecifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportNamespaceSpecifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSpecifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSpecifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withForOfStatement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForOfStatement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDefaultSpecifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDefaultSpecifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImportNamespaceSpecifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportNamespaceSpecifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImportSpecifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportSpecifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaProperty(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaProperty: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectPattern(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPattern: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadElement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadElement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSuper(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuper: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Super")(js.undefined)
        ret
    }
    @scala.inline
    def withTaggedTemplateExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaggedTemplateExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateElement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateElement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateLiteral(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateLiteral: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(js.undefined)
        ret
    }
    @scala.inline
    def withYieldExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYieldExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(js.undefined)
        ret
    }
  }
  
}

