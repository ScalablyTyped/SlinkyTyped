package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Clone")
@js.native
class Clone ()
  extends typingsSlinky.nodegit.cloneMod.Clone
/* static members */
object Clone {
  
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  @JSImport("nodegit", "Clone.clone")
  @js.native
  def clone(url: String, localPath: String): js.Promise[typingsSlinky.nodegit.repositoryMod.Repository] = js.native
  @JSImport("nodegit", "Clone.clone")
  @js.native
  def clone(url: String, localPath: String, options: typingsSlinky.nodegit.cloneOptionsMod.CloneOptions): js.Promise[typingsSlinky.nodegit.repositoryMod.Repository] = js.native
  
  @JSImport("nodegit", "Clone.initOptions")
  @js.native
  def initOptions(opts: typingsSlinky.nodegit.cloneOptionsMod.CloneOptions, version: Double): Double = js.native
}
