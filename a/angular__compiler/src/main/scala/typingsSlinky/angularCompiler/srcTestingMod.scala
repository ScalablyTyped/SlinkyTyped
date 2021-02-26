package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTestingMod {
  
  @JSImport("@angular/compiler/testing/src/testing", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsSlinky.angularCompiler.directiveResolverMockMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/src/testing", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsSlinky.angularCompiler.ngModuleResolverMockMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/src/testing", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typingsSlinky.angularCompiler.pipeResolverMockMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/src/testing", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typingsSlinky.angularCompiler.resourceLoaderMockMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing/src/testing", "MockSchemaRegistry")
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
