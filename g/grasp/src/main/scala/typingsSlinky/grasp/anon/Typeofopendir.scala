package typingsSlinky.grasp.anon

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.Dir
import typingsSlinky.node.fsMod.OpenDirOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofopendir extends StObject {
  
  def apply(path: String, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = js.native
  def apply(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
  ): Unit = js.native
}
