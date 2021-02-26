package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/compiler/testing/testing", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsSlinky.angularCompiler.indexMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/testing", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsSlinky.angularCompiler.indexMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/testing", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typingsSlinky.angularCompiler.indexMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/testing", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typingsSlinky.angularCompiler.indexMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing/testing", "MockSchemaRegistry")
  @js.native
  class MockSchemaRegistry protected ()
    extends typingsSlinky.angularCompiler.indexMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
