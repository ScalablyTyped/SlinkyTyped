package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.mod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/testing/src/testing", JSImport.Namespace)
@js.native
object srcTestingMod extends js.Object {
  
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsSlinky.angularCompiler.directiveResolverMockMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsSlinky.angularCompiler.ngModuleResolverMockMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockPipeResolver protected ()
    extends typingsSlinky.angularCompiler.pipeResolverMockMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @js.native
  class MockResourceLoader ()
    extends typingsSlinky.angularCompiler.resourceLoaderMockMod.MockResourceLoader
  
  @js.native
  class MockSchemaRegistry protected ()
    extends typingsSlinky.angularCompiler.schemaRegistryMockMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
