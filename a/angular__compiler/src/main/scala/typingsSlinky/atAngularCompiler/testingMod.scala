package typingsSlinky.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsSlinky.atAngularCompiler.testingTestingMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsSlinky.atAngularCompiler.testingTestingMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockPipeResolver protected ()
    extends typingsSlinky.atAngularCompiler.testingTestingMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @js.native
  class MockResourceLoader ()
    extends typingsSlinky.atAngularCompiler.testingSrcResourceUnderscoreLoaderUnderscoreMockMod.MockResourceLoader
  
  @js.native
  class MockSchemaRegistry protected ()
    extends typingsSlinky.atAngularCompiler.testingTestingMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
  
}

