package typingsSlinky.mockDashFs.libFilesystemMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryItems
  extends /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typingsSlinky.mockDashFs.libFileMod.^  | typingsSlinky.mockDashFs.libDirectoryMod.^  | typingsSlinky.mockDashFs.libSymlinkMod.^ 
      ]) | DirectoryItems
    ]

object DirectoryItems {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typingsSlinky.mockDashFs.libFileMod.^  | typingsSlinky.mockDashFs.libDirectoryMod.^  | typingsSlinky.mockDashFs.libSymlinkMod.^ 
      ]) | DirectoryItems
    ] = null
  ): DirectoryItems = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DirectoryItems]
  }
}

