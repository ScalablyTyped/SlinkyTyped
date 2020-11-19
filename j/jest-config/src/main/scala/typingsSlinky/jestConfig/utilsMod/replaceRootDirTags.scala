package typingsSlinky.jestConfig.utilsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jestConfig.jestConfigStrings._replaceRootDirTags
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-config/build/utils", "_replaceRootDirTags")
@js.native
object replaceRootDirTags extends js.Object {
  
  def apply(rootDir: Path, config: String): String = js.native
  def apply(rootDir: Path, config: js.Array[Path | js.RegExp | ReplaceRootDirConfigObj]): js.Array[ReplaceRootDirConfigObj] = js.native
  def apply(rootDir: Path, config: js.RegExp): js.RegExp = js.native
  def apply[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @jest/types.@jest/types/build/Config.Path}
    */ _replaceRootDirTags with TopLevel[js.Any] */](rootDir: Path, config: T): T = js.native
}
