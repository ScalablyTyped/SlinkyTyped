package typingsSlinky.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlink {
  
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.node.nodeStrings.dir
    - typingsSlinky.node.nodeStrings.file
    - typingsSlinky.node.nodeStrings.junction
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def dir: typingsSlinky.node.nodeStrings.dir = "dir".asInstanceOf[typingsSlinky.node.nodeStrings.dir]
    
    @scala.inline
    def file: typingsSlinky.node.nodeStrings.file = "file".asInstanceOf[typingsSlinky.node.nodeStrings.file]
    
    @scala.inline
    def junction: typingsSlinky.node.nodeStrings.junction = "junction".asInstanceOf[typingsSlinky.node.nodeStrings.junction]
  }
}
