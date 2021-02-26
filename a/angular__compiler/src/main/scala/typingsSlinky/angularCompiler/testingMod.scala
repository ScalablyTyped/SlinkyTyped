package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/compiler/testing", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsSlinky.angularCompiler.testingTestingMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsSlinky.angularCompiler.testingTestingMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typingsSlinky.angularCompiler.testingTestingMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typingsSlinky.angularCompiler.testingTestingMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing", "MockSchemaRegistry")
  @js.native
  class MockSchemaRegistry protected ()
    extends typingsSlinky.angularCompiler.testingTestingMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
