package typingsSlinky.jestCli

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cli/build/init/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class MalformedPackageJsonError protected () extends Error {
    def this(packageJsonPath: String) = this()
  }
  
  @js.native
  class NotFoundPackageJsonError protected () extends Error {
    def this(rootDir: String) = this()
  }
}
