package typingsSlinky.expoFileSystem

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.expoFileSystem.fileSystemTypesMod.ExponentFileSystemModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentFileSystemWebMod extends Shortcut {
  
  @JSImport("expo-file-system/build/ExponentFileSystem.web", JSImport.Default)
  @js.native
  val default: ExponentFileSystemModule = js.native
  
  type _To = ExponentFileSystemModule
  
  /* This means you don't have to write `default`, but can instead just say `exponentFileSystemWebMod.foo` */
  override def _to: ExponentFileSystemModule = default
}
