package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclareClass
import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareFunction
import typingsSlinky.babelTypes.babelTypesStrings.DeclareInterface
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModule
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModuleExports
import typingsSlinky.babelTypes.babelTypesStrings.DeclareOpaqueType
import typingsSlinky.babelTypes.babelTypesStrings.DeclareTypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.DeclareVariable
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.OpaqueType
import typingsSlinky.babelTypes.babelTypesStrings.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.DeclareClass_
  - typingsSlinky.babelTypes.mod.DeclareFunction_
  - typingsSlinky.babelTypes.mod.DeclareInterface_
  - typingsSlinky.babelTypes.mod.DeclareModule_
  - typingsSlinky.babelTypes.mod.DeclareModuleExports_
  - typingsSlinky.babelTypes.mod.DeclareTypeAlias_
  - typingsSlinky.babelTypes.mod.DeclareOpaqueType_
  - typingsSlinky.babelTypes.mod.DeclareVariable_
  - typingsSlinky.babelTypes.mod.DeclareExportDeclaration_
  - typingsSlinky.babelTypes.mod.DeclareExportAllDeclaration_
  - typingsSlinky.babelTypes.mod.InterfaceDeclaration_
  - typingsSlinky.babelTypes.mod.OpaqueType_
  - typingsSlinky.babelTypes.mod.TypeAlias_
*/
trait FlowDeclaration extends _Node
object FlowDeclaration {
  
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): FlowDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): FlowDeclaration = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): FlowDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
}
