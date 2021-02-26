package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@angular/compiler/testing/index", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsSlinky.angularCompiler.testingPublicApiMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/index", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsSlinky.angularCompiler.testingPublicApiMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/index", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typingsSlinky.angularCompiler.testingPublicApiMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/index", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typingsSlinky.angularCompiler.testingPublicApiMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing/index", "MockSchemaRegistry")
  @js.native
  class MockSchemaRegistry protected ()
    extends typingsSlinky.angularCompiler.testingPublicApiMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
