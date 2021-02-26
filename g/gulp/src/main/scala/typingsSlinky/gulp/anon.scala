package typingsSlinky.gulp

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinyl.mod.File
import typingsSlinky.vinylFs.anon.Cwd
import typingsSlinky.vinylFs.anon.DirMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(folder: String): ReadWriteStream = js.native
    def apply(folder: String, opts: Cwd): ReadWriteStream = js.native
    def apply(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
    def apply(getFolderPath: js.Function1[/* File */ File, String], opts: DirMode): ReadWriteStream = js.native
  }
}
