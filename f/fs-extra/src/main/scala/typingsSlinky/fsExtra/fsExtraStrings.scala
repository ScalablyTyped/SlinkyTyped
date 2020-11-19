package typingsSlinky.fsExtra

import typingsSlinky.fsExtra.mod.FsSymlinkType
import typingsSlinky.fsExtra.mod.SymlinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsExtraStrings {
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def junction: junction = "junction".asInstanceOf[junction]
  
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait dir
    extends FsSymlinkType
       with SymlinkType
  
  @js.native
  sealed trait file
    extends FsSymlinkType
       with SymlinkType
  
  @js.native
  sealed trait junction extends FsSymlinkType
}
