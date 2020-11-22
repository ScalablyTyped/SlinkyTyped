package typingsSlinky.mockFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object filesystemMod {
  
  type DirectoryItem = java.lang.String | typingsSlinky.node.Buffer | (js.Function0[
    typingsSlinky.mockFs.fileMod.^  | typingsSlinky.mockFs.directoryMod.^  | typingsSlinky.mockFs.symlinkMod.^ 
  ]) | typingsSlinky.mockFs.filesystemMod.DirectoryItems
}
